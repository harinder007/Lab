package Lab_6_April;

/* create a java program to read n print the content to/from the file

Note: display two options 1 for store data 2 for print data,

if user press 1 then read the data from console and store it in file, 

if user press 2 print the data from the file */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Read_Write {//main class
	public static void main(String[] args) {//main method
		Scanner sc= new Scanner(System.in);//to take input from user
		System.out.println("enter the number");
		System.out.println("Press 1 if you want to write the file");
		System.out.println("Press 2 if you want to read the file");
		int a= sc.nextInt();
		if(a/2==0) {//condition to print the statement
			try {
				FileOutputStream f= new FileOutputStream("D:\\\\New folder\\\\test.txt");//source file	
				
				String s1="Welcome to Anudip Foundation to Learn Java Full Sack Course";//write the statement into the file
				byte b[]=s1.getBytes();
				//converting string into byte array
						f.write(b);//to show the statement
						f.close();
						System.out.println("program executed properly");//to print sucessfully
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		else {
			try {
			FileInputStream f= new FileInputStream("D:\\\\New folder\\\\input.txt");//source path
			int i;
			while((i=f.read())!=-1){//print one by one  all character
				System.out.print((char)i);//convert int into character
			}
			f.close();
			
			}catch(Exception e) {
				System.out.println(e);
			}	
		}
		}
}