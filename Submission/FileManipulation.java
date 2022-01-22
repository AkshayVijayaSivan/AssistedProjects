package com.akshay.training;

import java.io.*;
import java.util.Scanner;

public class FileManipulation {

	public static void main(String[] args) {
		
	fileCreation();
		
	fileWriting();
	
	fileDisplay();
	
	fileAppend();
		
	fileDisplay();
		
	fileDeletion();

	}

	private static void fileDeletion() {
		File myFile=new File("test.txt");
		if(myFile.delete()) {
			System.out.println("File deleted successfully");
		}
		else
			System.out.println("Failed to delete the file");
	}

	private static void fileAppend() {
		try {
			FileWriter myFile = new FileWriter("test.txt",true);
			System.out.println("Enter the string:");
			String string= new Scanner(System.in).nextLine();
			myFile.write(string);
			myFile.close();
			System.out.println("File append successfully");
		}catch(IOException io) {
			System.out.println("Some error occured");
			io.printStackTrace();
		}
	}

	private static void fileDisplay() {
		try {
			
			File myFile= new File("test.txt");
			Scanner scn= new Scanner(myFile);
			
			while(scn.hasNext()) {
				String data=scn.nextLine();
				System.out.println(data);
			}
			scn.close();
			
			
		}catch(FileNotFoundException fn) {
			System.out.println("An error occured");
			fn.printStackTrace();
		}
	}

	private static void fileWriting() {
		try {
			FileWriter myFile = new FileWriter("test.txt");
			System.out.println("Enter the String you want to enter into the file: ");
			String sentence= new Scanner(System.in).nextLine();
			myFile.write(sentence);
			myFile.close();
			System.out.println("Successfully Written into the file...");
		}catch(IOException io) {
			System.out.println("An error occured.");
			io.printStackTrace();
		}
	}

	private static void fileCreation() {
		try {
			File myFile= new File("test.txt");
			if(myFile.createNewFile()) {
				System.out.println("New file successfully created");
			}
			else {
				System.out.println("File already exist");
			}
		}catch(IOException io) {
			io.printStackTrace();
		}
	}

}
