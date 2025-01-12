package Javaaa;

import java.util.HashMap;

public class CountCharcterOccurance {
		
	    public static void main(String[] args) {
	        String str = "hello bvc"; // Example string
	        int[] count = new int[256]; // Array to store count of characters

	        // Count each character
	        for (int i = 0; i < str.length(); i++) {
	            // Skip spaces
	            if (str.charAt(i) == ' ') {
	                continue;
	            }
	            count[str.charAt(i)]++;
	        }

	        // Display character counts
	        for (int i = 0; i < str.length(); i++) {
	            // Skip spaces
	            if (str.charAt(i) == ' ') {
	                continue;
	            }
	            if (count[str.charAt(i)] > 0) {
	                System.out.println(str.charAt(i) + " : " + count[str.charAt(i)]);
	                count[str.charAt(i)] = 0; // Avoid printing duplicates
	            }
	        }
	    }
	}


