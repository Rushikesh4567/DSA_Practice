package Logic_Building;

import java.util.*;

public class ShelfBalancer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total Products: ");
        int n = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println("Enter product values: ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int uniqueCount = 0;

        for (int freq : map.values()) {
            if (freq == 1) {
                uniqueCount++;
            }
        }

        System.out.println("Minimum operations are: " + (uniqueCount + 1) / 2);
    }
}

/*
 * Question 2: Smart Warehouse Shelf Balancer (2022)
 * Problem Statement
 * 
 * A logistics company stores products on a warehouse shelf. Each product is
 * assigned a positive integer weight.
 * 
 * A shelf is considered balanced if every distinct weight appears at least
 * twice.
 * 
 * In one operation, you may change the weight of any one product to any
 * positive integer.
 * 
 * Determine the minimum number of operations required to make the shelf
 * balanced.
 * 
 * Note
 * 
 * A weight appearing exactly once is called a unique weight.
 * You may change a weight to:
 * an existing weight already present in the array, or
 * a completely new positive integer.
 * Input Format
 * The first line contains an integer N, representing the number of products.
 * The second line contains N space-separated integers representing the product
 * weights.
 * Output Format
 * 
 * Print a single integer representing the minimum number of operations.
 * 
 * Constraints
 * 1 ≤ N ≤ 2 × 10^5
 * 1 ≤ Weight[i] ≤ 10^9
 * Sample Input
 * 7
 * 5 2 5 8 8 3 9
 * Sample Output
 * 2
 * Explanation
 * 
 * Frequency of each weight:
 * 
 * 5 → 2
 * 2 → 1
 * 8 → 2
 * 3 → 1
 * 9 → 1
 * 
 * Unique weights are 2, 3, and 9.
 * 
 * One optimal solution:
 * 
 * Change 3 → 2
 * Change 9 → 5
 * 
 * Final array:
 * 
 * 5 2 5 8 8 2 5
 * 
 * Now every distinct weight appears at least twice.
 * 
 * Minimum operations = 2.
 */