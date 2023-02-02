package Lab_2_Feb;
import java.util.*;

public class Average_No {

	public static void main(String[] args) {
		//taking input from user
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First no. :");
			int num1=sc.nextInt();
			System.out.print("Enter Second no. : ");
			int num2=sc.nextInt();
			System.out.print("Enter Third no.: ");
			int num3=sc.nextInt();
			System.out.print("Enter Fourth no. :");
			int num4=sc.nextInt();
			System.out.print("Enter Fifth no. :");
			int num5=sc.nextInt();
			
			
			//calculate average of these no.
			
			int Average=(num1+num2+num3+num4+num5)/5;
			
			//print the average result
			System.out.println("Average of 5 no. is = "+Average);
	}

}
