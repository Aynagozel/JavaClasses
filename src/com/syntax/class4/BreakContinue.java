package com.syntax.class4;

public class BreakContinue {
		
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i ==2)	{
			break;
			}
			System.out.println(i);
			}
for(int i=1; i<5; i++) {
	if(i ==0 || i ==4) {
		continue;
	}
	System.out.println(i);
	// I want to print nums from 1 to 20 except 5,6,7
	for(int a =1; a<=20; a++) {//5
		if(a>=5 && a<=17) {
			continue;
		}
		System.out.println(a);
	}
	for(int i1=0; i< 10; i++) {
		if(i1==2) {
			continue;
		}
		System.out.println(i);
	}
	// continue current iretation
	for(int i2 = 1; i2<=5; i++) {
		if (i2==3 || i2==4 ) {
			continue;
		}
		System.out.println(i);
	}
	for(int i3=1; i3<=20; i3++) {
		if(i3>=5 && i3<=17) {
		continue;	
		}
		System.out.println(i3);
	}
}
	}
}
	
