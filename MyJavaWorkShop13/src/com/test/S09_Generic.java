package com.test;
import java.util.*;

class A {}
class B extends A {}

public class S09_Generic {
	static void test(Object o) {}

	static void test1(A a) {}
	static	void test2(B b) {}

	//	public static void test3(T o) {		//ĳ����(����ȯ)�� �ʿ䰡 ����
	//	}
	//	static <T extends Object> void test3(T o) {}
	static void test4(ArrayList<?> al) {}

	public static void main(String[] args) {

	}
}
