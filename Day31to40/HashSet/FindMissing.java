package HashSet;

import java.util.*;

public class FindMissing {

    public static void main(String[] args) {
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
            }

        }

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                System.out.println("Missing number is: " + i);
                break;
            }

        }

    }
}

/*
 * Find Missing Number
 * Problem
 * 
 * Numbers from 1 to N are given, but one number is missing.
 * 
 * Example
 * Input
 * 
 * 6
 * 1 2 4 5 6
 * 
 * Output
 * 
 * 3
 */