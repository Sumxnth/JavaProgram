package Javaaa;

		public class SecondSmallestNoArary {
			
			    public static void main(String[] args) {
			        int[] arr = { 2, 19, 99, 1 };

			        // Initialize variables to hold smallest, second smallest, largest, and second largest numbers
			        int smallest = Integer.MAX_VALUE;
			        int secondSmallest = Integer.MAX_VALUE;
			        int largest = Integer.MIN_VALUE;
			        int secondLargest = Integer.MIN_VALUE;

			        // Traverse the array to find second smallest and second largest numbers
			        for (int i = 0; i < arr.length; i++) {
			            // Finding second smallest number
			            if (arr[i] < smallest) {
			                secondSmallest = smallest;
			                smallest = arr[i];
			            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
			                secondSmallest = arr[i];
			            }
			            			
			            // Finding second largest number
			            if (arr[i] > largest) {
			                secondLargest = largest;
			                largest = arr[i];
			            } else if (arr[i] > secondLargest && arr[i] != largest) {
			                secondLargest = arr[i];
			            }
			        }

			        // Print the results
			        System.out.println("The second smallest element in the array is: " + secondSmallest);
			        System.out.println("The second largest element in the array is: " + secondLargest);
			    }
			}
		
		

