package com.sun.newproperty.service;
/**
 * ����һ,interface���Լӷ����壬����Ҫ��default,�����ܽ�����չ���� 
 * @author Lucifer
 *
 */
public interface DataService {

	default void test() {
		double number = Math.random();
		System.out.println(number);
	}
	
}
