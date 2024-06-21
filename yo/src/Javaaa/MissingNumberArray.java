package Javaaa;

public class MissingNumberArray {
	public static void main(String[]args) {
		int []arr= {1,2,4,5};
		int []arr2={1,2,3,5};
		int missingNumber=findMissingNumber(arr);
		int missingNumber2=findMissingNumber(arr2);
		System.out.println("Missing number is: "+missingNumber);
		System.out.println("Missing number is: "+missingNumber2);
	}

	public static int findMissingNumber(int[]arr) {
		int n=arr.length+1;
		int expectedSum=n*(n+1)/2;
		int actualSum=0;
		for(int num:arr) {
			
			actualSum+=num;
	}
		return expectedSum-actualSum;
}}
