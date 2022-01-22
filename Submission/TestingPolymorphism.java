package com.akshay.training;

public class TestingPolymorphism {

	public static void main(String[] args) {
		int a=5,b=6,c=7,d,e;
		System.out.println("a="+a+" b="+b+" c="+c);
		d=sum(a,b);
		e=sum(a,b,c);
		System.out.println("Polymorphism Examples "+d+" "+e);

	}
static int sum(int a, int b) {
	return (a+b);
}
static int sum(int a,int b, int c) {
	return(a+b+c);
}
}
