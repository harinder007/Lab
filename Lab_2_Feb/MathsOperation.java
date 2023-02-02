package Lab_2_Feb;
import java.util.*;


import java.util.Scanner;

public class MathsOperation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First no. :");
			int num1=sc.nextInt();
			System.out.print("Enter Second no. : ");
			int num2=sc.nextInt();

			//Addition Operation
			int sum=num1+num2;
			System.out.println("Addition of two no. is: "+sum);
			
			// Subtraction
			
			int sub=num1-num2;
		    System.out.println("Subtraction of two no. is: "+sub);
		    
		 // Multiplication
			
		 	int mul=num1*num2;
		   System.out.println("Multiplication of two no. is: "+mul);
		   
		// Divide
			
			float div=num1/num2;
		  System.out.println("Division of two no. is: "+div);
		  
		// Remainder
			
		 int mod=num1%num2;
		 System.out.println("Remainder of two no. is: "+mod);
			
			
	}

}
