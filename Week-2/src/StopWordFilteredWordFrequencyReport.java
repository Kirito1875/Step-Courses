import java.util.*;

public class StopWordFilteredWordFrequencyReport {
    public static void printFilteredWordFrequency(String feedback) {
        // 1. Define the fixed list of stop words
        List<String> stopWords = Arrays.asList("the", "was", "and", "a", "is", "of", "in");

        // 2. Normalize text: lowercase and remove periods/commas using replace()
        String normalized = feedback.toLowerCase().replace(".", "").replace(",", "");

        // 3. Split the cleaned text into individual words
        String[] words = normalized.split("\\s+");

        // 4. Count frequencies of remaining valid words using a HashMap
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            // Skip empty strings (from extra spaces) and skip stop words
            if (!word.isEmpty() && !stopWords.contains(word)) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        // 5. Sort the map by count in descending order
        // To sort a Map by values, we convert its entries to a List
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(frequencyMap.entrySet());
        sortedEntries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // 6. Print the result
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        // Testing the sample input from the assignment
        String input = "The mentor was great, the session was great and clear.";
        printFilteredWordFrequency(input);
    }
}
