package com.test2;

public class S12_Enums {
	enum Menu {
		pizza,
		spaghetti,
		noodle
	}
	
	
	public static void main(String[] args) {
		//System.out.println(Menu.pizza);
		
		for(Menu m : Menu.values()) {
			System.out.println(m);
			System.out.println(m.ordinal());
			
		}
	}
}
