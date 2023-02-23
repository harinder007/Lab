package Lab_23_Feb;
class Bank{
	int getRateofInterset() {
		
		return 0;
	}
}
 class sbi extends Bank{
	 int getRateofInterset() {
			
			return 8;
		}
	 
 }

 class icici extends Bank{
	 int getRateofInterset() {
			
			return 7;
		}
	 
 }
 
 class axis extends Bank {
	 int getRateofInterset() {
			
			return 9;
		}
 }
 
public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// method overidding 
		Bank b;
		b=new sbi();
		System.out.println("Rate of intrest in SBI bank : "+b.getRateofInterset());
		

		b=new icici();
		System.out.println("Rate of intrest in ICICI bank : "+b.getRateofInterset());
		
		
		b=new axis();
		System.out.println("Rate of intrest in SBI bank : "+b.getRateofInterset());
		
	}

}
