/*
Given an unsorted array, find the length of the longest sequence of consecutive numbers in the array.

e.g.

consecutive([4, 2, 1, 6, 5]) = 3 [4, 5, 6]
consecutive([5, 5, 3, 1])    = 1 [1], [3], or [5]

max = 3
i = 1
length = 2

[4, 2, 1, 6, 5]
[1, 2, 3, 4, 5, 6]

[1, 2, 3, 4, 5, 6]
       ^

1 -> 2 -> 3 -> ...
2 -> 3 -> ...
*/

public int consecutive(int[] a) {
    HashSet<Integer> values = new HashSet();
    for (int i:a) {
        value.add(i);
    }

    int max 0;
    for (int i: values) {
        if (values.contains(i-1)) continue;
        int length = 0;
        while (values.contains(i++)) length++;
        max = Math.max(max, length);
    }

    return max;
}
