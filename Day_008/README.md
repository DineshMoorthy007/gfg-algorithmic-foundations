# Day 008 — Stock Buy and Sell II (Single Transaction)

Summary
- Find the maximum profit that can be achieved by buying a stock on one day and selling it on a future day.
- This version of the problem allows for only a single transaction (one buy and one sell).
- The solution uses a single-pass approach to keep track of the minimum price seen so far and calculate the maximum possible profit.
- Implementations are provided in both Java and Python.

Problem
- You are given an array `prices` where `prices[i]` is the price of a given stock on the `i`-th day.
- You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
- If you cannot achieve any profit, you should return 0.

Approach: Single-Pass Greedy with Minimum Tracking
- Both implementations use a greedy, single-pass algorithm.
- The core idea is to iterate through the prices while keeping track of two key variables:
  1.  `min_price_so_far`: The lowest stock price encountered up to the current day.
  2.  `max_profit`: The maximum profit found so far.

- The algorithm works as follows:
  - Initialize `min_price_so_far` to the price on the first day and `max_profit` to 0.
  - Iterate through the `prices` array starting from the second day (`i = 1`).
  - For each day, update `min_price_so_far` to be the minimum of its current value and the price on the current day.
  - Calculate the potential profit if we were to sell on the current day: `current_profit = prices[i] - min_price_so_far`.
  - Update `max_profit` to be the maximum of its current value and `current_profit`.

- This approach has a time complexity of O(n) and a space complexity of O(1).

Languages
- Java
- Python

Files in this folder
- [stock-buy-and-sell-2.java](Day_008/stock-buy-and-sell-2.java): Java implementation using the single-pass greedy approach.
- [stock-buy-and-sell-2.py](Day_008/stock-buy-and-sell-2.py): Python implementation using the single-pass greedy approach.

Notes & examples
- **Input**: `prices = [7, 1, 5, 3, 6, 4]`
- **Day 0**: `min_price_so_far = 7`, `max_profit = 0`
- **Day 1**: `min_price_so_far = min(7, 1) = 1`, `max_profit = max(0, 1 - 1) = 0`
- **Day 2**: `min_price_so_far = min(1, 5) = 1`, `max_profit = max(0, 5 - 1) = 4`
- **Day 3**: `min_price_so_far = min(1, 3) = 1`, `max_profit = max(4, 3 - 1) = 4`
- **Day 4**: `min_price_so_far = min(1, 6) = 1`, `max_profit = max(4, 6 - 1) = 5`
- **Day 5**: `min_price_so_far = min(1, 4) = 1`, `max_profit = max(5, 4 - 1) = 5`
- **Output**: `5`

Design notes
- This greedy approach is optimal because it effectively checks the maximum possible profit for every potential selling day by pairing it with the absolute lowest buying price seen before that day.
- It's a classic dynamic programming problem that can be optimized to a single pass with constant space.