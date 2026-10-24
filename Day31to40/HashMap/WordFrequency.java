package HashMap;

import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence:");
        String sentence = sc.nextLine();
        Map<String, Integer> map = new LinkedHashMap<>();

        String[] words = sentence.split(" ");

        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        System.out.println("Frequency of each string in a sentence is: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

/*
 * Question 3 – Word Frequency
 * 
 * Given a sentence, print the frequency of each word.
 * 
 * Input
 * 
 * java is easy java is powerful
 * 
 * Output
 * 
 * java -> 2
 * is -> 2
 * easy -> 1
 * powerful -> 1
 */