package Javaaa;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String []args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=scanner.nextInt();
	scanner.close();
	int sum=0;
	for(int i=1;i<num;i++) {
		if(num%i==0) {
			sum=sum+i;
			
		}
	}
	if(num==sum) {
		System.out.println("Given number is perfect");
	}else {
		System.out.println("Given number is not perfect");
	}
	
	}

}
