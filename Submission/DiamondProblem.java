package com.akshay.training;

public class DiamondProblem implements first,second {

	public static void main(String[] args) {
		DiamondProblem dia = new DiamondProblem();
		dia.impli();

	}
	void impli()
	{first.super.func();
	second.super.fun();
	

}}


interface first{
	default void func() {
		System.out.println("Message in first");
	}
}

interface second{
	default void fun() {
		System.out.println("Message in second");
	}
}

