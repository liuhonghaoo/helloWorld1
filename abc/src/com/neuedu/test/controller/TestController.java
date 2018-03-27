package com.neuedu.test.controller;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.neuedu.test.util.Commons;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

@Controller
@RequestMapping("/upload")
public class TestController {

	@RequestMapping(value="/uploadPic")
	@ResponseBody
	public void showPicture(HttpServletRequest request,String fileName,PrintWriter out){
		//因为不能直接使用request请求，把request转换成多部件请求对象
		MultipartHttpServletRequest ms = (MultipartHttpServletRequest) request;
		//根据request的请求对象中的文件名字获取文件对象
		CommonsMultipartFile cm =  (CommonsMultipartFile) ms.getFile(fileName);
		//获取文件流
		byte[] bb = cm.getBytes();
		//文件名称在服务器有可能重复
		String newFileName = "";
		SimpleDateFormat sd = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		newFileName = sd.format(new Date());
		//生成随机数
		Random r = new Random();
		for(int i = 0;i<3;i++){
			newFileName = newFileName + r.nextInt(10);
		}
		//获取文件的扩展名
		String originalFilename = cm.getOriginalFilename();
		String suffName = originalFilename.substring(originalFilename.lastIndexOf("."));
		//获取文件的全名
		String fullName = Commons.HOST_PATH + "/upload/" + newFileName + suffName;
		//创建客户端
		Client client = Client.create();
		//把文件关联到远程服务器
		WebResource webResource = client.resource(fullName);
		//上传
		webResource.put(String.class, bb);
		//图片需要回显，需要图片完整路径
		String result = "{\"fullName\":\""+fullName+"\"}";
		out.print(result);
	}
}
