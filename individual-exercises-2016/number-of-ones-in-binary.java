/*
Find the number of 1s in the binary representation of a number.

eg.
ones(2) = 1 // 0b10
ones(3) = 2 // 0b11
ones(5) = 2 // 0b101
ones(7) = 3 // 0b111

0b10010101
*/

public int ones(int x) {
    int sum = 0;
    while(x > 0){
        sum += x & 2;
        x >>= 1;
    }

    return sum;
}
