# Day 001 — Reverse an Array

Summary
- Reverse an array in-place. Implementations provided in Java and Python.

Problem
- Given an array of elements, reverse the order of the elements in the array.

Approach
- In-place two-pointer swap (Java and Python): set `left = 0`, `right = n-1` and swap `arr[left]` and `arr[right]`, then move `left++` and `right--` until `left >= right`.
- This uses O(1) extra space and O(n) time.

Languages
- Java
- Python

Files in this folder
- [reverse-an-array.java](Day_001/reverse-an-array.java): Java implementation using the in-place two-pointer swap.
- [reverse-an-array.py](Day_001/reverse-an-array.py): Python implementation demonstrating the same approach.

Notes & examples
- Example input: `[1, 2, 3, 4, 5]`
- Example output after reversing: `[5, 4, 3, 2, 1]`

Design notes
- Chose the two-pointer swap because it's simple, efficient, and works in-place.
- If immutability is required, return a new reversed copy instead of modifying the input.
