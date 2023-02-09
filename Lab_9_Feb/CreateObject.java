package Lab_9_Feb;
import java.util.*;
public class CreateObject {
	public static void main(String args[]) {
		
		// make a object of scanner class
		
		Scanner obj=new Scanner(System.in);
		
		// obj is the object of scanner class
		System.out.println("Enter Your Name ");
		
		String st=obj.nextLine();
		
		//st is a variable used to store string 
		
		
		System.out.println("Hello "+st);
		
	}

}
