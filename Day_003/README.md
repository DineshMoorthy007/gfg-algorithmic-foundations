# Day 003 — Find Second Largest Element

Summary
- Find the second largest distinct element in an array (return -1 if it does not exist).
- Current implementations in this folder are in Python and Java.

Problem
- Given an array of numbers, return the second largest distinct value. If the array has fewer than two distinct values, return `-1`.

Approach
- Both implementations use a single-pass two-variable scan:
  - Single-pass two-variable scan:
  - Maintain two variables `a` (largest) and `b` (second largest), initialized to `-1` (or suitable sentinel).
  - For each number `num`:
    - If `num > a`: set `b = a`, `a = num`.
    - Else if `num > b` and `num != a`: set `b = num`.
  - At the end, `b` holds the second largest distinct value or `-1` if none found.
- This method is O(n) time and O(1) extra space.

Alternative approaches
- Sort the array and scan from the end to find the second distinct value (O(n log n) time).
- Use a max-heap or maintain a set of top-2 values (more overhead than needed).

Languages
- Java
- Python

Files in this folder
- [second-largest-element.java](Day_003/second-largest-element.java): Java implementation using the single-pass two-variable approach.
- [second-largest-element.py](Day_003/second-largest-element.py): Python implementation using the single-pass two-variable approach.

Notes & examples
- Example input: `[3, 1, 4, 4, 2]`
- Example output: `3` (the largest is 4, second largest distinct is 3).

Design notes
- Chose the single-pass approach because it is simple, efficient, and works in-place with constant extra space.
- Be careful with arrays containing duplicates; the algorithm tracks distinct values.
