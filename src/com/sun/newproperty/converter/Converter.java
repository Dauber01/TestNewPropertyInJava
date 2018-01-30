package com.sun.newproperty.converter;
/**
 * 新特性三,FunctionInterface 
 * @author Lucifer
 *
 * @param <F>
 * @param <T>
 */
@FunctionalInterface
public interface Converter<F,T> {

	T convert(F from);
	
}
