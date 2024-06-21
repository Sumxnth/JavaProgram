package Javaaa;

import java.util.Scanner;

public class RemoveWhiteSpace {
public static void main(String[]args) {
	 Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a string: ");
     String str1 = scanner.nextLine();
     scanner.close();
		char[]chars=str1.toCharArray();
		StringBuilder sb= new StringBuilder();
		for(int i=0; i<chars.length;i++) {
			if(chars[i]!=' ' && chars[i]!='\t')
			{
				sb.append(chars[i]);
			}
		}
		
		System.out.println(sb);
	}

}
