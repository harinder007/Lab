package Lab_2_Feb;
import java.util.*;

public class Swap_Two_no {
	public static void main(String[] args) {  
	       int x, y, temp;// x and y are to swap   
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter first no. and second no.");  
	       x = sc.nextInt();  
	       y = sc.nextInt();  
	       System.out.println("before swapping  these no. are numbers: "+x +"  "+ y);  
	       //swapping 
	       
	       // temp is used as a third variable to store the no.
	       temp = x;  
	       x = y;  
	       y = temp;  
	       System.out.println("After swapping the no. : "+x +"   " + y);  
	      
	    }    
	}  


