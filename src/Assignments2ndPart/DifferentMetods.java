package Assignments2ndPart;

public class DifferentMetods {
	public static void main(String[] args) {
		int addition= addition(5,6);
		System.out.println("The addition of 5 and 6 is "+ addition);
		
		System.out.println();
		
		
		callingMethod cal= new callingMethod();
		
		System.out.println("Call by value Before is "+cal.value);
		cal.change(150);
		System.out.println("Call by value after is "+cal.value);
		
		System.out.println();
		
		area(5,6);
		
		area(6);
	}
	
	static int addition(int num1, int num2){
		
		return num1+num2;
	
	}
	
	static void area(int num1, int num2) {
		System.out.println("The area of rectangle is "+ (num1*num2));
	}
	static void area(int num1) {
		System.out.println("The area of square is "+ (num1*num1));
	}

}

class callingMethod{
	int value=200;
	
	int change(int value) {
		this.value=value + 200;
		return this.value;
	}
}
