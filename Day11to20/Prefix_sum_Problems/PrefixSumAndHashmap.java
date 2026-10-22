package Day11to20.Prefix_sum_Problems;

import java.util.HashMap;

public class PrefixSumAndHashmap {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, -2, 5 };
        int target = 3;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Important: prefix sum 0 has occurred once
        map.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : arr) {

            currentSum += num;

            int required = currentSum - target;

            if (map.containsKey(required)) {
                count += map.get(required);
            }

            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        System.out.println(count);
    }
}
