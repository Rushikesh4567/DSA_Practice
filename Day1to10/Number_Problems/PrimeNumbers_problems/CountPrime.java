package Day1to10.Number_Problems.PrimeNumbers_problems;

import java.util.Scanner;

public class CountPrime {
    public static boolean CountkPrimeNumbers(int num) {
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
        int count = 0;

        System.out.println("Enter " + N + " Array elements: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (CountkPrimeNumbers(arr[i])) {
                count++;
            }
        }
        System.out.println("The prime numbers between 1 to " + N + " are: " + count);
    }
}
