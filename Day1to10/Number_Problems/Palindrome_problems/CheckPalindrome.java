package Day1to10.Number_Problems.Palindrome_problems;

import java.util.Scanner;

public class CheckPalindrome {
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
        System.out.println("Enter a number to check palindrome or not: ");
        int num = sc.nextInt();

        boolean check = findPalindrome(num);

        if (check) {
            System.out.println("This number is palindrome");
        } else {
            System.out.println("This number is not palindrome");
        }
    }

}
