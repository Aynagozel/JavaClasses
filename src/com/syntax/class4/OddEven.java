package com.syntax.class4;

public class OddEven {
	
	public static void main(String[] args) {
	 // *writw to code to find the sum of even & odd	numbers from from range 1to 20
		//ecpecting outputs odd nums or even nums
		
		int even=0;
		int odd=0;
		for(int i=1; i<=20; i++) {
		if(i%2==0) {
			even=even+i;
		}else {
			odd=odd+i;
		}
		}
		System.out.println(" The total of all even#=" +even);
		System.out.println("The total of all odd#=" +odd);
	}
	
}
