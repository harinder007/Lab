package Lab_2_March;
import java.util.*;

public class SumOddNum {// main class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any Number : ");
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			if (i%2==1) {  //checking the no. is odd or not
				
				 sum=sum+i;  // sum of the number
				 
			}
		}
		System.out.println("Sum of odd Number is : "+sum);
	}

}
