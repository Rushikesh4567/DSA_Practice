package HashMap;

import java.util.*;

public class EmployeeAttendence {
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

        System.out.println("Frequency of each element is: ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}

/*
 * Question 1 – Employee Attendance
 * 
 * Given employee IDs for today's attendance, print how many times each employee
 * appears.
 * 
 * Input
 * 
 * 7
 * 101 102 101 103 102 101 104
 * 
 * Output
 * 
 * 101 -> 3
 * 102 -> 2
 * 103 -> 1
 * 104 -> 1
 * 
 * Concepts
 * 
 * HashMap
 * Frequency counting
 */