package com.Interface;

public class Person {
	private int coins;
	private int price;

	
		public Person(int coins) {
			this.coins = coins;
			this.price = 3;
		}
		
		public void intsertCoin(Coinable coinable, int coins) {
			System.out.println("Inserted " + coins + " coin(s).");
			if(coins > 2) {
			if(!coinable.insertCoin()) {
				System.out.println(coins + " coin(s) refunded.");
			}
			else {
			coins = coins - price;	
			System.out.println("Your change is: " + coins + " coin(s)");
			}
			}
			
			else {
				System.out.println("Not enough coins! " + coins + " coin(s) returned.");
			}
			
		}
}