package com.sun.newproperty.util;

import com.sun.newproperty.converter.Converter;

public class FunctionInterfaceTest {

	public static void test() {
		Converter<String, Integer> converter = from -> Integer.valueOf(from);
		Integer number = converter.convert("123");
		System.out.println(number);
	}
	
}
