package Logic_Building;

import java.util.*;

public class EvenSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int sum = 0;
        int maxLength = 0;

        HashMap<Integer, Integer> firstIndex = new HashMap<>();

        firstIndex.put(0, -1);

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {

            sum += sc.nextInt();

            int parity = sum % 2;

            if (firstIndex.containsKey(parity)) {
                maxLength = Math.max(maxLength, i - firstIndex.get(parity));
            } else {
                firstIndex.put(parity, i);
            }
        }

        System.out.println("The max length of even sub array is: " + maxLength);

    }
}

/*
 * Longest Even Sum Subarray
 * Given an array of integers, determine the length of the longest contiguous
 * subarray whose sum is even.
 * Input
 * 7
 * 2 5 3 8 6 1 4
 * Output
 * 6
 */