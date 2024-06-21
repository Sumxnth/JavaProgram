package Javaaa;

import java.util.Scanner;

public class Armstrongggg {
public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a number");
	int number=scanner.nextInt();
	scanner.close();
	
	int sum=0;
	int copy=number;
	while(number!=0) {
		int rem=number%10;
		sum=sum+(rem*rem*rem);
		number=number/10;
	}
	if(copy==sum) 
		{
			System.out.println(sum+"is armstrong");
		}
		else {
			System.out.println(sum+"is not armstrong");
		}
}}