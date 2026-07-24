package Logic_Building;

import java.util.*;

public class LogicOne {

    // Check if first and last digits are the same
    public static boolean isSameDigit(int n) {
        int lastDigit = n % 10;
        int firstDigit = n;

        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        return firstDigit == lastDigit;
    }

    // Check if sum of digits is even
    public static boolean isEvenSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int max = -1;

        for (int num : arr) {
            if (map.get(num) == 1 &&
                    isSameDigit(num) &&
                    isEvenSum(num)) {

                max = Math.max(max, num);
            }
        }

        System.out.println(max);
    }
}

/*
 * Question
 * 
 * Given an array of N integers, find the largest unique number that satisfies
 * all of the following conditions:
 * 
 * The number appears exactly once in the array.
 * The first digit of the number is equal to its last digit.
 * The sum of its digits is even.
 * 
 * If no such number exists, print -1.
 * 
 * Input Format
 * The first line contains an integer N, the size of the array.
 * The second line contains N space-separated integers.
 * Output Format
 * Print the largest integer satisfying all the above conditions.
 * If no such integer exists, print -1.
 * Constraints
 * 1 ≤ N ≤ 10^5
 * 1 ≤ arr[i] ≤ 10^9
 * Example 1
 * 
 * Input
 * 
 * 8
 * 121 343 4554 989 343 7007 818 4554
 * 
 * Output
 * 
 * 7007
 */
