package Sorting_techniques;

public class SelectionSortExample {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            // Find the minimum element in the unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap the found minimum with the first element of the unsorted portion
            if (minIdx != i) {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 64, 25, 12, 22, 11 };

        selectionSort(numbers);

        System.out.print("Selection Sorted: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}