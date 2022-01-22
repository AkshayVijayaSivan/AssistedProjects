package com.akshay.training;

public class TestEncapsulation {

	public static void main(String[] args) {
		testing newTest = new testing();
		newTest.setTestNum(5);
		int a=newTest.getTestNum();
		System.out.println(a);

	}

}
class testing{
	 private int testNum;
	 public void setTestNum(int testNum) {
		 this.testNum=testNum;
	 }
	 public int getTestNum() {
		 return testNum;
	 }
	 
 }