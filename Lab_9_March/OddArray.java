package Lab_9_March;

import java.util.Scanner;
public class OddArray{//main class
public static void main(String[] args) {//main method
	Scanner sc= new Scanner(System.in);//taking input from user
	System.out.println("Enter the Lenght of array ");
	int n=sc.nextInt();
	int arr[]=new int [n];//array declared
	System.out.println("enter the element of an array");
	for(int i=0;i<n;i++) {//to print the element
		arr[i]=sc.nextInt();
	}
	System.out.println("odd position array:");
	for(int i=0;i<arr.length;i=i+2) {//loop for the array incrementing value of i by 2
		System.out.println(arr[i]);//print the odd position number
	}
}
}