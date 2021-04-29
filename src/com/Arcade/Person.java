package com.Arcade;

public class Person 
{
	private int coins;
	private int price;
	
	public Person(int coins) 
	{
		this.coins = coins;
		this.price = 1;
	}
		
	public void intsertCoin(Coinable coinable, int coins) 
	{
		System.out.println("You inserted " + coins + " coin(s).");
		if(coins > 0) 
		{
			if(!coinable.insertCoin()) 
			{
				System.out.println(coins + " coin(s) refunded");
			}
			else 
			{
			coins = coins * price * 5;	
			System.out.println("You have " + coins + " minute(s) to play!");
			}
		}
			
		else 
		{
			System.out.println("Please insert coin to play!");
		}
			
	}
}
