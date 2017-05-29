package com.firmboy;

import javax.xml.ws.Endpoint;

import com.firmboy.impl.CalculatorServiceImpl;

public class WebService {
	public static void main(String[] args) {
        System.out.println("web service start");
        CalculatorServiceImpl implementor = new CalculatorServiceImpl();
        String address = "http://localhost:8080/calculator";//����������ע�����Ѿ���������URL
        Endpoint.publish(address, implementor);
        System.out.println("web service started");
    }
}