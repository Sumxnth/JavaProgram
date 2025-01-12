package Javaaa;

import java.util.Scanner;

public class ReverseEntierString {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scanner.nextLine();
		String []string = str.split(" ");
		String ans = "";
		for (int i = string.length- 1; i >= 0; i--) {
		ans = ans + string[i] + " ";
		}
		System.out.println(ans.substring(0, ans.length() - 1));
		

}}
	