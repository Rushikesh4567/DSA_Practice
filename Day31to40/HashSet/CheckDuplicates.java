package HashSet;

import java.util.*;

public class CheckDuplicates {
    public static void main(String[] args) {
        boolean flag = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        HashSet<Integer> set = new HashSet<>();

        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (!set.contains(arr[i])) {
                set.add(arr[i]);
            } else {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("YES, The arrays contains duplicates.");
        } else {
            System.out.println("NO, Array elements have distinct elements.");
        }

    }
}

/*
 * Question 2: Check if Array Contains Duplicates
 * 
 * Return YES if the array contains any duplicate element; otherwise return NO.
 * 
 * Input
 * 
 * 5
 * 10 20 30 20 40
 * 
 * Output
 * 
 * YES
 * 
 * Concepts
 * 
 * HashSet lookup
 * O(n) solution
 */
