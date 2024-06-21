package Javaaa;

public class ReverseString {
	public static void main(String[]args)
	{
String originalString= "123";
//this line calls RS method with OS as argument
String reversedString=reverseString(originalString);
System.out.println("OG"+ originalString);
System.out.println("RS"+ reversedString);
	}
	//The RS method takes a String as an argument & returns its reversed version
	public static String reverseString(String str)
	{
		//Create a new StringBuilder to hold the reversed string 
		StringBuilder reversed=new StringBuilder();
		//(str.length()-1) gives the index of last character in string
		//i-- decrements the index in each iteration
		for(int i=str.length()-1;i>=0;i--)
		{
			//append each character to String builder
			reversed.append(str.charAt(i));
		}
		//This line converts the StringBuilder object to a String using toString() and returns it
		return reversed.toString();
	}
	//String reversedString= new StringBuffer(originalString).reverse().toString();

}
