package Coding1;   // constructor / class work / day 3

public class Student1{

public Student1 ()
{
	
	System.out.println("Default constructor");
}
public Student1(int a )
{
	this();
	System.out.println("one parameterized constructor");
}
public Student1(int a, int b)
{
	System.out.println("two parameterized constructor");
}
public static void main (String []args ) {

	Student1 obj=new Student1(77);
	
	
	
	
}


}
