package com.akshay.training;

import java.util.Scanner;

public class ThreePointFiveExceptionThrowsFnallyKeyword  {

	public static void main(String[] args) {
		System.out.println("Enter the user name: ");
		String userName=new Scanner(System.in).nextLine();
		
		try {
			checkUserName(userName);
		}catch(EndsWithJobsException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally always works");
		}

	}

	private static void checkUserName(String userName) throws EndsWithJobsException { // throws means the line of code is expecting an exception
		if(userName.endsWith("_jobs")) {
			System.out.println("Valid Username");
		}
		else {
			throw new EndsWithJobsException("Invalid username");      //throw indicate that an exception is called
		}
	}

}



class EndsWithJobsException extends Exception{      // creating custom Exception
	public EndsWithJobsException(String message) {
		super(message);}
}