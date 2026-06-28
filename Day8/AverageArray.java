package Day8;

import java.util.Scanner;

public class AverageArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;

        System.out.println("Enter array Elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        double avg = (double) sum / n;

        System.out.println("The Average of array is: " + avg);

    }
}
