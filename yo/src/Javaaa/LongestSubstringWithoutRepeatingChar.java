package Javaaa;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChar {

	    public static void main(String[] args) {
	        String str = "abcdab";
	        String longestSubstring = longest(str);
	        System.out.println("Longest substring without repeating characters: " + longestSubstring);
	    }

	    private static String longest(String str) {
	        HashSet<Character> set = new HashSet<>();
	        String longestOverall = "";
	        String currentSubstring = "";
	        int start = 0;

	        for (int end = 0; end < str.length(); end++) {
	            char c = str.charAt(end);
	            
	            // If character c is already in the set, move start to the right
	            while (set.contains(c)) {
	                set.remove(str.charAt(start));
	                start++;
	            }
	            
	            set.add(c);
	            currentSubstring = str.substring(start, end + 1);
	            
	            if (currentSubstring.length() > longestOverall.length()) {
	                longestOverall = currentSubstring;
	            }
	        }
	        
	        return longestOverall;
	    }
	}

