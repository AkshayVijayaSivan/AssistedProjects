package com.akshay.training;

import java.util.Scanner;

public class TryCatchThreepointEight {

	public static void main(String[] args) {
	 System.out.println("Enter two numbers :");
	 Scanner scn = new Scanner(System.in);
	 int first=scn.nextInt(),second=scn.nextInt();
	 try {
		 System.out.println("The division of two numbers is "+(first/second));
		 
		 
	 }catch(ArithmeticException ae) {
		 System.out.println("Cannor divide by zero \n error was "+ae.getMessage());
	 }
	 

	}

}
