package Day11to20.Prefix_sum_Problems;

public class BuildPrefixSum3 {

    public static void main(String[] args) {
        int[] arr = { 5, 2, 7, 3, 6 };
        int[] prefix = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        for (int i = 0; i < prefix.length; i++) {
            System.out.print(prefix[i] + " ");
        }
    }
}
