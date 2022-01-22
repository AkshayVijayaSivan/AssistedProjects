package com.akshay.training;

import java.util.Scanner;

public class ThreePointSixExceptionHandling {

	public static void main(String[] args) {
		try {
		String str = new Scanner(System.in).nextLine();
		throw new MyException("Test Exception");
	}catch(MyException m) {
		System.out.println(m.strTostr());
	}
	}

}


class MyException extends Exception{
	String str;
	MyException(String str1){
		str=str1;}
	String strTostr(){
		return ("My Exception Error is "+ str);}
	}
