/*
Given two integers, determine whether or not they differ by a single bit.

e.g.
gray(0,1) = true
gray(1,2) = false

0b01010101
0b01010001

0b00000100

0b00001001

x & (x - 1)

0b00100000
0b00011111
0b00100100
*/


    public boolean isGray(int a, int b) {
        int x = a ^ b;
        while (x > 0) {
            if (x % 2 == 1 && x>>1 > 0) return false;
            x = x >> 1;
        }
        return true;
    }
}
