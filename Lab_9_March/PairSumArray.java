//A Java program to find all pairs of elements in an array whose sum is equal to a specified number


package Lab_9_March;
public class PairSumArray {
    public static void main(String[] args) {  // main method

        int n=8;                         // elements to be checked
        int arr[] = {1,2,3,4,5,6,7,8,0}; // array declare	
    for(int i=0;i<=arr.length;i++) {
    	for(int j=i+1;j<=arr.length;j++) {
    		if (arr[i]+arr[j]==n) {
                System.out.println("Pairs are ");
    			System.out.println(arr[i]+" + "+arr[j]+" = "+n);
    		}
    		
    	}
    }
	

}}