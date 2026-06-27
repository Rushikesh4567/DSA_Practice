package Logic_Building;

import java.util.*;

public class WorkForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        int arr[] = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double avg = (double) sum / n;

        int count = 0;

        for (int x : arr) {
            if (x > avg && x > 0 && x % 2 == 0 && x % 10 != 0) {

                int temp = x;
                int digitSum = 0;

                while (temp > 0) {
                    digitSum += temp % 10;
                    temp /= 10;
                }

                if (digitSum < 5) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
