package Coding1;
//Day 2 assignment 1

public class Operations {
	
	public int sum  (int a, int b) {
	
		int c;
		c=a+b;
		
		System.out.println("result is "  +  c);
		return c;
		
//((((10+2)-2)+2)*2)/2	
		
	}
	public int sub(int d, int e) {
		int f;
		 f= d-e;
		 System.out.println("result of sub is " + f);
		 return f;
	}
	public int multi (int g, int h) {
		int i;
		i=g*h;
		System.out.println("result of mult is" + i);
		return i;	
		
	}
	public int div (int j, int k) {
		int l;
		l= j/k;
		System.out.println("result is div of "  + l);
		return l;
		
	}
	public static void main(String[] args) {
		Operations obj=new Operations();
		int sumresults1= obj.sum (10, 2);
		int subresults1= obj.sub (sumresults1, 2);
		int sumresults2=obj.sum(subresults1, 2);
		int multiresults1=obj.multi (sumresults2, 2);
		int totalresults=obj.div (multiresults1, 2);
		System.out.println("total results is " + totalresults);

//((((10*2)-2)+2)-2)/2)	
		
//Day 2 Assignment 2
		int multi= obj.multi(10,2);
		int sub1=obj.sub(multi ,2);
		int sum=obj.sum(sub1, 2);
		int sub2= obj.sub(sum, 2);
		int total= obj.div(sub2, 2);
		System.out.println("total is " + total );
		
		}
	


}
