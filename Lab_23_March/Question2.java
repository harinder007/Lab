package Lab_23_March;
import java.util.Scanner;

public class Question2 {
 //main class
	public static void calculation() {//user define method
	Scanner sc= new Scanner(System.in);//taking input from the user
	System.out.println("enter the value of x and y:");
	int x=sc.nextInt();
	int y=sc.nextInt();
	try {//using try catch block to find all the exception
		int z=x/y;
		System.out.println(z);
	}
	catch(Exception ae) {
	System.out.println(ae);	
	}
	}
	public static void main(String[] args) {//main method
		calculation();//static method	
	}
	}