package Javaaa;

import java.util.ArrayList;
import java.util.List;

public class FindingCommonElementin2Array {
	  public static void main(String[] args) {
	        int[] arr1 = {4, 2, 3, 1, 6 };
	        int[] arr2 = { 6, 7, 8, 4 };
	        List<Integer> commonElements = new ArrayList<>();

	        for (int i = 0; i < arr1.length; i++) {
	        	for (int j = 0; j < arr2.length; j++) {
	            if (arr1[i]==arr2[j]) { // add() returns false if element already exists
	            	commonElements.add(arr1[i]);
	            }
	        }
	        }
	        System.out.println("Duplicate elements in the array: " + commonElements);
	    }
}
List<Integer>: This creates a list (a collection) that will store numbers. The type Integer means the list can only hold whole numbers (like 1, 2, 3).
new ArrayList<>();: This creates an empty list using a structure called an "ArrayList." An ArrayList is a type of list that can automatically grow in size when you add more items to it.
In Simple Terms: