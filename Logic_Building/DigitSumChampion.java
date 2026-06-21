
package Logic_Building;

import java.util.*;

public class DigitSumChampion {

    public static int FindDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maxDigitsum = -1;
        int champion = 0;

        System.out.print("Enter total id: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + "id: ");

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int sum = FindDigitSum(id);

            if (sum > maxDigitsum) {
                maxDigitsum = sum;
                champion = id;
            } else if (sum == maxDigitsum && id > champion) {
                champion = id;
            }
        }

        System.out.println("Champion no. is: " + champion);
    }
}
