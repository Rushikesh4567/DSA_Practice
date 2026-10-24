package HashSet;

import java.util.*;

public class LongestConsecutive {

    public static void main(String[] args) {
        int arr[] = { 100, 101 };

        HashSet<Integer> set = new HashSet<>();

        int longest = 0;

        for (int n : arr) {
            set.add(n);
        }

        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        System.out.println(longest);
    }
}

/*
 * Longest Consecutive Sequence
 * Example
 * 100 4 200 1 3 2
 * 
 * Output
 * 
 * 4
 * 
 * Sequence is
 * 
 * 1 2 3 4
 */