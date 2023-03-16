package Lab_16_March;

public class MyRegex{

	import java.util.regex.*;
	import java.util.regex.Pattern;
	import java.util.Scanner;
	public class MyRegex {
	 String pattern;
	 public MyRegex() {
	 // The regular expression for a valid IP address
	pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
	}
	  public boolean isValidIP(String ipAddress) {
		    // Check if the given string matches the regular expression for a valid IP address
		    Pattern p = Pattern.compile(pattern);
		  Matcher m = p.matcher(ipAddress);
	   return m.matches();
		    }
		public static void main(String[] args) {
			MyRegex regex = new MyRegex(); 
			System.out.println("000.12.12.034 ");
			System.out.println(regex.isValidIP("000.12.12.034"));// true
			System.out.println();
			System.out.println("121.234.12.12");
			System.out.println(regex.isValidIP("121.234.12.12"));// true
			System.out.println();
			System.out.println("23.45.12.56");
			System.out.println(regex.isValidIP("23.45.12.56"));// true
			System.out.println();
			System.out.println("00.12.123.123123.123");
			System.out.println(regex.isValidIP("00.12.123.123123.123"));//false
			System.out.println();
			System.out.println("122.23");
			System.out.println(regex.isValidIP("122.23"));// false
			System.out.println();
			System.out.println(regex.isValidIP("Hello.IP")); // false
		}}