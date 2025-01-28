package com.programing;

import java.util.Scanner;

public class MainProgram2 {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	
	System.out.println("Enter the nmuber");
	int n=s1.nextInt();
	isPallindrome(n);
}
public static void isPallindrome(int n) {
	int org=n;
	int rev=0;
	while(n>0) {
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(rev==org) {
		System.out.println("Palemdorom");
	}
	else {
		System.out.println("Not palemdorom");
	}
}
}
