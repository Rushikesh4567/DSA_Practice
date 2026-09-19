package Day1to10.Number_Problems.Palindrome_problems;

import java.util.Scanner;

public class CountPalindrome {
    public static boolean findPalindrome(int num) {
        int digit = 0;
        int n = Math.abs(num);
        int rev = 0;

        while (n != 0) {
            digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        return rev == Math.abs(num);
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
        }

        for (int i = 0; i < N; i++) {
            if (findPalindrome(arr[i])) {
                count++;
            }
        }

        System.out.println("Count of palindrome numbers in an array is: " + count);
    }
}
