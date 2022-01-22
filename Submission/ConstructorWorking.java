package Assignments2ndPart;

public class ConstructorWorking {
	int empID;
	String name;
	void display() {
		System.out.println(empID +" : "+ name);
	}
		

	public static void main(String[] args) {
		ConstructorWorking emp1 = new ConstructorWorking();
		emp1.display();//default constructor gave values 0 and null
		
		
		
		paraConstructor emp2 = new paraConstructor(201452, "Akshay");

	}

}
class paraConstructor{
	int empID;
	String name;
	paraConstructor(int empID,String name) {// parametrized constructor
		this.empID=empID;
		this.name=name;
		System.out.println(empID +" : "+ name);
	}
}
