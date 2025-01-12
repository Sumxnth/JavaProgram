package Javaaa;

public class SwapStringWithoutVariable {
	
	    public static void main(String[] args) {
	        String a = "hello";
	        String b = "bvc";

	        // Concatenate both strings
	        a = a + b;  // a = "hellobvc"

	        // Swap using substring
	        b = a.substring(0, a.length() - b.length());  // b = "hello"
	        a = a.substring(b.length());  // a = "bvc"

	        System.out.println("After swap:");
	        System.out.println("a: " + a);
	        System.out.println("b: " + b);
	    }
	}

