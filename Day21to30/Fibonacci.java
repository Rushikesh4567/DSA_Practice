package Day21to30;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value N to print fibonacci from 1 to N: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int next = 0;

        System.out.println("Fibonacci series from 1 to " + n + " is:");

        for (int i = 0; i < n; i++) {
            System.err.println(a);
            next = a + b;
            a = b;
            b = next;
        }

    }
}
