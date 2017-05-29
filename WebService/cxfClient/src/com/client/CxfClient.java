package com.client;

import com.firmboy.CalculatorService;
import com.firmboy.impl.Calculator;

public class CxfClient {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
        CalculatorService service = calc.getCalculatorServiceImplPort();
        int a = service.add(3, 7);
        String b = service.concat("what's ", "that about?");
        System.out.println(a);
        System.out.println(b);
	}
}
