package Day1to10.Number_Problems.Palindrome_problems;

import java.util.Scanner;

public class PrintPalindrome {
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
        System.out.println("Enter a number N to find palindrome between 1-N: ");
        int N = sc.nextInt();

        System.out.println("Palindrome numbers from 1 to N are: ");
        for (int i = 1; i <= N; i++) {
            if (findPalindrome(i)) {
                System.out.println(i + " ");
            }
        }
    }

}
