package Lab_16_Feb;

	class A{
		
		void one() {        // base class
			
			System.out.println("This is base class of A");
		}
	}
	
	class B extends A{        // derived from A and base  of C class
		
		
		void two() {
			
			System.out.println("this is derived class from A");
		}
	}
class C extends B{
	
	
	void three() {      // derived from b classs
		
		System.out.println("This is derived from class B");
	}
}

public class SimpleInheritance  extends C{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleInheritance obj=new SimpleInheritance();
		obj.one(); // calling method of class A
		obj.two(); // calling method of class b
		obj.three();// calling method of class c

	}

}
