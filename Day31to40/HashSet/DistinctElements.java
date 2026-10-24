
package HashSet;

import java.util.*;

public class DistinctElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total elements: ");
        int n = sc.nextInt();

        int x = 0;

        HashSet<Integer> set = new HashSet<>();

        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            if (!set.contains(x)) {
                set.add(x);

            }

        }

        System.out.println("Count of distinct elements are:  " + set.size());

    }
}
/*
 * Question 1: Count Distinct Elements
 * 
 * Given an array of integers, print the number of distinct elements.
 * 
 * Input
 * 
 * 7
 * 1 2 3 2 1 4 5
 * 
 * Output
 * 
 * 5
 * 
 * Concepts
 * 
 * HashSet
 * Removing duplicates
 */