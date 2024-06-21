package Javaaa;

public class SecondSmallestNoArary {
public static void main(String[]args) {
	int arr[]= {2,19,99,1};
	int smallest=arr[0];
	int secondSmallest=arr[1];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]<smallest) {
			secondSmallest=smallest;
			smallest=arr[i];
		}
		else if(arr[i]<secondSmallest && arr[i]!=smallest) {
			secondSmallest=arr[i];
		}
	}
	System.out.println("The second smallest element in the array is: " + secondSmallest);
}
}
