package Day8;

import java.util.Scanner;

public class SumArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;

        System.out.println("Enter array Elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("The Sum array is: " + sum);

    }

}
