package Day11to20;

import java.util.*;

public class Move_zeros {
    public static void main(String[] args) {
        int index = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements(only positive or zero): ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
