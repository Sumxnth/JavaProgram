package Javaaa;

public class ReverseEachWord {
	public static void main(String[] args) {
		String str="bvc olla";
		String word[]=str.split("\\s");
		String rw="";
		for(String w:word) {
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			rw=rw+sb.toString()+" ";
		}
		System.out.println(rw);
		
}}
//is used to create a StringBuilder object initialized with the string w