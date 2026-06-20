package Logic_Building;

import java.util.*;

public class BalanceSegment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " array Elements: ");
        int arr[] = new int[n];

        int totalSum = 0, rightSum = 0, leftSum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        for (int i = 0; i < n; i++) {
            rightSum = totalSum - leftSum - arr[i];

            if (rightSum == leftSum) {
                count++;
            }

            leftSum += arr[i];
        }

        System.out.println("The count of balanced indices are: " + count);

    }
}
