package com.sun.newproperty.converter;
/**
 * ��������,FunctionInterface 
 * @author Lucifer
 *
 * @param <F>
 * @param <T>
 */
@FunctionalInterface
public interface Converter<F,T> {

	T convert(F from);
	
}
