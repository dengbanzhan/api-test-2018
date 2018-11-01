package com.edu.htmlunitdemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.HttpMethod;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebRequest;
import com.gargoylesoftware.htmlunit.WebResponse;

public class GetDemo {

	String baseUrl="http://127.0.0.1:8080/Supermarket/analysis/lookupprice?goodsCode={\"pId\":\"123456\"}";
	String url="/common/skuList?goodsId=1";
	@Test
	public void get1() throws Exception {
//1.����WebClient����
		WebClient client = new WebClient();
//2.����	WebRequest����
		WebRequest request =new WebRequest(new URL(baseUrl),HttpMethod.GET);
//3.ִ������
		Page page=client.getPage(request);
//4.�����Ӧ
		WebResponse response=page.getWebResponse();
//5.�����Ӧ����
		String result=response.getContentAsString();
		System.out.println(result);
//6.�ر�Client����
		client.close();
		
	}
}
