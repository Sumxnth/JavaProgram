package Javaaa;

import java.util.Arrays;

public class Anagram {
	public static boolean areAnagram(String str1, String str2) {
		str1=str1.replaceAll("\\s", "").toLowerCase();
		str2=str2.replaceAll("\\s", "").toLowerCase();
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		char[]charArray1=str1.toCharArray();
		char[]charArray2=str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);}
	public static void main(String []args) {
		String string1="BOW";
		String string2="WOB";
		
		if(areAnagram(string1, string2)) {
			System.out.println(string1+" and "+string2+" areanagrams ");}
		else {
			System.out.println(string1+" and "+string2+" are Not anagrams ");
		}
		
		
	}

}
