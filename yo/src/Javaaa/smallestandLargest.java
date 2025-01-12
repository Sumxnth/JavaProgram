package Javaaa;

public class smallestandLargest {
	

	    public static void main(String[] args) {
	        int[] arr = {2, 19, 99, 1};

	        // Initialize variables to hold smallest and largest numbers
	        int smallest = Integer.MAX_VALUE;
	        int largest = Integer.MIN_VALUE;

	        // Traverse the array to find smallest and largest numbers
	        for (int i = 0; i < arr.length; i++) {
	            // Finding smallest number
	            if (arr[i] < smallest) {
	                smallest = arr[i];
	            }

	            // Finding largest number
	            if (arr[i] > largest) {
	                largest = arr[i];
	            }
	        }

	        // Print the results
	        System.out.println("The smallest element in the array is: " + smallest);
	        System.out.println("The largest element in the array is: " + largest);
	    
	}


}
