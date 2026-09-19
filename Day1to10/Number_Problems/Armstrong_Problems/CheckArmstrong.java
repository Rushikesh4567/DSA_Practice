package Day1to10.Number_Problems.Armstrong_Problems;

import java.util.Scanner;

public class CheckArmstrong {
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
        System.err.println("Enter a number to check Armstrong or not: ");
        int n = sc.nextInt();

        if (isArmstrong(n)) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }

}
