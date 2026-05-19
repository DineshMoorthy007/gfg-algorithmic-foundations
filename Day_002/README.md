# Day 002 — Move All Zeros to End

Summary
- Move all zeros to the end of the array while keeping the order of non-zero elements.
- The current implementations in this folder are in Java and Python.

Problem
- Given an array, shift every `0` to the end without changing the relative order of the non-zero elements.

Approach
- Use a write pointer `c` to track the next position for a non-zero value.
- Traverse the array once and copy each non-zero element to `arr[c]`, then increment `c`.
- After the first pass, fill the remaining positions from `c` to the end with `0`.
- This is an in-place solution with O(n) time and O(1) extra space.

Alternative approach
- A swap-based in-place method can also be used.
- Whenever a non-zero value is found, swap it into the next available position at the front of the array.
- This also runs in O(n) time and O(1) extra space.

Languages
- Java
- Python

Files in this folder
- [moving-all-zeros-to-end.java](Day_002/moving-all-zeros-to-end.java): Java implementation using the swap-based in-place approach.
- [moving-all-zeros-to-end.py](Day_002/moving-all-zeros-to-end.py): Python implementation using the write-pointer approach.

Notes & examples
- Example input: `[0, 1, 0, 3, 12]`
- Example output after moving zeros: `[1, 3, 12, 0, 0]`

Design notes
- The write-pointer method is simple and preserves the order of non-zero elements.
- The swap-based method is a good alternative when you prefer direct in-place exchanges.
