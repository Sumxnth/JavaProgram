package Javaaa;

import java.util.ArrayList;

public class FindandLastElement {

	    public static void main(String[] args) {
	        // Initialize an ArrayList with elements
	        ArrayList<Integer> list = new ArrayList<Integer>();//Here we initialized arraylist and named it as list to store the element
	        list.add(4);//These lines adds five integers (4, 2, 3, 1, 6) to the ArrayList list.
	        list.add(2);
	        list.add(3);
	        list.add(1);
	        list.add(6);

	        // Find first element
	        int first = list.get(0);

	        // Find last element
	        int last = list.get(list.size()-1);//list.size() returns the number of elements in the ArrayList (5 in this case).

	        // Output the results
	        System.out.println("First is: " + first + ", Last is: " + last);
	    }
	
}
