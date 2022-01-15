package Assignments2ndPart;

public class InnerClassesDemo {

	public static void main(String[] args) {
		akshay aks = new akshay() {
			
			@Override
			public void krishna() {
				System.out.println("annonymous inner class");// annonymous inner class
			}
		};
		aks.krishna();
		
		govindam gov = new govindam();
		gov.home(new akshay() {
			@Override
			public void krishna() {
				System.out.println();
				System.out.println("Argument based annonymous inner class");
			}
			
		});
		
		System.out.println();
		
		new outer().new inner().print();
		
		System.out.println();
		
		

	}

}


interface akshay{
	void krishna();
}


class govindam {
	void home(akshay ref) {
	ref.krishna();}
}

class outer{
	class inner{
		void print() {
			System.out.println("Regular inner class");
		}
	}
}



class Outer{
	void func() {
		class Inner{
			void print() {
				System.out.println("Method local inner class");
			}
		}
		new Inner().print();
	}
}


