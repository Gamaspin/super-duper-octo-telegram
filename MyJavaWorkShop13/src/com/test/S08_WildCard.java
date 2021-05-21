package com.test;
import java.util.*;

public class S08_WildCard {
	
	static void test(ArrayList<?> al) {
		for(Object o : al) {
			System.out.println(o);
		}
	}
//	static void test2(? a) {
//	}		//이렇게는 못 씀
	
public static void main(String[] args) {
	
	//ArrayList<?> al = new ArrayList<Integer>();
	//모든 타입 다 가능
	test(new ArrayList<Integer>());
	test(new ArrayList<String>());
	
	
}
}
