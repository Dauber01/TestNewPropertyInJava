package com.sun.newproperty.util;

import com.sun.newproperty.converter.Converter;

/**
 * 新特性5/6,作用域和局部变量的引用
 * @author Lucifer
 *
 */
public class ScopeAndPartVariable {
	
	public static void testFir() {
		final int num = 1;
		Converter<Integer, String> converter = (from) -> String.valueOf(num + from);
		System.out.println(converter.convert(2));
	}
	
	public static void testSec() {
		int num = 1;
		Converter<Integer, String> converter = from -> String.valueOf(num + from);
		System.out.println(converter.convert(2));
	}
	
	//局部变量被lambda表达式引用后,不可在后面的代码中进行更改
	public static void tsetThr() {
		int num = 1;
		//Converter<Integer, String> converter = from -> String.valueOf(num + from);
		num +=3;
		//System.out.println(converter.convert(2));
	}

}
