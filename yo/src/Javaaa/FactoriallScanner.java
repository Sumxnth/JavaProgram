package Javaaa;

import java.util.Scanner;

public class FactoriallScanner {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scanner.nextInt();
		scanner.close();
		
		long factorial=1;
		for(int i=1;i<=number;i++) {
			factorial*=i;}
		System.out.println("Factorial of " +number+ "is:"+ factorial);
		
		}
	}
	

