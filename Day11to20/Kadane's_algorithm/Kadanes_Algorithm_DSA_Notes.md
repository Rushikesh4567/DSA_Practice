# Kadane's Algorithm — DSA Notes

## 1. What is Kadane's Algorithm?

Kadane's Algorithm is an efficient technique for finding the **maximum sum of a non-empty contiguous subarray** in an array of integers.

Example:

```text
arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
```

The maximum-sum contiguous subarray is:

```text
[4, -1, 2, 1]
```

Its sum is `4 + (-1) + 2 + 1 = 6`, so the answer is **6**.

## 2. What does “contiguous subarray” mean?

A subarray contains elements that appear next to each other in the original array.

For `[1, 2, 3]`, valid subarrays include:

- `[1]`
- `[2]`
- `[3]`
- `[1, 2]`
- `[2, 3]`
- `[1, 2, 3]`

`[1, 3]` is not a contiguous subarray because it skips the element `2`.

## 3. Why do we use Kadane's Algorithm?

A brute-force approach checks many possible subarrays and can take `O(n²)` or `O(n³)` time, depending on the implementation.

Kadane's Algorithm solves the maximum subarray sum problem in:

- **Time:** `O(n)`
- **Extra space:** `O(1)`

It is useful when a problem asks for the maximum sum of a contiguous subarray.

## 4. The main idea

At each element, decide:

1. **Start a new subarray** at the current element.
2. **Extend the previous subarray** by adding the current element to its sum.

The decision is:

```java
currentSum = Math.max(nums[i], currentSum + nums[i]);
```

Then update the best answer seen so far:

```java
maxSum = Math.max(maxSum, currentSum);
```

### What do the variables mean?

- `currentSum`: the largest sum of a subarray that **must end at the current index**.
- `maxSum`: the largest subarray sum found anywhere so far.

## 5. Dry run

Input:

```text
nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
```

Initialize both variables using the first element:

```text
currentSum = -2
maxSum = -2
```

For each next element, calculate `currentSum = max(nums[i], currentSum + nums[i])`, then update `maxSum`.

| i | nums[i] | currentSum | maxSum |
|---:|---:|---:|---:|
| 0 | -2 | -2 | -2 |
| 1 | 1 | 1 | 1 |
| 2 | -3 | -2 | 1 |
| 3 | 4 | 4 | 4 |
| 4 | -1 | 3 | 4 |
| 5 | 2 | 5 | 5 |
| 6 | 1 | 6 | 6 |
| 7 | -5 | 1 | 6 |
| 8 | 4 | 5 | 6 |

The result is `6`, from the subarray `[4, -1, 2, 1]`.

## 6. Why does the decision work?

Suppose the previous best subarray ending at the prior index has `currentSum = -5`, and the current element is `4`.

- Extend the old subarray: `-5 + 4 = -1`
- Start a new subarray: `4`

Starting fresh is better, so the new `currentSum` is `4`.

Now suppose `currentSum = 6` and the next element is `-5`.

- Extend: `6 + (-5) = 1`
- Start fresh: `-5`

Extending is better, so the new `currentSum` is `1`.

At every index, the algorithm keeps whichever choice gives the larger sum. It also tracks the global maximum in `maxSum`.

## 7. Java implementation

```java
class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
```

This assumes `nums` is non-empty, as in the standard maximum-subarray problem.

## 8. Important edge case: all elements are negative

Input:

```text
nums = [-5, -2, -8]
```

The correct answer is `-2`, because the subarray must be non-empty.

Initializing `currentSum` and `maxSum` to `0` would incorrectly allow an answer of `0`. Initialize them to `nums[0]` instead.

## 9. When should you recognize Kadane's Algorithm?

Look for clues such as:

- Find the **maximum sum**.
- Find the **maximum subarray**.
- Find the best sum over a **contiguous** part of an array.

The key clue is **contiguous subarray**. Kadane's Algorithm is not for selecting arbitrary elements from anywhere in the array.

## 10. Kadane's pattern to remember

```text
For each element:
    Choose between:
        1. Start a new subarray at this element
        2. Extend the previous subarray

    currentSum = max(nums[i], currentSum + nums[i])
    maxSum = max(maxSum, currentSum)

Return maxSum
```

Complexity:

```text
Time:  O(n)
Space: O(1)
```

## 11. Learning path and practice questions

Work through these in order. Try each problem yourself before checking a solution.

### Question 1 — Maximum Subarray Sum (basic Kadane)

**Task:** Given an integer array, return the maximum sum of any non-empty contiguous subarray.

Example:

```text
Input:  [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
```

**Goal:** Practice the two variables `currentSum` and `maxSum`.

### Question 2 — Find the actual subarray

**Task:** Return or print the elements of the maximum-sum contiguous subarray, not just its sum.

**Hint:** Track a temporary start index and the best start/end indices. When starting a new subarray, update the temporary start. Whenever `maxSum` improves, save the best boundaries.

### Question 3 — All-negative array cases

**Task:** Check that your implementation works when every number is negative.

Example:

```text
Input:  [-5, -2, -8]
Output: -2
```

**Goal:** Understand why initialization with the first array element matters.

### Question 4 — Maximum Circular Subarray Sum

**Task:** Imagine the array is circular, so the end can connect to the beginning. Find the maximum sum of a non-empty circular subarray.

**Hint:** The answer is either:
- the ordinary maximum subarray sum, or
- the total array sum minus the minimum subarray sum.

**Important edge case:** If all elements are negative, return the ordinary maximum subarray sum; do not use `totalSum - minSubarraySum`, which would produce an invalid empty-subarray result.

### Question 5 — Kadane's idea combined with another technique

After mastering the basic version, try variations where Kadane's idea is combined with another technique. For example, maximum subarray sum with constraints, or maximum sum after a permitted transformation. Read the constraints carefully because not every “maximum sum” problem can be solved by plain Kadane's Algorithm.

## Suggested study method

1. Explain the problem in your own words.
2. Identify what `currentSum` and `maxSum` represent.
3. Dry-run the example by hand.
4. Write the code without looking at the notes.
5. Test a mixed array, a single-element array, and an all-negative array.
6. Move to the next question only after you can explain why the algorithm works.
