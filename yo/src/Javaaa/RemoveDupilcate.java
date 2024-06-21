package Javaaa;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDupilcate {
	 public static void main(String[] args) {
	        int arr[][] = {{1, 2, 2, 3, 4, 5}, {1, 1, 2, 2}, {1, 2, 3, 3}, {4, 4, 5}};
	        
	        // Iterate over each sub-array in arr
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = removeDuplicate(arr[i]);
	        }
	        
	        // Print the modified 2D array
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(Arrays.toString(arr[i]));
	        }
	    }
	    
	    public static int[] removeDuplicate(int[] array) {
	        // Use a HashSet to store unique elements
	        HashSet<Integer> set = new HashSet<>();
	        
	        // Add elements to the HashSet (automatically removes duplicates)
	        for (int num : array) {
	            set.add(num);
	        }
	        
	        // Create a new array to store unique elements
	        int[] result = new int[set.size()];
	        int index = 0;
	        
	        // Transfer elements from HashSet to result array
	        for (int num : set) {
	            result[index++] = num;
	        }
	        
	        return result;
	    }
	

}
