package HashMap;

import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("First Non-repeating character in a string is: ");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;

            }
        }
    }
}

/*
 * Question 5 – First Non-Repeating Character
 * 
 * Return the first character that appears only once.
 * 
 * Input
 * 
 * aabbcdde
 * 
 * Output
 * 
 * c
 */