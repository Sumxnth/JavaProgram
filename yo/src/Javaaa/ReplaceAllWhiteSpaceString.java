package Javaaa;

public class ReplaceAllWhiteSpaceString {
	public static void main(String[]args) {

 String str1= "sumanth     likes    to play	games";
 String str2=str1.replaceAll("\\s", "");
 System.out.println(str2);
	}}