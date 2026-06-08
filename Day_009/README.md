# Day 009 — Minimize the Heights II

Summary
- Find the minimum possible difference between the heights of the shortest and tallest towers after either increasing or decreasing each tower's height by `k`.
- The solution involves sorting the array and then iterating through it to find the optimal partition point that minimizes the height difference.
- Implementations are provided in both Java and Python.

Problem
- Given an array of integers `arr` representing the heights of `n` towers and a positive integer `k`.
- You must either increase or decrease the height of every tower by `k` (only once).
- The goal is to find the minimum possible difference between the maximum and minimum heights of the modified towers.
- **Constraint**: The modified height of a tower cannot be negative. If modifying a tower's height results in a negative value, that modification is not valid.

Approach: Sorting and Partitioning
- Both implementations use an approach based on sorting and checking potential "partition" points.
- The core idea is that after sorting, for any given point `i` in the array, all elements before it could be increased by `k` and all elements after it could be decreased by `k` to potentially minimize the overall range.

- The algorithm works as follows:
  1.  **Sort the array**: First, sort the input array `arr`.
  2.  **Initial Difference**: The initial maximum difference is `arr[n-1] - arr[0]` (the range of the original sorted array). This serves as a baseline.
  3.  **Iterate and Check Partitions**: Iterate from `i = 1` to `n-1`. For each `i`, consider it as the split point.
      -   The elements `arr[0]` to `arr[i-1]` are potential candidates for the "small" group (we add `k` to them).
      -   The elements `arr[i]` to `arr[n-1]` are potential candidates for the "large" group (we subtract `k` from them).
  4.  **Calculate Potential Min/Max**:
      -   The potential new minimum height would be `min(arr[0] + k, arr[i] - k)`.
      -   The potential new maximum height would be `max(arr[i-1] + k, arr[n-1] - k)`.
      -   **Constraint Check**: If `arr[i] - k` is negative, this partition is invalid, so we skip it.
  5.  **Update Result**: Calculate the difference between the potential new max and min, and update the overall result if this new difference is smaller.

- This approach has a time complexity of O(n log n) due to sorting, and a space complexity of O(1) (or O(n) depending on the sort implementation).

Languages
- Java
- Python

Files in this folder
- [minimize-the-heights-II.java](Day_009/minimize-the-heights-II.java): Java implementation using the sorting and partitioning approach.
- [minimize-the-heights-II.py](Day_009/minimize-the-heights-II.py): Python implementation using the sorting and partitioning approach.

Notes & examples
- **Input**: `arr = [1, 5, 8, 10]`, `k = 2`
- **Sorted arr**: `[1, 5, 8, 10]`
- **Initial res**: `10 - 1 = 9`
- **i = 1**: `min = min(1+2, 5-2) = 3`, `max = max(1+2, 10-2) = 8`. `diff = 5`. `res = 5`.
- **i = 2**: `min = min(1+2, 8-2) = 3`, `max = max(5+2, 10-2) = 8`. `diff = 5`. `res = 5`.
- **i = 3**: `min = min(1+2, 10-2) = 3`, `max = max(8+2, 10-2) = 10`. `diff = 7`. `res = 5`.
- **Output**: `5`

Design notes
- Sorting is crucial as it allows us to systematically check the effect of the `+k` and `-k` operations.
- The logic of checking partitions works because after sorting, the smallest element will always be `arr[0]` and the largest `arr[n-1]`. To minimize their difference, we must increase the smallest and decrease the largest. The iteration finds the optimal "switch-over" point for the elements in between.