package Javaaa;

import java.util.HashSet;
import java.util.Set;

public class FindingDuplicateArray {

    public static void main(String[] args) {

    	Integer[] array1 = { 4, 2, 3, 1, 6 ,2};
    	Integer[] array2 = { 6, 7, 8, 4 };
    	
    	Set<Integer> uniqueElement=new HashSet<>();// HashSet provides constant-time performance for basic operations like add, remove, and contains.
    	Set<Integer>duplicateElement=new HashSet<>();
    	// Add elements from the first array
        for (int num : array1) {
            uniqueElement.add(num);
        }

        // Check for duplicates in the second array
        for (int num : array2) {
            if (!uniqueElement.add(num)) { // if num is already in uniqueElement, it's a duplicate
                duplicateElement.add(num);
    	}}
    	
    	System.out.println("duplicateElement "+ duplicateElement);
    	System.out.println("uniqueElement "+ uniqueElement);
    }}

/*for(int[] val:arr) {
	  for (int sub : val) {
	if(!uniqueElement.add(sub)){
		duplicateElement.add(sub);
		*/

     /*  String arr[][] = {{"abc", "def", "abc", "mno", "xyz", "pqr", "xyz", "pqr"}};
	    	        
	    	        Set<String> uniqueElement = new HashSet<>();
	    	        Set<String> duplicateElement = new HashSet<>();
	    	        
	    	        for (String[] val : arr) {
	    	            for (String sub : val) {
	    	                if (!uniqueElement.add(sub)) {
	    	                    duplicateElement.add(sub);
	    	                }
	    	            }
	    	        }
	    	        
	    	        System.out.println("Duplicate elements: " + duplicateElement);
	    	    }
	    	} */
