package com.test;
import java.util.*;

public class S08_WildCard {
	
	static void test(ArrayList<?> al) {
		for(Object o : al) {
			System.out.println(o);
		}
	}
//	static void test2(? a) {
//	}		//�̷��Դ� �� ��
	
public static void main(String[] args) {
	
	//ArrayList<?> al = new ArrayList<Integer>();
	//��� Ÿ�� �� ����
	test(new ArrayList<Integer>());
	test(new ArrayList<String>());
	
	
}
}
