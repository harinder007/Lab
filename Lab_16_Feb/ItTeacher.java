package Lab_16_Feb;

class Teacher{
	
	void designation() {
		System.out.println("Professor");
	}
	
	void college() {
		
		System.out.println(" MDU  university");
		
	}
	void work() {
		
		System.out.println("10 years experience");
		
	}
	
	
}



public class ItTeacher extends Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ItTeacher obj =new ItTeacher();
		
obj.college();
obj.designation();
obj.work();
	}

}
