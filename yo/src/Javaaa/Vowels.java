package Javaaa;

public class Vowels {
	public static void main(String[]args)
	{
	String input="vowe";
	boolean containsVowels= containsVowel(input);
	if(containsVowels){
 System.out.println("contains");}
	else {
 System.out.println("doesnt contains");
 }}
public static boolean containsVowel(String input){
	input=input.toLowerCase();
	String vowels="aeiou";
	for(int i=0;i<input.length();i++)
	{
		char ch=input.charAt(i);
		if(vowels.indexOf(ch )!=-1) {
			return true;
		}
	
}
return false;

}

}
