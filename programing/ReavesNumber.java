package com.programing;

import java.util.Scanner;

public class ReavesNumber {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter a number ");
	int num=s1.nextInt();
	int rev=0;
	while(num>0) {
		int rem=num%10;
		//System.out.print(rem);
		rev=rev*10+rem;
		num=num/10;
	}
System.out.println("Revers of the number "+rev);
}
}
