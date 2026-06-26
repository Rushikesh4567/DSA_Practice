package Logic_Building;

import java.util.*;

public class TargetFrequency {

    public static int FirstOccurence(int arr[], int x) {
        int high = arr.length - 1;
        int low = 0;
        int mid = 0, ans = -1;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static int LastOccurence(int arr[], int x) {
        int high = arr.length - 1;
        int low = 0, ans = -1, mid = 0;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Target Element: ");
        int x = sc.nextInt();

        int first = FirstOccurence(arr, x);
        int last = LastOccurence(arr, x);

        int freq = (last - first) + 1;
        int gap = last - first;
        int indexSum = (first + last) * freq / 2;

        System.out.println(first + " " + last + " " + freq + " " + gap + " " + indexSum);

    }
}
