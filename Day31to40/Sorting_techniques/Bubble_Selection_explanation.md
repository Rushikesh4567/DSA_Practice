**Bubble Sort** and **Selection Sort** are two foundational, comparison-based sorting algorithms. While both share a time complexity of $O(n^2)$ in the worst case, they differ fundamentally in how they inspect, compare, and rearrange elements.

---

## 1. Bubble Sort

Bubble Sort works by repeatedly comparing adjacent elements in an array and swapping them if they are in the wrong order. With each full pass through the array, the largest unsorted element "bubbles up" to its correct position at the end.

### How It Works

1. Start at the beginning of the array and compare the first two elements.
2. If the first element is greater than the second, swap them.
3. Move to the next pair (index 1 and 2, then 2 and 3, and so on) and repeat until the end of the array.
4. **Optimization:** If a full pass completes without any swaps, the array is already fully sorted, and the algorithm can terminate early.

### Complexity

* **Time Complexity:**
* **Best Case:** $O(n)$ (when the array is already sorted and an early-exit flag is used)
* **Average & Worst Case:** $O(n^2)$ (when the array is randomly ordered or reverse-sorted)


* **Space Complexity:** $O(1)$ (in-place sorting)
* **Stability:** **Stable** (does not change the relative order of identical elements)

---

## 2. Selection Sort

Selection Sort divides the array into two parts: a **sorted** sub-array at the left and an **unsorted** sub-array at the right. It repeatedly scans the unsorted portion to find the minimum element, swaps it with the leftmost unsorted element, and expands the sorted boundary by one.

### How It Works

1. Set the first element as the current minimum.
2. Scan the rest of the array to find an element smaller than the current minimum.
3. If a smaller element is found, designate it as the new minimum for that pass.
4. Swap the found minimum element with the first position of the unsorted sub-array.
5. Move the boundary of the sorted sub-array one position to the right and repeat until the entire array is sorted.

### Complexity

* **Time Complexity:**
* **Best, Average, & Worst Case:** $O(n^2)$ (it always scans the remaining unsorted elements regardless of initial order)


* **Space Complexity:** $O(1)$ (in-place sorting)
* **Stability:** **Unstable** (swapping non-adjacent elements can alter the relative order of identical elements)

---

## Summary Comparison

| Feature | Bubble Sort | Selection Sort |
| --- | --- | --- |
| **Core Mechanism** | Swaps adjacent elements iteratively | Finds the minimum element and places it at the front |
| **Best-Case Time** | $O(n)$ (with optimized early exit) | $O(n^2)$ |
| **Worst-Case Time** | $O(n^2)$ | $O(n^2)$ |
| **Total Swaps** | High (potentially $O(n^2)$ swaps) | Low (at most $O(n)$ swaps) |
| **Stability** | Stable | Unstable (by default) |

> **Key Takeaway:** Selection Sort performs significantly fewer swaps than Bubble Sort ($O(n)$ versus $O(n^2)$), making it a better choice when memory write/swap operations are costly. However, Bubble Sort is preferred when there is a high likelihood that the input data is already nearly sorted.