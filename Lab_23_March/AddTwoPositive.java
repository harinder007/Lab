package Lab_23_March;

import Exception.Throws_Constructor;

	public class AddTwoPositive {
		int a,b;
		//exception using constructor
		public  AddTwoPositive(int a,int b) {
		if(a<0 && b<0) {
			throw new ArithmeticException("non positive integer send");
		}
	else {
		System.out.println("The value is positive");	
		}
		this.a=a;
		this.b=b;
		}
		public static void main(String[] args)throws Exception {
			AddTwoPositive t1= new AddTwoPositive(-10,-5);
			System.out.println(t1.a+t1.b);
		
		}
	}