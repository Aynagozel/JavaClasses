package com.syntax.class4;

import java.util.Scanner;

public class SyntaxPrac {
	
	public static void main(String[] args) {
		
		int i = 5;
		while (i < 25) {
			System.out.println(i+ "  ");
			i++;	
			
		}
		Scanner scan=new Scanner(System.in);
		String name;
		System.out.println("Print your name");
		name= scan.nextLine();
		int c=1;
		while (c<=3) {
			System.out.println("Hello "+ name);
			c++;
		}
		
	}
}
