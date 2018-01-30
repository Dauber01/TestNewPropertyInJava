package com.sun.newproperty.util;

import com.sun.newproperty.converter.Converter;

/**
 * lambda表达式,静态变量和实例变量可以更改
 * @author Lucifer
 *
 */
public class InstanceAndStaticVariable {
	
	static int outerStaticNum;
    int outerNum;
    public void testScopes() {
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(outerNum + from);
        };
        System.out.println(stringConverter1.convert(1));
        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(outerStaticNum + from);
        };
        System.out.println(stringConverter2.convert(1));
    }
	public InstanceAndStaticVariable() {
		super();
		// TODO Auto-generated constructor stub
	}
    

}
