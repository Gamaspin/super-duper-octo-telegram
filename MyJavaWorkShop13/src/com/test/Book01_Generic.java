package com.test;
import java.util.ArrayList;

class Fruit implements Eatable {
	public String toString() { return "Fruit1"; }	}
class Apple extends Fruit {
	public String toString() {	return "Apple2";	}	}
class Grape extends Fruit {
	public String toString() {	return "Grape3";	}	}
class Juice {
	String name;
	Juice(String name) {
		this.name = name + "Juice";
	}
	public String toString() {	return name;	}	}
class Juicer {
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		String tmp = "";
		for(Fruit f : box.getList())
			tmp += f + " ";
		return new Juice(tmp);
	}
}
interface Eatable {}
class FruitBox <T extends Fruit & Eatable> extends Box<T> {}
class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {
		list.add(item);	
	}
	T get(int i) {
		return list.get(i);	
	}
	int size() {
		return list.size();
	}
	ArrayList<T> getList() {
		return list;
	}
	public String toString() {
		return list.toString();	
	}
}
public class Book01_Generic {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		grapeBox.add(new Grape());

		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
		System.out.println(Juicer.makeJuice(grapeBox));
		//		System.out.println("fruitBox : " + fruitBox);
		//		System.out.println("appleBox : " + appleBox);
		//		System.out.println("grapeBox : " + grapeBox);

	}
}

