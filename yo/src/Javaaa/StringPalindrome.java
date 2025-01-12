package Javaaa;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scanner.next();
		String palin="";
		for(int i=str.length()-1;i>=0;i--) {
			palin=palin+str.charAt(i);
		}
		if(str.equals(palin)) {
			System.out.println("yes its a palindrome");
		}
		else {
			System.out.println("Nope");
		}
	}

}
