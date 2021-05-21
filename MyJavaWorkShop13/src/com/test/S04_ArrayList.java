package com.test;

import java.util.*;

public class S04_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		for(Integer i : al) {
			System.out.println(i);
		}
		
		List<Integer> al2 = new ArrayList<Integer>();
		List<Integer> al3 = new LinkedList<Integer>();
		
		System.out.println("===========");
		
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(1, "¼¼Á¾´ë¿Õ");
		mp.put(2, "°­°¨Âù");
		mp.put(3, "È«±æµ¿");
		mp.put(4, "¼¼Á¾´ë¿Õ");
		
		for(Integer k : mp.keySet()) {
			System.out.println(k + ", " + mp.get(k));
		}
		set<Integer> set = mp.keySet();
		mp.entrySet();
	}
}
