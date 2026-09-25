# Prefix Sum — Concept & Revision Notes

## 1. What is Prefix Sum?

**Prefix Sum** is a technique where we create an array in which each position stores the **sum of all elements from the beginning of the original array up to that position**.

### Example

Original array:

```text
arr = [2, 4, 1, 5, 3]
```

Prefix sum array:

```text
prefix = [2, 6, 7, 12, 15]
```

Because:

```text
prefix[0] = 2
prefix[1] = 2 + 4 = 6
prefix[2] = 2 + 4 + 1 = 7
prefix[3] = 2 + 4 + 1 + 5 = 12
prefix[4] = 2 + 4 + 1 + 5 + 3 = 15
```

The basic formula is:

```text
prefix[i] = prefix[i - 1] + arr[i]
```

---

## 2. Why Do We Need Prefix Sum?

The main reason is:

> **To calculate the sum of a range quickly.**

Suppose:

```text
arr = [2, 4, 1, 5, 3]
```

And we need the sum from index `1` to `3`.

That means:

```text
4 + 1 + 5 = 10
```

### Without Prefix Sum

We calculate every element in the requested range:

```text
4 + 1 + 5 = 10
```

This is fine for one query.

But if there are many queries, we may repeatedly calculate sums over the same elements.

For example:

```text
sum(1, 3)
sum(2, 4)
sum(0, 3)
sum(1, 4)
...
```

For large arrays and many queries, this can become expensive.

---

## 3. Prefix Sum Makes Range Sum O(1)

For:

```text
arr    = [2, 4, 1, 5, 3]
prefix = [2, 6, 7, 12, 15]
```

Suppose we want:

```text
sum(1, 3)
```

We know:

```text
prefix[3] = 2 + 4 + 1 + 5 = 12
```

But we do not want the first element `2`.

So subtract:

```text
prefix[0] = 2
```

Therefore:

```text
sum(1, 3) = prefix[3] - prefix[0]
           = 12 - 2
           = 10
```

### General Formula

For a range `L` to `R`:

```text
sum(L, R) = prefix[R] - prefix[L - 1]
```

This formula is used when:

```text
L > 0
```

---

## 4. What If L = 0?

Suppose we want:

```text
sum(0, 3)
```

We need:

```text
2 + 4 + 1 + 5 = 12
```

There is no:

```text
prefix[-1]
```

So:

```text
if L == 0:
    sum = prefix[R]
else:
    sum = prefix[R] - prefix[L - 1]
```

This works, but there is an even cleaner approach.

---

# 5. Prefix Sum With an Extra Zero

A very common DSA approach is to create a prefix array with one extra element.

Original:

```text
arr = [2, 4, 1, 5, 3]
```

Prefix:

```text
prefix = [0, 2, 6, 7, 12, 15]
```

Here:

```text
prefix[0] = 0
prefix[1] = 2
prefix[2] = 6
prefix[3] = 7
prefix[4] = 12
prefix[5] = 15
```

Now the range-sum formula becomes:

```text
sum(L, R) = prefix[R + 1] - prefix[L]
```

### Example

Find:

```text
sum(1, 3)
```

Use:

```text
prefix[R + 1] - prefix[L]
```

Therefore:

```text
prefix[4] - prefix[1]
= 12 - 2
= 10
```

### Why Is This Version Useful?

Because it automatically handles:

```text
L = 0
```

without requiring a separate condition.

For example:

```text
sum(0, 3)
= prefix[4] - prefix[0]
= 12 - 0
= 12
```

This is why you will frequently see the extra-zero prefix array in competitive programming and interview solutions.

---

# 6. How Do We Create Prefix Sum?

## Method 1: Same-Size Prefix Array

```java
int[] arr = {2, 4, 1, 5, 3};
int[] prefix = new int[arr.length];

prefix[0] = arr[0];

for (int i = 1; i < arr.length; i++) {
    prefix[i] = prefix[i - 1] + arr[i];
}
```

Result:

```text
arr    = [2, 4, 1, 5, 3]
prefix = [2, 6, 7, 12, 15]
```

---

## Method 2: Extra-Zero Prefix Array

This is often more convenient for range queries.

```java
int[] arr = {2, 4, 1, 5, 3};
int[] prefix = new int[arr.length + 1];

for (int i = 0; i < arr.length; i++) {
    prefix[i + 1] = prefix[i] + arr[i];
}
```

Result:

```text
arr    = [2, 4, 1, 5, 3]
prefix = [0, 2, 6, 7, 12, 15]
```

Then:

```text
sum(L, R) = prefix[R + 1] - prefix[L]
```

---

# 7. Why Does Subtraction Work?

This is the most important part to understand.

Suppose:

```text
arr    = [2, 4, 1, 5, 3]
prefix = [2, 6, 7, 12, 15]
```

We want:

```text
index 1 → index 3
```

That is:

```text
4 + 1 + 5
```

Look at:

```text
prefix[3] = 2 + 4 + 1 + 5
```

It contains everything we need **plus the unwanted `2`**.

So remove the unwanted part:

```text
prefix[3] - prefix[0]

(2 + 4 + 1 + 5) - (2)
= 4 + 1 + 5
= 10
```

