package com.syntax.class4;

import java.util.Scanner;

public class DoWhileP {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int answer;
		do {
			System.out.println("Pay for candy");
			answer= scan.nextInt();
		}while(answer!=3);
		System.out.println("Pay for candy");
		}
		
		
	
}
