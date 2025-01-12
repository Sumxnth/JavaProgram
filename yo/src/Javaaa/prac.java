package Javaaa;

import java.util.Scanner;


public class prac {
	
	public static void main (String[]args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String result="";
		for(int i=0;i<str.length()-1;i++) {
			String ch=""+str.charAt(i);
			if(result.contains(ch) && !ch.equals("")) {
				continue;
			}
			result+=ch;
		}
		
		System.out.println(result);
	}}
