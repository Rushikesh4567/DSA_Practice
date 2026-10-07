package Day11to20.Prefix_sum_Problems;

public class FindPositiveRangeSum {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 5, 3 };
        int[] prefix = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                prefix[i + 1] = prefix[i] + 1;
            } else {
                prefix[i + 1] = prefix[i];
            }

        }

        int l = 1;
        int r = 5;
        int sum = prefix[r + 1] - prefix[l];

        System.out.println("The positive numbers between " + l + " to " + r + " is: " + sum);
    }
}
