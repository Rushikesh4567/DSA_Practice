package Logic_Building;

import java.util.*;

public class MaxtempArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        int arr[] = new int[n];

        int currLength = 0;
        int maxlength = 0;
        System.out.println("Enter " + n + " input Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                currLength++;
            } else {
                currLength = 1;
            }

            maxlength = Math.max(maxlength, currLength);
        }

        System.out.println("The max length of subarray is: " + maxlength);
    }
}

/*
 * Longest Increasing Temperature Streak
 * A weather station records the daily temperatures for N consecutive days.
 * Find the length of the longest contiguous strictly increasing sequence.
 * Input Format
 * • First line contains integer N
 * • Second line contains N integers
 * 
 * Output Format
 * Print the maximum length of a strictly increasing contiguous subarray.
 * 
 * Sample Input
 * 10
 * 22 24 26 21 23 25 27 18 19 20
 * 
 * Sample Output
 * 4
 * 
 * Explanation
 * The longest increasing contiguous sequence is:
 * 21 23 25 27
 * 
 * Hence the answer is 4.
 * 
 */