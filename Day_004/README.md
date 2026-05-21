# Day 004 — Rotate Array

Summary
- Rotate an array to the left by `d` positions using the reversal algorithm.
- Implementations are provided in both Java and Python.

Problem
- Given an array of `n` elements, rotate it to the left by `d` positions. For example, if the array is `[1, 2, 3, 4, 5]` and `d=2`, the result should be `[3, 4, 5, 1, 2]`.

Approach: Reversal Algorithm
- Both implementations use the reversal algorithm, which is an efficient, in-place method for array rotation. The steps are:
  1.  Reverse the first `d` elements of the array (from index `0` to `d-1`).
  2.  Reverse the remaining `n-d` elements (from index `d` to `n-1`).
  3.  Reverse the entire array (from index `0` to `n-1`).
- This approach has a time complexity of O(n) and a space complexity of O(1).

Alternative Approaches
- **Temporary Array**: Store the first `d` elements in a temporary array, shift the rest of the elements to the left, and then copy the temporary elements back to the end. This uses O(d) extra space.
- **One-by-One Rotation**: Rotate the array one element at a time for `d` times. This is inefficient, with a time complexity of O(n*d).

Languages
- Java
- Python

Files in this folder
- [rotate-array.java](Day_004/rotate-array.java): Java implementation using the reversal algorithm.
- [rotate-array.py](Day_004/rotate-array.py): Python implementation using the reversal algorithm.

Notes & examples
- **Input**: `arr = [1, 2, 3, 4, 5]`, `d = 2`
- **Step 1 (Reverse `arr[0...1]`):** `[2, 1, 3, 4, 5]`
- **Step 2 (Reverse `arr[2...4]`):** `[2, 1, 5, 4, 3]`
- **Step 3 (Reverse `arr[0...4]`):** `[3, 4, 5, 1, 2]`
- **Output**: `[3, 4, 5, 1, 2]`

Design notes
- The reversal algorithm is highly efficient for in-place array rotations, especially when memory is a constraint.
- The modulo operator (`d % n`) is used to handle cases where `d` is greater than the array length `n`.