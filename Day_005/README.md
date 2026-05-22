# Day 005 — Next Permutation

Summary
- Find the next lexicographically greater permutation of a given sequence of numbers.
- If no such permutation exists, rearrange the sequence to the smallest possible order (sorted in ascending order).
- Implementations are provided in both Java and Python.

Problem
- Given an array of integers, implement a function to find the next permutation in lexicographical order.

Approach: Single-Pass Algorithm
- Both implementations use a standard, efficient algorithm for finding the next permutation. The steps are:
  1.  **Find the pivot**: Traverse the array from the right to the left and find the first element `arr[i]` which is smaller than the element to its right (`arr[i+1]`). This element `arr[i]` is the "pivot".
  2.  **Handle the last permutation**: If no such pivot is found, it means the array is already in its largest permutation (sorted in descending order). In this case, reverse the entire array to get the smallest permutation and return.
  3.  **Find the successor to the pivot**: If a pivot is found, traverse from the right again to find the smallest element `arr[j]` that is greater than the pivot.
  4.  **Swap**: Swap the pivot `arr[i]` with its successor `arr[j]`.
  5.  **Reverse the suffix**: Reverse the sub-array to the right of the pivot's original position (from index `i+1` to the end). This ensures the new suffix is in its smallest possible order.

- This approach has a time complexity of O(n) and a space complexity of O(1).

Languages
- Java
- Python

Files in this folder
- [next-permutation.java](Day_005/next-permutation.java): Java implementation of the next permutation algorithm.
- [next-permutation.py](Day_005/next-permutation.py): Python implementation of the next permutation algorithm.

Notes & examples
- **Input**: `arr = [1, 2, 3]`
- **Step 1 (Find pivot):** `pivot` is at index 1 (value 2), since `arr[1] < arr[2]`.
- **Step 2 (Find successor):** The successor to 2 is 3 (at index 2).
- **Step 3 (Swap):** Swap `arr[1]` and `arr[2]`. The array becomes `[1, 3, 2]`.
- **Step 4 (Reverse suffix):** The suffix to the right of the pivot is just `[2]`, which is already reversed.
- **Output**: `[1, 3, 2]`

- **Input**: `arr = [3, 2, 1]`
- **Step 1 (Find pivot):** No pivot is found.
- **Step 2 (Handle last permutation):** Reverse the entire array.
- **Output**: `[1, 2, 3]`

Design notes
- This algorithm is a well-known and optimal solution for this problem, providing an in-place modification with linear time complexity.
- The logic hinges on finding the rightmost, smallest possible change that can be made to increase the sequence's lexicographical order.