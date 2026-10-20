package Day11to20.Prefix_sum_Problems;

public class RangeSum {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 5, 3 };
        int[] prefix = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        int sum = prefix[3 + 1] - prefix[1];

        System.out.println("sum of elements from 1 to 3 is: " + sum);
    }
}
