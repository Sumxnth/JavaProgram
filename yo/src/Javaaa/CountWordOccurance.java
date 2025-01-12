package Javaaa;

public class CountWordOccurance {
    public static void main(String[] args) {
        String string = "Java is a programming language. Java is widely used in software Testing";
        
        // Convert the entire string to lowercase and split into words
        String[] words = string.toLowerCase().split(" ");
        
        // Word to search for
        String word = "Java is a programming language. Java is widely used in software Testing";
        
        // Variable to count occurrences
        int occurrences = 0;
        
        // Loop through each word in the words array
        for (int i = 0; i < words.length; i++) {
            // Check if the current word equals the target word (case insensitive)
            if (words[i].equals(word))
                occurrences++; // Increment the count if there's a match
        }
        
        // Print the total number of occurrences of the word
        System.out.println(occurrences);
    }
}

