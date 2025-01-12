package Javaaa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindingDuplicateString {
public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a String");
	String str=scanner.nextLine();
	System.out.println("Duplicate removed");
	String result="";
	for(int i=0;i<str.length()-1;i++) {
		String ch=""+str.charAt(i);
		if(result.contains(ch) && !ch.equals(" ")) {
			continue;
		}
		result +=ch;
	}
	System.out.println(result);
	
}}


//By concatenating "" with the char, Java automatically converts the result to a String.