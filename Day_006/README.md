# Day 006 — Majority Element (> n/3)

Summary
- Find all elements in an array that appear more than `n/3` times.
- The solution uses an extension of the Boyer-Moore Voting Algorithm.
- Implementations are provided in both Java and Python.

Problem
- Given an integer array of size `n`, find all elements that appear more than `⌊ n/3 ⌋` times. There can be at most two such elements.

Approach: Extended Boyer-Moore Voting Algorithm
- Both implementations use a modified version of the Boyer-Moore Voting Algorithm to find up to two potential candidates for the majority elements.
- The algorithm works in two passes:
  1.  **First Pass (Finding Candidates)**:
      -   Initialize two candidate elements (`e1`, `e2`) and their counts (`c1`, `c2`) to zero.
      -   Iterate through the array:
          -   If the current element matches `e1`, increment `c1`.
          -   If it matches `e2`, increment `c2`.
          -   If `c1` is zero, set `e1` to the current element and `c1` to 1.
          -   If `c2` is zero, set `e2` to the current element and `c2` to 1.
          -   If the element matches neither and both counts are non-zero, decrement both `c1` and `c2`.
      -   This pass identifies up to two candidates that could be the majority elements.

  2.  **Second Pass (Verifying Candidates)**:
      -   Reset the counts for the two candidates (`ct1`, `ct2`) to zero.
      -   Iterate through the array again to get the actual frequencies of `e1` and `e2`.
      -   Check if `ct1 > n/3` and `ct2 > n/3`. If so, add them to the result list.

- This approach has a time complexity of O(n) and a space complexity of O(1).

Languages
- Java
- Python

Files in this folder
- [majority-element.java](Day_006/majority-element.java): Java implementation using the extended Boyer-Moore Voting Algorithm.
- [majority-element.py](Day_006/majority-element.py): Python implementation using the extended Boyer-Moore Voting Algorithm.

Notes & examples
- **Input**: `arr = [3, 1, 3, 4, 3, 1, 1, 1]`
- **First Pass**:
  - `e1` will likely become `1` and `e2` will likely become `3`.
- **Second Pass**:
  - Count of `1` is 4, which is `> 8/3`.
  - Count of `3` is 3, which is `> 8/3`.
- **Output**: `[1, 3]`

Design notes
- The Boyer-Moore Voting Algorithm is a highly efficient way to find majority elements. The key idea is that if an element is a majority, it will "outvote" all other elements combined.
- This extended version works for the `> n/3` case because there can be at most two such elements. If we were looking for elements appearing more than `> n/k` times, we would need `k-1` candidates.