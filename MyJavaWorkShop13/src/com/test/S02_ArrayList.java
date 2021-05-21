package com.test;

import java.util.*;

public class S02_ArrayList {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(1);
	al.add("¼¼Á¾´ë¿Õ");
	al.add("°­°¨Âù");
	al.add(12.5);
	al.add(false);
	//al.get(0);
	Object obj = al.get(0);
	System.out.println(obj.getClass().getName());
	Object obj2 = al.get(1);
	System.out.println(obj2.getClass().getName());
	System.out.println(obj2);
	al.size();
	System.out.println("=====");
	for(int inx = 0; al.size() > inx; inx++) {
		Object o = al.get(inx);
		System.out.println(o.toString());
		
		//System.out.println(al.get(inx));
	}
	//al.get(1);
	HashSet h = new HashSet();
	h.add("È«±æµ¿");
	h.add("È«±æ¼ø");
	h.add("È«±æµ¿");
	h.add("È«±æ¼­");
	
	Iterator itr = h.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
}
}
