package com.test;

public class S05_GenericMethod {
	static <T> void printMsg(T[] names) {
		for(T s : names) {
			System.out.println(s);
		}
	}

	static <E> void printMsg2(E[] names) {
		for(E d : names) {
			System.out.println(d);
		}
	}
	static <E> void add(E a, E b) {
		E temp = a;
		E x = b;
		E y = temp;
		System.out.println(x + " + " + y);
	}
	
	public static void main(String[] args) {
		String[] names = {"qwe", "asd", "sgfs"} ;
		printMsg(names);

		Integer[] arr = {11,22,33,44};
		printMsg(arr);
		
		Integer a1 = 10;
		Integer b1 = 20;
		add(a1, b1);

	}
}
