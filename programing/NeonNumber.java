package com.programing;

import java.util.Scanner;

public class NeonNumber {
public static void main(String[] args) {
System.out.println("Enter a Number");
Scanner s1=new Scanner(System.in);
int num=s1.nextInt();
int square=num*num;
int sum=0;
while(square>0) {
	int rem=square%10;
	 sum+=rem;
	 square=square/10;
}
if(sum==num)
	System.out.println("nenon number");
else
	System.out.println("Not a neon number");
}
}
