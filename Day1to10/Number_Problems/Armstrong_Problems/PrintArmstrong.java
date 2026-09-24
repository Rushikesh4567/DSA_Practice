package Day1to10.Number_Problems.Armstrong_Problems;

import java.util.Scanner;

public class PrintArmstrong {
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
        System.out.println("Enter number to find armstorng between 1-N: ");
        int n = sc.nextInt();

        System.out.println("The armstrong numbers between 1 to " + n + " are: ");
        for (int i = 0; i < n; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
