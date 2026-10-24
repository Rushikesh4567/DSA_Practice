package HashSet;

import java.util.HashSet;

public class InterSectionArrays {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4 };
        int[] array2 = { 3, 4, 5, 6 };

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < array1.length; i++) {
            if (!set.contains(array1[i])) {
                set.add(array1[i]);
            }
        }

        System.out.println("Intersection of two arrays are: ");
        for (int i = 0; i < array2.length; i++) {
            if (set.contains(array2[i])) {
                System.out.print(array2[i] + " ");
            }
        }

    }
}

/*
 * Intersection of Two Arrays
 * Problem Statement
 * 
 * Given two arrays, print the common (intersection) elements.
 * 
 * Example
 * 
 * Input
 * 
 * Array 1:
 * 1 2 3 4 5
 * 
 * Array 2:
 * 3 4 7 8
 * 
 * Output
 * 
 * 3 4
 * 
 * Time Complexity: O(n+m)
 * Space Complexity: O(n)
 */