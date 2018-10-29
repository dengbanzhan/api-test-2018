package com.edu.demo1029;

import java.io.IOException;

import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;

import net.sf.json.JSONObject;

public class PostDemo {
	@Test
	public void login() throws IOException, Exception {
		JSONObject user = new JSONObject();
		user.element("phoneArea", "86");
		user.element("phoneNumber", "20000000000");
		user.element("password", "netease123");

		String result = HttpDriver.doPost(ReadPro.getProValue("url") + "/common/fgadmin/login", user);
		System.out.println(result);
	}

	@Test
	public void login1() throws IOException, Exception {

	}

	@Test
	public void addAdress() throws Exception {
	
		CookieStore cookie = Common.getLoginCookie();

		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";

		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "����");
		address.element("cellPhone", "18788990011");
		address.element("province", "������");
		address.element("city", "������");
		address.element("area", "");
		address.element("addressDetail", "��ɽ·125��");
		String result = HttpDriver.doPost(url, address, cookie);
		System.out.println(result);

	}

}
