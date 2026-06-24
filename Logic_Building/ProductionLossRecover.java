package Logic_Building;

import java.util.*;

public class ProductionLossRecover {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        long totalsum = 0;
        long maxval = Long.MIN_VALUE;
        long minval = Long.MAX_VALUE;

        System.out.println("Enter array elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalsum += arr[i];

        }

        int minidx = 0;
        int maxidx = 0;

        for (int i = 0; i < n; i++) {
            long production = totalsum - arr[i];
            if (production > maxval) {
                maxval = production;
                maxidx = i;
            }

            if (production < minval) {
                minval = production;
                minidx = i;

            }
        }

        System.out.println(maxval + " " + maxidx + " " + minval + " " + minidx + " ");

    }

}

/*
 * Production Loss Recovery Analysis
 * 
 * A manufacturing company records the daily production output of a factory for
 * N days.
 * 
 * Management wants to analyze the impact of each day's production on the
 * overall output.
 * 
 * For every day i, compute the total production of all other days except day i.
 * 
 * Among all such values, determine:
 * 
 * The maximum production obtainable after excluding exactly one day and the
 * index of the day whose exclusion produces this maximum value.
 * The minimum production obtainable after excluding exactly one day and the
 * index of the day whose exclusion produces this minimum value.
 * 
 * If multiple indices produce the same result, choose the smallest index.
 * 
 * Input Format
 * First line contains an integer N.
 * Second line contains N space-separated integers:
 * A1 A2 A3 ... AN
 * Output Format
 * 
 * Print:
 * 
 * MaxProduction MaxIndex MinProduction MinIndex
 * Constraints
 * 1 ≤ N ≤ 100000
 * -10^9 ≤ Ai ≤ 10^9
 * Example
 * Input
 * 5
 * 10 20 30 40 50
 * Output
 * 140 0 100 4
 * Explanation
 * 
 * Total Production:
 * 
 * 10 + 20 + 30 + 40 + 50 = 150
 * 
 * Production after excluding each day:
 * 
 * Index 0 → 150 - 10 = 140
 * Index 1 → 150 - 20 = 130
 * Index 2 → 150 - 30 = 120
 * Index 3 → 150 - 40 = 110
 * Index 4 → 150 - 50 = 100
 * 
 * Therefore:
 * 
 * Maximum Production = 140 at index 0
 * Minimum Production = 100 at index 4
 */