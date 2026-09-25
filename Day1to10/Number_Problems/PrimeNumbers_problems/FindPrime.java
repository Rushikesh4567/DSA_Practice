package Day1to10.Number_Problems.PrimeNumbers_problems;

import java.util.Scanner;

public class FindPrime {
    public static boolean CheckPrimeNumbers(int num) {
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        return isPrime;
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

        System.out.println("Prime numbers in this array is: ");
        for (int i = 0; i < N; i++) {
            if (CheckPrimeNumbers(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }
}
