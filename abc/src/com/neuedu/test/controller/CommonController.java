package com.neuedu.test.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;
import org.springframework.web.servlet.mvc.AbstractController;

import com.neuedu.test.bean.User;

public class CommonController extends AbstractCommandController{

	//指定把参数封装到哪个对象
	public CommonController(){
		this.setCommandClass(User.class);
	}
	
	@Override
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException exception)
			throws Exception {
		//值被封装到命令对象中
		User user = (User) command;
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", user);
		mv.setViewName("/index");
		return mv;
	}

	//springMVC提供的内部时间类型转换
	@Override
	protected void initBinder(HttpServletRequest request,
			ServletRequestDataBinder binder) throws Exception {
		String birthday = request.getParameter("birthday");
		if(birthday.contains("/")){
			binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy/MM/dd"), true));
		}else{
			binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
		}
		
	}
}
