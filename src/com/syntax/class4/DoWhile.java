package com.syntax.class4;

public class DoWhile {
	
	public static void main(String[] args) {
		
		int num= 10;
		while(num <=7) {
			System.out.println(" Hello");
			num++;
		}
		//rare
		int num1=10;
		do {
			System.out.println("Bye");
			num++;
		}while(num1<=7);
		System.out.println("-----------------");
		// print even numbers from 20 to 50 using do while one way//
		
}
	{
		int even = 20;
	do {
		System.out.println(even);
		even+=2;
		
	}while (even<=50);}
}