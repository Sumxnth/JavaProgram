package Javaaa;

public class LargestNoArray {
	public static void main(String[]args) {
		int[]arr= {80,6,4,55,99};
		int largest=arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
			
		System.out.println("The largest element in the array is: " + largest);
	}

}
