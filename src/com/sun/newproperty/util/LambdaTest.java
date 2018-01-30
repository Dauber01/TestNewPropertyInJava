package com.sun.newproperty.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * 新特性二,lambda表达式缩短代码的长度
 * @author Lucifer
 *
 */
public class LambdaTest {
	
	public static void main(String[] args) {
		oldMethod();
		lambdaMethod();
	}
	
	public static void oldMethod() {
		List<String> names = Arrays.asList("lucifer","tom","stack","lanist");
		Collections.sort(names,new Comparator<String>() {
			@Override
			public int compare(String a,String b) {
				return b.compareTo(a);
			}
		});
		System.out.println("oldMethod" + names.toString());
	}
	
	public static void lambdaMethod() {
		List<String> names = Arrays.asList("lucifer","tom","stack","lanist");
		Collections.sort(names, (a,b) -> b.compareTo(a));
		System.out.println("lambdaMethod" + names.toString());
	}

}
