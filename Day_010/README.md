# Day 010 — Kadane's Algorithm

Summary
- Find the contiguous sub-array within a one-dimensional array of numbers that has the largest sum.
- The solution uses Kadane's Algorithm, a classic dynamic programming approach.
- Implementations are provided in both Java and Python.

Problem
- Given an integer array `arr`, find the contiguous sub-array (containing at least one number) which has the largest sum and return its sum.

Approach: Kadane's Algorithm
- Both implementations use Kadane's Algorithm, which is a highly efficient way to solve this problem in a single pass.
- The core idea is to iterate through the array while keeping track of two key variables:
  1.  `max_so_far`: The maximum sum of a sub-array found anywhere in the array so far. This will be the final result.
  2.  `max_ending_here`: The maximum sum of a sub-array that ends at the current position.

- The algorithm works as follows:
  - Initialize `max_so_far` and `max_ending_here` to the first element of the array.
  - Iterate through the array starting from the second element (`i = 1`).
  - For each element, update `max_ending_here` by choosing the larger of two options:
    - The current element itself (`arr[i]`).
    - The current element plus the `max_ending_here` from the previous step (`arr[i] + max_ending_here`).
    - This step essentially decides whether to start a new sub-array at the current element or to extend the previous sub-array.
  - After updating `max_ending_here`, update `max_so_far` to be the maximum of its current value and the new `max_ending_here`.

- This approach has a time complexity of O(n) and a space complexity of O(1).

Languages
- Java
- Python

Files in this folder
- [kadane-algorithm.java](Day_010/kadane-algorithm.java): Java implementation of Kadane's Algorithm.
- [kadane-algorithm.py](Day_010/kadane-algorithm.py): Python implementation of Kadane's Algorithm.

Notes & examples
- **Input**: `arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]`
- **i=0**: `max_ending_here = -2`, `max_so_far = -2`
- **i=1**: `max_ending_here = max(1, 1 + (-2)) = 1`, `max_so_far = max(-2, 1) = 1`
- **i=2**: `max_ending_here = max(-3, -3 + 1) = -2`, `max_so_far = max(1, -2) = 1`
- **i=3**: `max_ending_here = max(4, 4 + (-2)) = 4`, `max_so_far = max(1, 4) = 4`
- **i=4**: `max_ending_here = max(-1, -1 + 4) = 3`, `max_so_far = max(4, 3) = 4`
- **i=5**: `max_ending_here = max(2, 2 + 3) = 5`, `max_so_far = max(4, 5) = 5`
- **i=6**: `max_ending_here = max(1, 1 + 5) = 6`, `max_so_far = max(5, 6) = 6`
- **i=7**: `max_ending_here = max(-5, -5 + 6) = 1`, `max_so_far = max(6, 1) = 6`
- **i=8**: `max_ending_here = max(4, 4 + 1) = 5`, `max_so_far = max(6, 5) = 6`
- **Output**: `6` (from the sub-array `[4, -1, 2, 1]`)

Design notes
- Kadane's Algorithm is a perfect example of a simple, elegant dynamic programming solution.
- The "optimal substructure" property is evident in how the `max_ending_here` at the current step is built upon the solution from the previous step.
- It correctly handles arrays with all negative numbers by returning the largest number (least negative).