So the basic idea is:

> **Take a larger cumulative sum and subtract the part that comes before the required range.**

---

# 8. When Do We Use Prefix Sum?

You should think about Prefix Sum when a problem involves **repeated range calculations** or **cumulative information**.

## ① Multiple Range-Sum Queries

Example:

```text
Given an array, find the sum from index L to R.
```

Especially when there are many queries.

---

## ② Subarray Sum Problems

Prefix Sum can be useful in problems such as:

```text
Find the sum of a particular subarray.
```

or:

```text
Find whether a subarray with a particular sum exists.
```

Later, this leads to an important pattern:

```text
Prefix Sum + HashMap
```

---

## ③ Count Elements in a Range

Prefix-sum ideas can also be used for questions like:

```text
How many 1s are present from index L to R?
```

or:

```text
How many elements satisfy a particular condition between L and R?
```

The prefix array does not always have to store a mathematical sum. It can store **cumulative counts**.

---

## ④ 2D Arrays / Matrices

Prefix Sum also works with matrices.

Example:

```text
1 2 3
4 5 6
7 8 9
```

A **2D Prefix Sum** can be used to quickly calculate the sum of any rectangular region.

This is a later topic.

---

# 9. Main Advantage of Prefix Sum

Consider:

```text
Array size = 1,000,000
Queries    = 100,000
```

### Without Prefix Sum

A range query may require:

```text
O(N)
```

in the worst case.

If there are many queries, the total work can become very large.

### With Prefix Sum

First build the prefix array:

```text
O(N)
```

Then each range-sum query takes:

```text
O(1)
```

Therefore, for `N` elements and `Q` queries:

```text
Total = O(N + Q)
```

where:

- `N` = number of array elements
- `Q` = number of queries

This is the major reason Prefix Sum is important in DSA.

---

# 10. How to Recognize Prefix Sum Problems

When you see something like:

> **"Find the sum between L and R many times."**

Think:

```text
Multiple range sums?
        ↓
   PREFIX SUM
        ↓
Build prefix array
        ↓
Store cumulative information
        ↓
Answer range queries
      in O(1)
```

---

# 11. Important Concept: Prefix Sum Is More General Than "Sum"

Do not think:

> Prefix Sum is only used for calculating sums.

A better way to think about it is:

> **Prefix Sum stores cumulative information so that range information can be calculated quickly.**

For example, the prefix array can store:

```text
Number of even elements
Number of odd elements
Number of 1s
Number of elements satisfying a condition
Cumulative sums
```

The underlying idea remains the same:

```text
Build cumulative information
          ↓
Use subtraction/difference
          ↓
Get information about a range
```

---

# 12. The Two Important Formulas

## Without Extra Zero

Prefix:

```text
prefix = [2, 6, 7, 12, 15]
```

For `L > 0`:

```text
sum(L, R) = prefix[R] - prefix[L - 1]
```

If:

```text
L == 0
```

then:

```text
sum = prefix[R]
```

---

## With Extra Zero

Prefix:

```text
prefix = [0, 2, 6, 7, 12, 15]
```

For any `L` and `R`:

```text
sum(L, R) = prefix[R + 1] - prefix[L]
```

This version is usually easier to use in DSA problems.

---

# 13. What You Should Remember for Revision

Remember these **4 key points**:

### 1. Definition

> **Prefix Sum is a cumulative-sum array where each position stores the sum of elements from the beginning up to that position.**

### 2. Creation

```text
prefix[i] = prefix[i - 1] + arr[i]
```

### 3. Range Sum

With the extra-zero version:

```text
sum(L, R) = prefix[R + 1] - prefix[L]
```

### 4. Main Purpose

```text
Preprocessing → O(N)

Range Query → O(1)
```

---

# 14. Mental Model

Think of Prefix Sum like a **running total**.

For:

```text
arr = [2, 4, 1, 5, 3]
```

Keep adding:

```text
2
2 + 4       = 6
2 + 4 + 1   = 7
2 + 4 + 1 + 5 = 12
2 + 4 + 1 + 5 + 3 = 15
```

So:

```text
arr:
[2, 4, 1, 5, 3]

prefix:
[2, 6, 7, 12, 15]
```

Then for a range:

```text
Total up to R
      -
Total before L
      =
Required range sum
```

That is the core idea of Prefix Sum.

---

# 15. Prefix Sum Learning Path

After understanding this concept, solve Prefix Sum problems in this order:

```text
1. Build Prefix Sum Array
          ↓
2. Basic Range Sum Queries
          ↓
3. Multiple Range Queries
          ↓
4. Subarray Sum
          ↓
5. Prefix Sum + HashMap
          ↓
6. Count Subarrays With Given Sum
          ↓
7. Longest Subarray With Given Sum
          ↓
8. Prefix Sum With 0/1 or Condition-Based Arrays
          ↓
9. 2D Prefix Sum
```

Do **not** memorize the formulas only. The important thing is to understand:

```text
Cumulative information
        +
Difference between two prefix values
        =
Information about a range
```

That understanding will make the later Prefix Sum + HashMap problems much easier.
