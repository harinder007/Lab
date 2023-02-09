package Lab_9_Feb;



public class Student {
	
	Student(){
		System.out.println("This is default constructor");
		
	}
	    int num;
	    String str;

	    Student(int n, String s){
	          
	          num = n;
	          str = s;
	    }
	    	
	    void show() {
	    	System.out.println("Parameterized Constructor called."+num+" "+str);
	    }
	    
	    public static void main(String args[]){
	    	Student c=new Student();
	    
	         //constructor call
	         Student sc=new Student(12,"Hello");
	         Student d=new Student();

	         //print values of object properties
	         sc.show();
	         
}
	         
	}
