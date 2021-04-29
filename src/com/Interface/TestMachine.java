package com.Interface;

public class TestMachine {
	public static void main(String[] args) {
		System.out.println("1 GUMBALL : 3 COINS");
		System.out.println("");
		GumballMachine gumballMachine = new GumballMachine();
		Person person = new Person(5);
		
		person.intsertCoin(gumballMachine, 5);
		System.out.println("");
		person.intsertCoin(gumballMachine, 1);
		System.out.println("");
		person.intsertCoin(gumballMachine, 15);
		System.out.println("");
		person.intsertCoin(gumballMachine, 10);
		System.out.println("");
		person.intsertCoin(gumballMachine, 20);
		
	}
}