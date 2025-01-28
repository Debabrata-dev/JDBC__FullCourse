package com.programing;

public class ProductDigit {
public static void main(String[] args) {
	int num=1034;
	int pr=1;
	while(num>0) {
		int digit=num%10;
		pr*=digit;
		num=num/10;
	}
	System.out.println(pr);
}
}
