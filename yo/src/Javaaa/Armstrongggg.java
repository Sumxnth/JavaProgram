package Javaaa;

import java.util.Scanner;

public class Armstrongggg {
public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=scanner.nextInt();
	scanner.close();
	
	int sum=0;
	int copy=num;
	while(num!=0) {
		int rem=num%10;
		sum=sum+(rem*rem*rem);
		num=num/10;
	}
	if(copy==sum) 
		{
			System.out.println(sum+"is armstrong");
		}
		else {
			System.out.println(sum+"is not armstrong");
		}
}}

