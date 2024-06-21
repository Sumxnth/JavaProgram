package Javaaa;

import java.util.HashSet;
import java.util.Set;

public class prac {
	public static void main(String[]args) {
		int arr[]= {11,22,22,44,44,55,66,66,};
		Set<Integer> uset=new HashSet<>();
		Set<Integer> dset=new HashSet<>();
		for(int val:arr) {
			if(!uset.add(val)) { 
				
			dset.add(val);
		}}
		System.out.println(uset);
		
}
}

