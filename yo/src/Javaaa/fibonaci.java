package Javaaa;

import java.util.Scanner;

public class fibonaci {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scanner.nextInt();
		System.out.println("Fibonnaci series up to"+ number+":");
		
		int firstNum=0;
		int secondNum=1;
		int nextNum;
		for(int i=1;i<=number;i++) {
			System.out.println(firstNum);
			nextNum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=nextNum;
			
			
		}
		

}}
