package HashSet;

import java.util.HashSet;

public class UnionArrays {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4 };
        int[] array2 = { 3, 4, 5, 6 };

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < array1.length; i++) {
            if (!set.contains(array1[i])) {
                set.add(array1[i]);

            }
        }

        for (int i = 0; i < array2.length; i++) {
            if (!set.contains(array2[i])) {
                set.add(array2[i]);
            }
        }

        System.out.println("Union of two arrays is: " + set.size());

    }

}
/*
 * Question 5: Union of Two Arrays
 * 
 * Print the number of unique elements after combining two arrays.
 * 
 * Input
 * 
 * Array1
 * 1 2 3 4
 * 
 * Array2
 * 3 4 5 6
 * 
 * Output
 * 
 * 6
 * 
 * Concepts
 * 
 * HashSet add
 * Union
 */