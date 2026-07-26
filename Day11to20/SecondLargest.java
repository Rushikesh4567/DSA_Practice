package Day11to20;

public class SecondLargest {

    public static void main(String args[]) {
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        int arr[] = { 44, 66, 77, 11, 6, 78 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondmax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secondmax) {
                secondmax = arr[i];
            }
        }

        System.out.println("Second max is: " + secondmax);
    }
}
