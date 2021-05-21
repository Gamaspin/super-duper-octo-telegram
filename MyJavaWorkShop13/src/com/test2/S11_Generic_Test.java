package com.test2;
import java.util.*;


class TestClass {
	//public static void addNums(List<? super Integer> list) {
	public static void addNums(List<? extends Number> list) {
		for(Object o : list) {
			System.out.println(o);
		}
	}
}

public class S11_Generic_Test {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30);
		System.out.println(list.getClass().getName());
		TestClass.addNums(list);
		
	}
}
