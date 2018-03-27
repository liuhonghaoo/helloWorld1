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
		//��Ϊ����ֱ��ʹ��request���󣬰�requestת���ɶಿ���������
		MultipartHttpServletRequest ms = (MultipartHttpServletRequest) request;
		//����request����������е��ļ����ֻ�ȡ�ļ�����
		CommonsMultipartFile cm =  (CommonsMultipartFile) ms.getFile(fileName);
		//��ȡ�ļ���
		byte[] bb = cm.getBytes();
		//�ļ������ڷ������п����ظ�
		String newFileName = "";
		SimpleDateFormat sd = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		newFileName = sd.format(new Date());
		//���������
		Random r = new Random();
		for(int i = 0;i<3;i++){
			newFileName = newFileName + r.nextInt(10);
		}
		//��ȡ�ļ�����չ��
		String originalFilename = cm.getOriginalFilename();
		String suffName = originalFilename.substring(originalFilename.lastIndexOf("."));
		//��ȡ�ļ���ȫ��
		String fullName = Commons.HOST_PATH + "/upload/" + newFileName + suffName;
		//�����ͻ���
		Client client = Client.create();
		//���ļ�������Զ�̷�����
		WebResource webResource = client.resource(fullName);
		//�ϴ�
		webResource.put(String.class, bb);
		//ͼƬ��Ҫ���ԣ���ҪͼƬ����·��
		String result = "{\"fullName\":\""+fullName+"\"}";
		out.print(result);
	}
}
