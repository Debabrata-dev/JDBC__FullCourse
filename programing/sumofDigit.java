package com.programing;
///print the sum of all digit 
public class sumofDigit {
public static void main(String[] args) {
	int num=123;
	int sum=0;
	while(num>0) {
		int rem=num%10;
		sum+=rem;
		num=num/10;
	}
	System.out.println(sum);

}
}
