package Lab_16_Feb;
import java.util.*;
class Airthmetic{
	static int sum(int a, int b)  
	{  
	int sum = a + b;  
	return sum;  
	}  

	
	
}

public class Adder extends Airthmetic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y, sum;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the first number: ");  
		x = sc.nextInt();  
		System.out.print("Enter the second number: ");  
		y = sc.nextInt();  
		sum = sum(x, y);
		System.out.println("Their sum is : "+sum);

	}

}
