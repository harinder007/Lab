package Lab_2_March;

public class Main {
	//main class
		public static void main(String[] args) {
		Library obj = new Library(); //create object
		obj.setBookId(45632);
		obj.setBookName("A Letter to God");
		obj.setBookAuthor("G.L fuentes");
		//print the line
		System.out.println("The Book Name is :"+obj.getBookName());
		System.out.println("The Book Id is :"+obj.getBookId());
		System.out.println("The Book Author Name is :"+obj.getBookAuthor());
	}}


