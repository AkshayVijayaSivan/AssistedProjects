package com.akshay.training;

public class ClassesAndObjects {
String name;
int age;
	public static void main(String[] args) {
		ClassesAndObjects test1= new ClassesAndObjects("akshay", 22);
		System.out.println("Testing classes and objects: "+ test1.name+test1.age);

	}
public ClassesAndObjects(String name,int age) {
	this.name=name;
	this.age=age;
}
}
