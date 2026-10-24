package HashMap;

import java.util.*;

public class TwoSum {
    public static int[] findTwoSum(int arr[], int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(arr[i], i);
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target Element: ");
        int target = sc.nextInt();

        System.out.println("Enter size of array ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result[] = findTwoSum(arr, target);
        System.out.println("Two sum of elements at: ");

        for (int num : result) {
            System.out.println(num);
        }
    }
}

/*
 * Find two indices whose values add up to target.
 * 
 * Input
 * 
 * nums = [2,7,11,15]
 * target = 9
 * 
 * Output
 * 
 * 0 1
 * 
 * Expected Complexity
 * 
 * Time : O(n)
 * Space : O(n)
 */