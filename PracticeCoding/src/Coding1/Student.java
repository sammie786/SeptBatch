package Coding1;

public class Student {

	
	int roll_no;
	int age;
	
	public void Display1 () {
		
		System.out.println("Welcome to all of you");
	}
		
		public void Display2() {
			System.out.println("automation is very easy");
			
			
		}
	public static void main (String [] args) {
		
		Student pretti= new Student();
		pretti.Display1();
		pretti.Display2();
		pretti.roll_no= 203;
		pretti.age=26;
		
		System.out.println(pretti.roll_no);
		System.out.println(pretti.age);
		
		
	}
	
	}
	


