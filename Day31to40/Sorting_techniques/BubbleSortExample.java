package Sorting_techniques;

public class BubbleSortExample {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Early exit if no swaps occurred during this pass
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 64, 34, 25, 12, 22, 11, 90 };

        bubbleSort(numbers);

        System.out.print("Bubble Sorted: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}