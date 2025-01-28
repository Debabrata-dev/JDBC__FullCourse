package com.programing;

public class MainProgram {
public static void main(String[] args) {
	int num=3408;
	int count=0;
	while(num>0) {
		int rem=num%10;
		if(rem%2==1) {
			count++;
		}
		num=num/10;
	}
	System.out.println();
}
}
