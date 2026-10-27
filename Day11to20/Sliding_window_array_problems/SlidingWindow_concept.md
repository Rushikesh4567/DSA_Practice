🪟 Sliding Window in DSA

1. What is Sliding Window?

Sliding Window is a problem-solving technique used to work with a continuous portion (subarray/substring) of an array or string.

Instead of repeatedly calculating the same elements, we maintain a window and move it through the array/string.

Think of it like this:

Array:
[2, 1, 5, 1, 3, 2]

Window size = 3

[2, 1, 5]  → first window
   [1, 5, 1]  → move window
      [5, 1, 3]  → move window
         [1, 3, 2]  → move window

The window "slides" from left to right.

2. Why do we use Sliding Window?

The main reason is to improve time complexity.

Suppose the question is:

Find the maximum sum of any 3 consecutive elements.

Array:

[2, 1, 5, 1, 3, 2]
❌ Without Sliding Window

We calculate every group separately:

2 + 1 + 5 = 8
1 + 5 + 1 = 7
5 + 1 + 3 = 9
1 + 3 + 2 = 6

Notice something?

When we move from:

[2, 1, 5]

to:

[1, 5, 1]

we already know 1 + 5.

We don't need to calculate everything again.

3. The Main Idea

When the window moves:

[2, 1, 5]

becomes:

[1, 5, 1]

What changed?

2 → removed
1 → added

So instead of recalculating:

1 + 5 + 1

we can do:

oldSum - 2 + 1

If:

oldSum = 8

then:

8 - 2 + 1 = 7

This is the key idea behind Sliding Window.

Remove the element leaving the window and add the element entering the window.

4. Why is it called a "Window"?

Imagine a window through which you can see only a few elements at a time.

For example:

Array:
2  1  5  1  3  2
└──────┘
 Window

Then the window moves:

2  1  5  1  3  2
   └──────┘

Then:

2  1  5  1  3  2
      └──────┘

Then:

2  1  5  1  3  2
         └──────┘

That's why we call it a Sliding Window.

5. When do we use Sliding Window?

This is the most important part for DSA.

Look for questions involving:

Arrays

Words like:

consecutive elements
contiguous elements
subarray
maximum sum
minimum sum
average of K elements
exactly K elements

Example:

Find the maximum sum of a subarray of size K.

This is a strong Sliding Window candidate.

Strings

Look for:

substring
longest substring
shortest substring
consecutive characters
distinct characters
repeated characters

For example:

Find the longest substring without repeating characters.

Example:

abcabcbb

The window can be:

[abc]

Then slide:

[bc]

etc.

6. Two Main Types of Sliding Window

There are two important types you should learn.

Type 1: Fixed-Size Window

The window size remains the same.

Example:

Find maximum sum of K consecutive elements.

If:

K = 3

then every window has exactly 3 elements:

[2, 1, 5]
   [1, 5, 1]
      [5, 1, 3]
         [1, 3, 2]

The size is always:

3
Common pattern
left = 0

for right = 0 to n-1:

    add array[right]

    if window size == K:
        calculate answer

        remove array[left]
        left++

We'll understand this deeply when we solve problems.

7. Type 2: Variable-Size Window

Here the window size changes depending on a condition.

For example:

Find the longest subarray whose sum is less than or equal to K.

The window might look like:

[2]
[2, 1]
[2, 1, 5]

If the condition becomes invalid, we shrink it:

[2, 1, 5]  ❌ condition violated

remove 2

[1, 5]     ✅

So the window can:

expand → expand → expand
                    ↓
                  shrink
                    ↓
                  expand

This is called a Variable-Size Sliding Window.

8. The Two Pointers

Sliding Window commonly uses two variables:

left
right

For example:

[2, 1, 5, 1, 3, 2]
 ↑        ↑
left     right

The right pointer usually expands the window.

The left pointer usually shrinks the window.

So:

right → expand
left  → shrink

This is why Sliding Window is closely related to the Two Pointer technique.

9. Brute Force vs Sliding Window

Suppose:

arr = [2, 1, 5, 1, 3, 2]
K = 3
Brute Force

We calculate every window from scratch.

For each window, we may examine K elements.

Time complexity:

O(N × K)
Sliding Window

We calculate the first window once and then update the sum as the window moves.

Time complexity:

O(N)

That's a major improvement.

10. Simple Example

Let's find the maximum sum of 3 consecutive elements.

arr = [2, 1, 5, 1, 3, 2]
K = 3
Step 1

First window:

[2, 1, 5]

Sum:

8

Maximum:

8
Step 2

Slide:

[2, 1, 5]
 ↓       ↓
remove  add

[1, 5, 1]

Update:

8 - 2 + 1 = 7

Maximum:

8
Step 3

Slide again:

[1, 5, 1]
    ↓    ↓

[5, 1, 3]

Update:

7 - 1 + 3 = 9

Maximum:

9
Step 4
[5, 1, 3]
    ↓    ↓

[1, 3, 2]

Update:

9 - 5 + 2 = 6

Final answer:

9
11. How to Recognize Sliding Window Questions

When you see a question, ask yourself:

Question 1

Is the problem about a continuous/contiguous portion?

For example:

subarray
substring
consecutive elements

If yes → Sliding Window may be applicable.

Question 2

Is there a window of size K?

Example:

Maximum sum of K consecutive elements

Very strong indication.

Question 3

Do I need longest/shortest subarray or substring satisfying some condition?

Example:

Longest substring with at most 2 distinct characters.

Very strong indication of variable-size Sliding Window.

12. Important Terms

You should remember these:

Term	Meaning
Window	Current continuous portion
Left	Starting position of window
Right	Ending position of window
Expand	Move right
Shrink	Move left
Fixed Window	Window size remains constant
Variable Window	Window size changes
Contiguous	Elements are next to each other
13. Sliding Window Mental Model

Whenever you see a suitable problem, think:

        EXPAND
          ↓
    ┌─────────────┐
    │   WINDOW    │
    └─────────────┘
          ↑
        SHRINK

More practically:

left →                 ← right

[  elements inside window  ]

The window moves from left to right.

14. Sliding Window vs Prefix Sum

Since you were just learning Prefix Sum, this distinction is useful.

Prefix Sum

Usually helps answer:

What is the sum of a particular range?

Example:

sum of arr[2...5]
Sliding Window

Usually helps when you're:

Moving through consecutive ranges and maintaining some information about the current range.

For example:

maximum sum of K consecutive elements

Both can work with subarrays, but they solve different patterns.

15. What We Will Learn Next

I recommend learning Sliding Window in this order:

1. Fixed-size Sliding Window
        ↓
2. Maximum sum of K consecutive elements
        ↓
3. Minimum/average of K elements
        ↓
4. Variable-size Sliding Window
        ↓
5. Longest subarray with a condition
        ↓
6. Longest substring problems
        ↓
7. Frequency/HashMap + Sliding Window
        ↓
8. Placement-level problems
The most important thing for you

Don't memorize a Sliding Window template immediately.

First understand why the window expands, why it shrinks, what information we maintain, and what exactly changes when the window moves.

Once that is clear, the code becomes much easier.