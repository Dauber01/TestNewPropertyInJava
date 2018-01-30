package com.sun.newproperty.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * lambda表达式的属性，和具体的覆盖类实现
 * @author Lucifer
 *
 */
public class LambdaPropertyTest {
	
	public static void test() {
		List<String> stringCollection = Arrays.asList("ddd2","aaa2","bbb1","aaa1","bbb3","ccc","bbb2","ddd1");
		//fillter过滤
		//stringCollection.stream().filter((s) -> s.startsWith("a")).forEach(System.out::println);
		//sort排序
		//stringCollection.stream().sorted().filter((s) -> s.startsWith("a")).forEach(System.out::println);
		//System.out.println(stringCollection);
		//stringCollection.stream().map(String::toUpperCase).sorted((a,b) -> b.compareTo(a)).forEach(System.out::println);
		//boolean anyStartWithA = stringCollection.stream().anyMatch((s) -> s.startsWith("a"));
		//System.out.println(anyStartWithA);
		//boolean allStartWithA = stringCollection.stream().allMatch((s) -> s.startsWith("a"));
		//System.out.println(allStartWithA);
		//boolean nonStartWithZ = stringCollection.stream().noneMatch((s) -> s.startsWith("z"));
		//System.out.println(nonStartWithZ);
		//long startsWithB = stringCollection.stream().filter((s) -> s.startsWith("b")).count();
		//System.out.println(startsWithB);
		Optional<String> reduced = stringCollection.stream().sorted().reduce((a ,b) -> a + "#" + b);
		reduced.ifPresent(System.out::println);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2();
	}

	public static void test1() {
		int max = 1000000;
		List<String> values = new ArrayList<String>(max);
		for(int i = 0;i < max;i++) {
			UUID uuid = UUID.randomUUID();
			values.add(uuid.toString());
		}
		long l0 = System.nanoTime();
		long count = values.parallelStream().sorted().count();
		//long count = values.Stream().sorted().count();
		System.out.println(count);
		long l1 = System.nanoTime();
		long millis = TimeUnit.NANOSECONDS.toMillis(l1 - l0);
		System.out.println(String.format("parallel sort took: %d ms", millis));
	}

	public static void test2() {
		Map<Integer, String> map = new HashMap<Integer,String>();
		for(int i = 0;i < 10;i++) {
			map.putIfAbsent(i, "var" + i);
		}
		//map.forEach((a,b) -> System.out.println(b));;
		//map.computeIfPresent(3, (num,val) -> val + num);
		//System.out.println(map.get(3));
		//map.computeIfPresent(9, (mun,val) -> null);
		//System.out.println(map.containsKey(9));
		//map.computeIfAbsent(23, (num) -> "val" + num);
		//System.out.println(map.containsKey(23));
		//map.computeIfAbsent(3, num -> "com");
		//System.out.println(map.get(3));
		//map.remove(3,"var");
		//System.out.println(map.get(3));
		//map.remove(3,"var3");
		//System.out.println(map.get(3));
		//System.out.println(map.getOrDefault(42, "not found"));
		map.merge(9, "var10", (num,val) -> num.concat(val));
		System.out.println(map.get(9));
		map.merge(9, "value", (value,newValue) -> newValue.concat(value));
		System.out.println(map.get(9));
	}
}
