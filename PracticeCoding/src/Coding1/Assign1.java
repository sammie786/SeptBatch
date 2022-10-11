package Coding1;

public class Assign1 {

	public Assign1 () {
		
		this(1,2,3);
		System.out.println("Default paramaterized constructor");
		
}
      
	public Assign1(int a ) {
	
this( 1,2);
		System.out.println("one parameterized constructor");
	}
	
	
	public Assign1(int a, int b) {
	this ();
	
		
		System.out.println("two parameterized constructor");
	}
	
	public Assign1(int a, int b, int c) {
	
		
		System.out.println("three parameterized constructor");
	}
	
public static void main (String []args ) {

		Assign1 obj =new Assign1(1);
		
}
}
	

