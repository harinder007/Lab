package Lab_9_March;

import java.util.*;  // main method
public class CommonElement {       //class declare
public static void main(String[] args) {
	ArrayList<Integer> common = new ArrayList<Integer>();  //common property
   int array1[] = {3, 5, 8,9};
   int array2[] = {2, 5, 4, 8,9,10};
   int array3[] = {4, 5, 9, 40};
	int x = 0, y = 0, z = 0;
	while (x < array1.length && y < array2.length && z < array3.length){  // while loop
		if (array1[x] == array2[y] && array2[y] == array3[z]){
			common.add(array1[x]);
			x++;
			y++;
			z++;
		}
		else if (array1[x] < array2[y])
			x++;
		else if (array2[y] < array3[z])
			y++;
		else
			z++;
	}
	System.out.println("Common elements from three sorted (in non-decreasing order ) arrays: ");
	System.out.println(common);
}
}