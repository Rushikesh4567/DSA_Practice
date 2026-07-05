package Logic_Building;

import java.util.*;

public class ConveryerBelt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        int totalsum = 0, leftsum = 0, rightsum = 0;
        long mindiff = Long.MAX_VALUE;

        System.out.println("Enter array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalsum += arr[i];
        }

        for (int i = 0; i < n; i++) {

            leftsum += arr[i];
            rightsum = totalsum - leftsum;

            long diff = Math.abs(leftsum - rightsum);

            if (diff < mindiff) {
                mindiff = diff;
            }
        }

        System.out.println("Minimum possible absoulte difference is: " + mindiff);

    }
}

/*
 * Question 1: Smart Conveyor Partition (2023)
 * Problem Statement
 * 
 * A manufacturing company uses a long conveyor belt to transport products.
 * 
 * Each product has a positive integer weight.
 * 
 * The conveyor belt must be divided into two non-empty continuous sections such
 * that the absolute difference between the total weight of the left section and
 * the right section is minimized.
 * 
 * Your task is to determine the minimum possible absolute difference.
 * 
 * Input Format
 * The first line contains an integer N, representing the number of products.
 * The second line contains N space-separated integers representing the weights.
 * Output Format
 * 
 * Print a single integer representing the minimum possible absolute difference.
 * 
 * Constraints
 * 1 ≤ N ≤ 2 × 10^5
 * 1 ≤ Weight[i] ≤ 10^9
 * Sample Input
 * 6
 * 3 1 2 4 3 2
 * Sample Output
 * 1
 * Explanation
 * 
 * Possible partitions:
 * 
 * 3 | 1 2 4 3 2 Difference = 9
 * 3 1 | 2 4 3 2 Difference = 7
 * 3 1 2 | 4 3 2 Difference = 3
 * 3 1 2 4 | 3 2 Difference = 5
 * 3 1 2 4 3 | 2 Difference = 11
 * 
 * Minimum difference = 1.
 */
