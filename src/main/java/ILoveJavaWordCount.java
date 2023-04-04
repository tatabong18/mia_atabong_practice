import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ILoveJavaWordCount {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a line of text: ");
            String line = scanner.nextLine();

            // Split the line into words
            String[] words = line.split(" ");

            // Count the frequency of each word
            Map<String, Integer> wordCounts = new HashMap<>();
            for (String word : words) {
                // Remove the dot if it's at the end of the word
                if (word.endsWith(".")) {
                    word = word.substring(0, word.length() - 1);
                }
                // Increment the count for this word
                Integer count = wordCounts.getOrDefault(word, 0);
                wordCounts.put(word, count + 1);
            }

            // Print the results
            System.out.println("Word counts:");
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

