package com.test;

interface IDatabase<T> {
	void open(T db);
}
class Database<T> implements IDatabase<T> {
	T db;
	
	@Override
	public void open(T db) {
		this.db = db;
		System.out.println("Database is opened");
		System.out.println(db);
	}

	
}

class Oracle {}

public class S07_WildCard {
	public static void main(String[] args) {
		IDatabase<Oracle> oracle = new Database<Oracle>();
		oracle.open(new Oracle());
		
	}
}
