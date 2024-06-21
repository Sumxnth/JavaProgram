package Javaaa;

public class BubbleSort {
	   public static void main(String[] args) {
	        int[] arr = { 10, 2, 5, 4, 3, 9, 7 };
	        int n = arr.length;

	        for (int i = 0; i < n - 1; i++) {
	        
	            for (int j = 0; j < n - i - 1; j++) {
	               if (arr[j] > arr[j + 1]) {
	                    
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	        // Print the sorted array
	        System.out.println("Sorted array:");
	        for (int k = 0; k < n; k++) {
	            System.out.print(arr[k] + " ");
	        }
	    }
	}