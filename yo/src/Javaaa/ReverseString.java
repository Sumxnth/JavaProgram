package Javaaa;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[]args)
	{

	   
	    	
	    	Scanner scanner=new Scanner(System.in);
			System.out.println("Enter a String");
			String str=scanner.nextLine();
			String rs=""; //Initializes an empty string rs, which will store the reversed version of the input string str.
			for(int i=str.length()-1;i>=0;i--) {
				rs=rs+str.charAt(i);
			}
		
System.out.println(rs);
	}}

/* public class prac {

		
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter");
	String str= scanner.nextLine();	
	String rev="";
	rev=new StringBuilder(str).reverse().toString();
	System.out.println(rev);

}
	
}*/