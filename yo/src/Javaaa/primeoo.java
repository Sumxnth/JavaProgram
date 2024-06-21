package Javaaa;

import java.util.Scanner;

public class primeoo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scanner.nextInt();
		scanner.close();
		
		
		int count = 0;
		for (int i = 1; i<= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(number+"is a prime");
		}
		else {
		System.out.println(number+"not a prime");
		

	}}

}
