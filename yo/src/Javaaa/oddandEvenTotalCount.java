package Javaaa;

public class oddandEvenTotalCount {
	
	    public static void main(String[] args) {
	        // Input array
	        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	        
	        // Variables to store the count and sum of odd and even numbers
	        int oddCount = 0;
	        int evenCount = 0;
	        int oddSum = 0;
	        int evenSum = 0;
	        
	        // Loop through the array to count and sum odd and even numbers
	        for (int num : arr) {
	            if (num % 2 == 0) {
	                evenCount++; // If the number is divisible by 2, it's even
	                evenSum += num; // Add to even sum
	            } else {
	                oddCount++; // Otherwise, it's odd
	                oddSum += num; // Add to odd sum
	            }
	        }
	        
	        // Print the counts and sums
	        System.out.println("Even numbers count: " + evenCount);
	        System.out.println("Even numbers sum: " + evenSum);
	        System.out.println("Odd numbers count: " + oddCount);
	        System.out.println("Odd numbers sum: " + oddSum);
	    
	}}

