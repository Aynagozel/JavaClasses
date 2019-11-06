package com.syntax.class4;

public class DoWhilePrac {
	
	public static void main(String[] args) {
		
		boolean workDay=true;
		int day=1;
		while(workDay)	{
		if(day==6 || day==7) {
			workDay =false;
			System.out.println("I do not need a day of anymore");
		}else {
			System.out.println(" I need day off");
		}
		day++;
		}	
		int z=1;
		while(z<=20) {
		if(z % 2 ==0) {
			System.out.println(z);
		}
		z++;
		}
		int y =5;
		while (y<=25) {
			System.out.println(y + " ");
			y++;
		}
		int z1=1;
		while(z<=21) {
			if(z%2==0) {
				
			}
			z++;
		}
		
	}
}
