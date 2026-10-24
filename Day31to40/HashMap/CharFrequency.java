package HashMap;

import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        String s = "Programming";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Frequency of each character in a string is: ");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

/*
 * Question 2 – Character Frequency
 * 
 * Given a string, print the frequency of every character.
 * 
 * Input
 * 
 * programming
 * 
 * Output
 * 
 * p -> 1
 * r -> 2
 * o -> 1
 * g -> 2
 * a -> 1
 * m -> 2
 * i -> 1
 * n -> 1
 */
