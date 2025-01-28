package com.programing;

import java.util.Scanner;

public class PalemDromNumber {
	static void Palem() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s1.nextInt();
		int n=a;
		int rev=0;
		while(a>0) {
			int rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		if(n==rev) {
			System.out.println(true);
		}
		System.out.println(false);
	}
public static void main(String[] args) {
	PalemDromNumber.Palem();
	
}
}
