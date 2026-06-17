package Logic_Building;

import java.util.*;

public class Corporate_talent {

    public static boolean isPrime(int val) {
        if (val < 2)
            return false;

        for (int i = 2; i * i <= val; i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        int sum = 0;
        int max = Integer.MIN_VALUE;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            max = Math.max(max, arr[i]);
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        double avg = (double) sum / n;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int x = arr[i];

            if (isPrime(x) && x > avg && x != max && freq.get(x) == 1) {
                int temp = x;
                int digitsum = 0;

                while (temp > 0) {
                    digitsum += temp % 10;
                    temp /= 10;
                }

                if (digitsum % 2 == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}