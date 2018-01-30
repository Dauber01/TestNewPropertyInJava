package com.sun.newproperty.service;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<String,Integer>();
		Integer i = map.get("hah");
		if(i.equals(null)) {
			System.out.println("true");
		}
		System.out.println(i);
	}

}
