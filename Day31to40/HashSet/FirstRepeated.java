package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total elements: ");
        int n = sc.nextInt();

        int count = 1;
        int arr[] = new int[n];

        HashSet<Integer> set = new HashSet<>();

        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
            } else {
                System.out.println(arr[i]);
                break;
            }
            count++;

        }

        if (count == n) {
            System.out.println("NO REPEAT");
        }
    }
}

/*
 * Question 3: First Repeated Element
 * 
 * Print the first element that repeats while traversing the array from left to
 * right.
 * 
 * Input
 * 
 * 7
 * 5 3 4 2 3 1 5
 * 
 * Output
 * 
 * 3
 * 
 * If no repeated element exists, print:
 * 
 * NO REPEAT
 * 
 * Concepts
 * 
 * HashSet
 * Early exit
 */