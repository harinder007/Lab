package Lab_13_April;
import java.util.ArrayList;

public class Person {
	public static void main(String[] args) {
		ArrayList<String> li=new ArrayList<String>(); //creating array list
		li.add("Amit");
		li.add("Sumit");
		li.add("Rahul");
		System.out.println("use for each loop");
		for(String a:li) {
			System.out.println(a);
		}
	}

}
