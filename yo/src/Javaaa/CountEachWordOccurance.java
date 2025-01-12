package Javaaa;

import java.util.HashMap;
import java.util.Map;

public class CountEachWordOccurance {
	public static void main(String[] args) {
		String str = "Alice is Bob girl and Bob is boy";
		Map<String, Integer> hp = new HashMap<>();
		String[] words = str.split(" ");
		for (String word : words) {
		if (hp.containsKey(word))
		hp.put(word, hp.get(word) + 1);
		else
		hp.put(word, 1);
		}
		System.out.println(hp);
		
		//Printing the result in the required format
        for (Map.Entry<String, Integer> entry : hp.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue()); 

}}}
