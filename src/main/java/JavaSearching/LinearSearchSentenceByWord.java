/*
 * Linear Search Problem 2: Find a Sentence Containing a Word
 *
 * Problem Statement:
 * Given an array of sentences and a target word, return the first sentence containing that word, or Not Found if no sentence matches.
 *
 * Hint:
 * Check each sentence in order. Match the target as a whole word, ignoring case, rather than matching part of a longer word.
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */
package JavaSearching;


class LinearSearchSentenceByWord {
    // Return the first sentence containing the target as a whole word.
    static String findSentence(String[] sentences, String target) {
        for (String sentence : sentences) {
            String[] words = sentence.split("\\W+");
            for (String word : words) {
                if (word.equalsIgnoreCase(target)) return sentence;
            }
        }
        return "Not Found";
    }
    // Run the example.
    public static void main(String[] args) {
        String[] sentences = {
            "Java is widely used.",
            "Searching arrays is useful.",
            "I am learning Java programming."
        };
        System.out.println(findSentence(sentences, "java"));
    }
}
