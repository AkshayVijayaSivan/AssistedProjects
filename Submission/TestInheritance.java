package com.akshay.training;

public class TestInheritance extends test{
	public static void main(String[] args) {
		TestInheritance tes= new TestInheritance();
		tes.inheriMethod();
		tes.inheriTest();
		tes.localMethod();
	}
void localMethod() {
	System.out.println("This is local method");
}
}


class test{
	void inheriTest(){
		System.out.println("This is to test inheritance");
	}
	
	void inheriMethod() {
		System.out.println("This method was from the inherited class");
	}
	
}