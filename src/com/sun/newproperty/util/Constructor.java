package com.sun.newproperty.util;

import com.sun.newproperty.converter.Converter;

/**
 * 新特性4,方法和构造器的引用
 * @author Lucifer
 *
 */
public class Constructor {

	public static void test() {
		Converter<String, Integer> converter = Integer :: valueOf;
		Integer converted = converter.convert("123");
		System.out.println(converted);
		
		//Converter<String, String> converter = something :: startsWith;
		PersonFactory<Person> personFactory = Person :: new;
		Person person = personFactory.create("hello", "kity");
		System.out.println(person);
	}
	
}

class Person{
	String firstName;
	String lastName;
	
	public Person() {
	}
	
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
}

interface PersonFactory<P extends Person>{
	P create(String firstName,String lastName);
}