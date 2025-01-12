package Javaaa;

public class MissingNumberArray {
	
		    public static void main(String[] args) {
		        int[] array = {1, 2, 4, 5, 6}; // Example array where 3 is missing
		        int n = array.length + 1; // Total number of elements expected
		        int sumOfNNumbers = n * (n + 1) / 2; // Sum of numbers from 1 to n
		        int sumOfArray = 0;
		        
		        // Calculate sum of elements in the array
		        for (int num : array) {
		            sumOfArray += num;
		        }

		        // The missing number is the difference between the expected sum and actual sum
		        int missingNumber = sumOfNNumbers - sumOfArray;
		        
		        System.out.println("The missing number is: " + missingNumber);
		  
}}
