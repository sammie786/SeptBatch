package Coding1;

public class assign2 {

	public void method() {
		this.method3(11,23, 34);
		
		System.out.println("default method of the class");
	this.method1(3);
	}
	public void method1 (int a)
	{
	
		System.out.println("First method of the class");
	this.method2(2,4);
	}
	
	public void method2(int a, int b) {
	
		System.out.println("second method of the class");
		this.method4(1, 2,3, 4);
	}
	
	
	public void method3(int a , int b, int c)
	{
		
		System.out.println("Changes done by samreen");
		System.out.println("third method of the class");
	}
	
	public void method4(int a, int b, int c, int d) {
	
		
		System.out.println("fourth method of the class");
	}
	
	
	
	public static void main (String []args ) {

		assign2 obj=new assign2();
	obj.method();
}//output should be in the below sequence
	//three parameterized method 
	//default method
	//one parameterized method
	//two parameterized method
	//four parameterized method

}