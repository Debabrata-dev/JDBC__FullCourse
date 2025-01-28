package com.programing;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=s1.nextInt();
	factorial(n);
}
public static void factorial(int n) {
	int fac=1;
	for(int i=n;i>=1;i--) {
		 fac=fac*i;
	}
	System.out.println(fac);
}
}
