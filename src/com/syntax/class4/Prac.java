package com.syntax.class4;

public class Prac {
	
	public static void main(String[] args) {
		
		int even=20;
		do {
			System.out.println(even);
			even+=2;
			
		}while (even<=50);
		
		
	}
	
	{
		// Second Way.
		int even1 =20;
	do {
		if (even1%2==0) {
			System.out.println(even1);
		}
		even1++;
	}while(even1<=50);

}
	{
	int i=0;
	do {
		if(i%2==1)
			System.out.println(i);
		i+=1;
	}while (i<=15);
	}
}
