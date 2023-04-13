package Lab_13_April;

import java.util.ArrayList;
public class Question_1 {
	int n;//instance variable
	public void storeOddNumber(int n) {
		this.n=n;//to take the number
	}
ArrayList<Integer>A1 = new ArrayList<Integer>();//only take integer type array list
public void printEvenNumber() {//user define method
	A1=new ArrayList<Integer>();
	for(int i=2;i<=n;i++){
		if (i%2==0)A1.add(i);
	}
	System.out.println(A1);}
	public void printOddNumber() {//user define method
		A1=new ArrayList<Integer>();
		for(int i=1;i<=n;i++){
			if (i%2!=0)A1.add(i);
		}
		System.out.println(A1);}
	ArrayList<Integer>A2= new ArrayList<Integer>();//only take integer type array list
	public void retrieveOddNumber(int n){//user define method
		for (int num:A1) {
			A2.add(num*5);
			System.out.println(num*5);
	}
		System.out.println(A2);
	}
	public static void main(String[] args) {
		Question_1  q1=new Question_1();//main class object
		//call all the method with help of object
		q1.storeOddNumber(10);
		q1.printEvenNumber();
		q1.printOddNumber();
		q1.retrieveOddNumber(5);	
	}
}