package Logic_Building;

import java.util.*;

public class Employee {

    static boolean isValid(int num) {
        int original = num;
        int rev = 0;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;

            rev = rev * 10 + digit;
            sum += digit;

            num = num / 10;
        }

        return original == rev && sum % 5 != 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        int max = Integer.MIN_VALUE;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            if (a[i] > max) {
                max = a[i];
            }

            freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] < max &&
                    isValid(a[i]) &&
                    freq.get(a[i]) == 1) {

                count++;
            }
        }

        System.out.println(count);
    }
}