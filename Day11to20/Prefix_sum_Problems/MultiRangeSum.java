package Day11to20.Prefix_sum_Problems;

public class MultiRangeSum {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 5, 3 };
        int[] prefix = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        int sum_1_3 = prefix[3 + 1] - prefix[1];
        int sum_2_5 = prefix[5 + 1] - prefix[2];
        int sum_0_4 = prefix[4 + 1] - prefix[0];

        System.out.println("sum of elements from 1 to 3 is: " + sum_1_3);
        System.out.println("sum of elements from 1 to 3 is: " + sum_2_5);
        System.out.println("sum of elements from 1 to 3 is: " + sum_0_4);
    }
}
