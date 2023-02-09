package Lab_9_Feb;
import java.util.*;     // package for user input etc.
public class SmallestNumber {

	public static void main(String[] args) {
		


     int num1,num2,num3;
     Scanner sc=new Scanner(System.in);// used used take input from keyboard
     System.out.println("Enter The Three Numbers:");
    
     num1=sc.nextInt();  // int is used to take integer input
     num2=sc.nextInt();
     num3=sc.nextInt();
     
        if(num1<num2&&num1<num3) // && used to check both the condition
           {
              System.out.println("The First Number Is Smallest i.e: "+num1);              
           }

        else if(num2<num1&&num2<num3)
          {
             System.out.println("The Second Number Is Smallest i.e: "+num2);
          }
        else if(num3<num1&&num3<num2)
        {
           System.out.println("The Third Number Is Smallest i.e: "+num3);
        }
        //if three number are equal 
        else
         {
            System.out.println("Three no. are Equal");
         }

 }

}