package com.test;

class Animal {}
class Dog extends Animal{}
class Cat extends Animal{}
class Fish {}

class Manager<T extends Animal> {	// T�� Ÿ�ԸŰ�����
	T animal;						//extends�� ���� ���ѽ�Ŵ
	Manager(T animal) {
		this.animal = animal;
	}
	public T getObject() {
		return this.animal;
				
	}
	
}


public class S06_Generic_Extends {
	public static void main(String[] args) {
		Manager<Dog> dog = new Manager<>(new Dog());
		Manager<Cat> cat = new Manager<>(new Cat());
		//Manager<Fish> fish = new Manager<>(new Fish());
		
	}
}
