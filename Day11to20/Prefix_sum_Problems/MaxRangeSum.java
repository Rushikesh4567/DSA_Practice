package Day11to20.Prefix_sum_Problems;

public class MaxRangeSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int[] prefix = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        int queries[][] = {
                { 0, 3 }, { 2, 5 }, { 1, 6 }, { 4, 7 }
        };

        int MaxSum = Integer.MIN_VALUE;
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];

            int sum = prefix[r + 1] - prefix[l];

            System.out.print(sum + " ");

            if (sum > MaxSum) {
                MaxSum = sum;
            }
        }

        System.out.println("Maxsum in a range is: " + MaxSum);
    }
}
