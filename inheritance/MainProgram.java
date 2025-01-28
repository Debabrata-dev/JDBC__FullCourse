package com.inheritance;
class Bike{
	int a;
	{
		a=90;
	}
}
public class MainProgram {
public static void main(String[] args) {
	Bike b1=new Bike();
	System.out.println(b1.a);
}
}
///the superclass cannot access the properties of subclass
//if class is declare with final keyword it cannot be inherited
//The subclass cannot inherit the following member 1-private 2-static 3-intilizationblock 4-constructor

//code reusablity
//softwear enhancement
//code modification
//genralization vs speciallization


///SIngle inheritance 
///Multilavle inheritance
///herarical inheritance
///multiple inhirance
///hybrid inheritnace




