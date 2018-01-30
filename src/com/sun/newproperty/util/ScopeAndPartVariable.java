package com.sun.newproperty.util;

import com.sun.newproperty.converter.Converter;

/**
 * ������5/6,������;ֲ�����������
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
	
	//�ֲ�������lambda���ʽ���ú�,�����ں���Ĵ����н��и���
	public static void tsetThr() {
		int num = 1;
		//Converter<Integer, String> converter = from -> String.valueOf(num + from);
		num +=3;
		//System.out.println(converter.convert(2));
	}

}
