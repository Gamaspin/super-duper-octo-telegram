package com.test;

class Student2<T> {
	T s;
	Student2(T s) {
		this.s =s;
	}
	public T gets() {
		return this.s;
	}
}
//class Student2<String> {		//�̷��� ���� �Ȱ���
//	String s;
//	Student2(String s) {
//		this.s =s;
//	}
//	public String gets() {
//		return this.s;
//	}
//}

public class S03_Generics {
	public static void main(String[] args) {
		Student2<String> stu = new Student2<String>("�̼���");
		System.out.println(stu.gets());
	}
}
