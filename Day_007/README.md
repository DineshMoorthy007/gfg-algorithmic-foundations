# Day 007 — Stock Buy and Sell

Summary
- Calculate the maximum profit that can be obtained by buying and selling stocks multiple times.
- The solution uses a simple greedy approach to accumulate profits from all upward price movements.
- Implementations are provided in both Java and Python.

Problem
- You are given an array `prices` where `prices[i]` is the price of a given stock on the `i`-th day.
- You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. You can complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
- **Note**: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

Approach: Greedy Peak-Valley Approach
- Both implementations use a greedy strategy that is equivalent to finding and summing up all "peak-valley" profits.
- The core idea is to accumulate profit whenever the stock price increases from one day to the next.
- Iterate through the `prices` array from the second day (`i = 1`).
- If `prices[i]` is greater than `prices[i-1]`, it means there is a profit to be made by buying on day `i-1` and selling on day `i`. Add this difference (`prices[i] - prices[i-1]`) to the total profit.
- This works because the sum of all small, consecutive profits is equal to the total profit from a major low (valley) to a major high (peak). For example, `(p2 - p1) + (p3 - p2)` is the same as `p3 - p1`.

- This approach has a time complexity of O(n) and a space complexity of O(1).

Languages
- Java
- Python

Files in this folder
- [stock-buy-and-sell.java](Day_007/stock-buy-and-sell.java): Java implementation using the greedy approach.
- [stock-buy-and-sell.py](Day_007/stock-buy-and-sell.py): Python implementation using the greedy approach.

Notes & examples
- **Input**: `prices = [7, 1, 5, 3, 6, 4]`
- **Iteration 1**: `i=1`, `prices[1] (1)` is not greater than `prices[0] (7)`. `profit = 0`.
- **Iteration 2**: `i=2`, `prices[2] (5)` is greater than `prices[1] (1)`. `profit = 0 + (5 - 1) = 4`.
- **Iteration 3**: `i=3`, `prices[3] (3)` is not greater than `prices[2] (5)`. `profit = 4`.
- **Iteration 4**: `i=4`, `prices[4] (6)` is greater than `prices[3] (3)`. `profit = 4 + (6 - 3) = 7`.
- **Iteration 5**: `i=5`, `prices[5] (4)` is not greater than `prices[4] (6)`. `profit = 7`.
- **Output**: `7` (This is equivalent to buying at 1, selling at 5, then buying at 3 and selling at 6).

Design notes
- The greedy approach is simple and highly effective for this version of the stock problem (where multiple transactions are allowed).
- It avoids the complexity of tracking explicit buy/sell days and instead focuses on accumulating all possible gains.