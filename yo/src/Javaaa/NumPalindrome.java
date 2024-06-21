package Javaaa;

import java.util.Scanner;

public class NumPalindrome {
public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a number");
	int number=scanner.nextInt();
	scanner.close();
	int tempNumber=number;
	int revNumber=0;
	while(tempNumber!=0) {
		int lastDigit=tempNumber%10;
		revNumber=revNumber*10+lastDigit;
		tempNumber=tempNumber/10;
	}
	if(number==revNumber)
	{
		System.out.println("Number is palindrome");
	}
	else
	{
		System.out.println("Not");
	}
	
	
}
}
