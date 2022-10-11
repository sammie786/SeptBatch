package Coding1;

public class constructorHW { //day 3 assignment 1
	//three parameterized constructor  
	//default constructor   
	//two parameterized constructor 
	//one parameterized constructor
	
public constructorHW () {
	
		this(1,2,3);
		System.out.println("Default paramaterized constructor");
		
}
      
	public constructorHW(int a ) {
	
this( 1,2);
		System.out.println("one parameterized constructor");
	}
	
	
	public constructorHW(int a, int b)
	{
		
		System.out.println("two parameterized constructor");
	}
	
	public constructorHW(int a, int b, int c) {
	
		
		System.out.println("three parameterized constructor");
	}
	
public static void main (String []args ) {

		constructorHW obj=new constructorHW();
		
}
}