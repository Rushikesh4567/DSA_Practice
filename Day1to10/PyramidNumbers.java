package Day1to10;

import java.util.Scanner;

public class PyramidNumbers {
    public static void printArray(int n) {

        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row size: ");
        int n = sc.nextInt();

        printArray(n);
    }
}
