package Javaaa;

import java.util.Scanner;

public class PrintDuplicateChara {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scanner.nextLine();
		System.out.println("Dupplicate characters");
		char[] carray = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (carray[i] == carray[j] && carray[i] != ' ') {
					System.out.println(carray[j]);
					break;
				}
			}
		}
	}

}
