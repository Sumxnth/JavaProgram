package Javaaa;

import java.util.Scanner;

public class fibonaci {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scanner.nextInt();
		System.out.println("Fibonnaci series up to"+ number+":");
		printFibonacciSeries(number);
		scanner.close();
		
	}
	
	public static void printFibonacciSeries(int number) {
		int a=0, b=1;
		if(number<0) {
		System.out.println("Please enter a non-negative number" );
		return;}
		
		if(number>=0) {
			System.out.println(a+"");
			
		}
		if(number>=1) {
			System.out.println(b+"");
		}
		int next;
	while(true) {
		next=a+b;
		if(next>number) {
			break;
		}
		System.out.println(next+"");
		a=b;
		b=next;
	}
	System.out.println();
	}
	

}
