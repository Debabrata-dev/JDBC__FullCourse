package com.programing;

public class SpyNumber {
public static void main(String[] args) {
	int num=12;
	int sum=0;
	int pr=1;
	while(num>0) {
		int rem=num%10;
		sum+=rem;
		pr*=rem;
		num=num/10;
	}
	if(sum==pr) {
		System.out.println("Spy number");
	}
	else {
		System.out.println("Not a spynumber");
	}
}
}
