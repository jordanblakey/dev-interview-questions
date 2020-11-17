/*
Given an array of integers where each value 1 <= x <= len(array), write a function that findes all the duplicates in the array.

e.g.
dups([1, 2, 3] = [])
dups([1, 2, 2] = [2])
dups([3, 3, 3] = [3])
dups([2, 1, 2, 1] = [1, 2])

Brute force: O(N^2)

Set:
  0(N) - time
  0(N) - space

Sort:
  0(N log N)
  0(1)

Encoding:
  0(N)
  0(1)
  1 <= x <= len(array)
  0 <= x <= len(array) - 1

[2, -1, 2, 1, 2]
result = [2, 1, 2]
index = 1 - 1 = 0
*/
