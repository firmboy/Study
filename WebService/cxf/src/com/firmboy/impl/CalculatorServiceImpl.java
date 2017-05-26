package com.firmboy.impl;

import javax.jws.WebService;

import com.firmboy.CalculatorService;

@WebService(endpointInterface="com.firmboy.CalculatorService",serviceName="calculator")
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public String concat(String a, String b) {
		return a+b;
	}

}
