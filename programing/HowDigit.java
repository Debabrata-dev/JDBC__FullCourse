package com.programing;

public class HowDigit {
public static void main(String[] args) {
	int n=120,count=0;
	while(n>0) {
		n=n/10;
		count++;
	}
	System.out.println("Number of digit "+count);
	
}
}
