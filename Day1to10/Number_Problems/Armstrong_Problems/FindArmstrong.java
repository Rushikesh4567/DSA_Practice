package Day1to10.Number_Problems.Armstrong_Problems;

import java.util.Scanner;

public class FindArmstrong {
    public static boolean isArmstrong(int num) {

        int temp = num;
        int digits = 0;
        int digit = 0;
        int sum = 0;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        temp = num;

        while (temp != 0) {
            digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp = temp / 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        System.out.println("Enter " + N + " Array elements: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Armstrong numbers in this array is: ");
        for (int i = 0; i < N; i++) {
            if (isArmstrong(arr[i])) {
                System.out.println(arr[i]);
            }
        }

    }
}
