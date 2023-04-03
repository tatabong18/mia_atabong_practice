package array;

import java.util.HashMap;
public class MainHomework {
        public static void main(String[] args) {
                String text = "I love Java. You love Java. She loves Java.";
                String[] words = text.split(" ");
                // Initialize a HashMap to store the word counts
                HashMap<String, Integer> wordCounts = new HashMap<String, Integer>();
                // Loop through the words and update the word counts
                for (String word : words) {
                        // Remove the dot if it exists
                        if (word.endsWith(".")) {
                                word = word.substring(0, word.length() - 1);
                        }
                        // Update the word count
                        if (wordCounts.containsKey(word)) {
                                wordCounts.put(word, wordCounts.get(word) + 1);
                        } else {
                                wordCounts.put(word, 1);
                        }
                }
                // Print out the word counts
                for (String word : wordCounts.keySet()) {
                        int count = wordCounts.get(word);
                        System.out.println("\"" + word + "\" occurs " + count + " times");
                }
        }
}