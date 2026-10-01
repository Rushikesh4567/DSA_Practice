package Logic_Building;

import java.util.*;

public class UniqueProduct {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int num : arr) {
            if (map.get(num) == 1) {
                System.out.println("product with exact count 1 is: " + num);
                return;
            }
        }

        System.out.println(-1);
    }
}

/*
 * Product Inventory Analysis
 * An e-commerce company stores product IDs in an array. Some IDs are repeated
 * due to duplicate entries.
 * Find the first product ID that appears exactly once.
 * If no such ID exists, print -1.
 * Input
 * 8
 * 15 22 15 18 22 30 18 45
 * Output
 * 30
 */