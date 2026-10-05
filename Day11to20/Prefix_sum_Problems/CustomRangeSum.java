package Day11to20.Prefix_sum_Problems;

import java.util.Scanner;

public class CustomRangeSum {
    public static int CalculateRangeSum(int left, int right, int[] arr) {
        int[] prefix = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
        int sum = prefix[right + 1] - prefix[left];

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 4, 1, 5, 3 };
        System.out.println("The array we are using is: ");

        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println("\nEnter left and right position for calculating range sum: ");
        int left = sc.nextInt();
        int right = sc.nextInt();

        int result = CalculateRangeSum(left, right, arr);
        System.out.println("The sum between " + left + " to " + right + " is: " + result);
    }
}
