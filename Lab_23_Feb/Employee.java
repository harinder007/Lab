package Lab_23_Feb;

class Manager{
	
	int IncremenSalry() {  // method 1
		return 0;
	}
}

class Devloper extends Manager{
	
	int IncremenSalry() {  //method 2
		return 5;
	}
}

public class Employee extends Devloper {
	int IncremenSalry() {  // method 3
		return 6;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager m=new Manager();
		System.out.println("Increment salay of manger is : "+m.IncremenSalry());
		
		Devloper d =new Devloper();
		System.out.println("Increment salay of Devloper is : "+d.IncremenSalry());
		
		Employee e =new Employee();
		System.out.println("Increment salay of employee is : "+e.IncremenSalry());


		
			
			

	}

}
