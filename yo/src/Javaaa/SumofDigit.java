package Javaaa;

import java.util.Scanner;

public class SumofDigit {
	public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a number");
	int no=scanner.nextInt();
	scanner.close();
	int sum=0;
	while(no!=0) {
		int rem=no%10;
		sum=sum+rem;
		no=no/10;
	}
	System.out.println("Sum is: "+sum);
	

}}
