package HashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total elements: ");
        int n = sc.nextInt();

        Map<Integer, Integer> map = new LinkedHashMap<>();

        int arr[] = new int[n];

        System.out.println("Enter Array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println("Duplicate elements are: ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}

/*
 * Question 4 – Find Duplicate Numbers
 * 
 * Print all numbers that appear more than once.
 * 
 * Input
 * 
 * 8
 * 2 5 3 2 6 5 8 5
 * 
 * Output
 * 
 * 2
 * 5
 */