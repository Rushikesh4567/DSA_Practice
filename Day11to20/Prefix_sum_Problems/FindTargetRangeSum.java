package Day11to20.Prefix_sum_Problems;

public class FindTargetRangeSum {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 5, 3 };
        int[] prefix = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        int target = 8;
        int l = 1;
        int r = 3;

        int sum = prefix[r + 1] - prefix[l];
        if (sum == target) {
            System.out.println("Yes, target found!");
        } else {
            System.out.println("Target Not found!");
        }
    }
}
