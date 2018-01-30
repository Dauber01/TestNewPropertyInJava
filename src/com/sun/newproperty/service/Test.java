package com.sun.newproperty.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ha a1 = new Ha("a1",1);
		Ha a2 = new Ha("a1",2);
		Ha a3 = new Ha("a2",1);
		Ha a4 = new Ha("a3",9);
		Ha a5 = new Ha("a2",1);
		Ha a6 = new Ha("a1",5);
		Ha a7 = new Ha("a3",1);
		List<Ha> list = Arrays.asList(a1,a2,a3,a4,a5,a6,a7);
		Map<String,Integer> map = new HashMap<String, Integer>();
			list.stream().map(e -> map.put(e.name, e.code + ((null==map.get(e.name))?0:map.get(e.name)))).count();
		System.out.println(map);
	}

}

class Ha{
	public String name;
	public Integer code;
	
	public Ha() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ha(String name, Integer code) {
		super();
		this.name = name;
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	
}