package com.programing;

import java.util.Scanner;

public class StrongNumber {
public static void main(String[] args) {
Scanner s1=new Scanner(System.in);
System.out.println("Enter the Number");
int n=s1.nextInt();
Strong(n);
}

public static void Strong(int n) {
	int org=n;
	int fact=1;
	int sum=0;
	while(n>0) {
		int rem=n%10;
		for(int i=rem;i>=1;i--) {
			fact=fact*i;
		}
		sum+=fact;
		fact=1;
		n=n/10;
	}
	if(sum==org) {
		System.out.println("Strong number");
	}
	else {
		System.out.println("Not astrong number");
	}
}
}
