package Lab_6_April;

//Write a Java program to read contents from a file into byte array.
import java.io.ByteArrayInputStream;

public class Read_ByteArray {//main class
	public static void main(String[] args) {
		byte[]arr= {68,37,35,70,39,65,99,60,121,34,56};//byte array --only read the value
		//byte is used to read the number
		ByteArrayInputStream b1= new ByteArrayInputStream (arr);
		int i=0;
		while((i=b1.read())!=-1) {//to print the whole value
			char ch=(char)i;//converting into character
			System.out.println("ASCII character of "+i+" "+"value is: "+ch);
		}
	}
}