package com.akshay.training;

public class TestAbstraction extends Animal{

	public static void main(String[] args) {

		TestAbstraction test = new TestAbstraction();
		test.walk();
		test.lives();
		
	}
	void walk() {
		System.out.println("Testing abstraction");
	}

}

abstract class Animal{
	abstract void walk();
	void lives() {
		System.out.println("Every animal lives");
	}
		
}