package com.sun.newproperty.service;
/**
 * 特性一,interface可以加方法体，修饰要用default,该性能叫做拓展方法 
 * @author Lucifer
 *
 */
public interface DataService {

	default void test() {
		double number = Math.random();
		System.out.println(number);
	}
	
}
