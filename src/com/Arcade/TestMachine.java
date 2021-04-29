package com.Arcade;

public class TestMachine {
	public static void main(String[] args) {
		System.out.println("1 Coin = 5 Minutes");
		System.out.println("");
		ArcadeMachine arcademachine = new ArcadeMachine();
		Person person = new Person(5);
		
		person.intsertCoin(arcademachine, 0);
		System.out.println("");
		person.intsertCoin(arcademachine, 1);
		System.out.println("");
		person.intsertCoin(arcademachine, 2);
		System.out.println("");
		person.intsertCoin(arcademachine, 3);
		System.out.println("");
		person.intsertCoin(arcademachine, 4);
		
		
	}
}