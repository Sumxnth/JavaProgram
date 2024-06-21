package Javaaa;

import java.util.HashSet;
import java.util.Set;

public class FindingDuplicateArray {
	public static void main(String[]args) {
	int[]arr= {1,2,3,3,8,8};
	Set<Integer> uniqueSet= new HashSet<>();
	Set<Integer> duplicateSet= new HashSet<>();
	for(int val:arr) {
		if(!uniqueSet.add(val)) {
			duplicateSet.add(val);
	}}
	System.out.println(duplicateSet);

}}
