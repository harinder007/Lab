package Lab_23_March;

public class PositiveNumber {
	public static void check(int x,int y) throws Exception {
		if(x<0 || y<0) {
			//throw instance=throw keyword new and then exception class
		throw new Exception("X and Y should not be zero ");	
		}
		else {
			System.out.println("Product of numbers are : "+x*y);
		}
	}
	public static void main(String[] args) throws Exception {
		check(-1,8);
	}
	}


