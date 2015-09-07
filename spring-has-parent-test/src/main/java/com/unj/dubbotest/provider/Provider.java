package com.unj.dubbotest.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:dubbo-provider.xml");

		applicationContext.start();

		System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
	}

}
