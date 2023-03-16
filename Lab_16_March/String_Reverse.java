package Lab_16_March;

public class String_Reverse {//main class
	public static void main(String[] args) {//main method
		 String s1 = "Welcome to Java World!";//initialized the string
		 System.out.println("Original String: "+s1);  //printing original string
	     String word[]=s1.split(" ");
	     String revString=" ";//for reverse each word
	     for(String w:word) {//for each loop
	    	 StringBuilder sb=new StringBuilder(w);
	    	 sb.reverse();//reverse the string
	    	 revString=revString+sb.toString()+" ";
	     }
	     System.out.println("Reverse String is :"+revString.trim());//printing reverse string
	     }
}