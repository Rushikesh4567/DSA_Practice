package Day11to20.Prefix_sum_Problems;

public class BuildPrefixArray1 {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 5, 3 };
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.println("Prefix sum array is");
        for (int x : prefix) {
            System.out.print(x + " ");
        }
    }
}