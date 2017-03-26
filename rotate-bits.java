/*
Given a number, write a function to rotate the bits (i.e. circular shift).

e.g.

rotate(0xFFFF0000, 8) = 0x00FFFF00

Questions for the interviewer:
- Which direction should we rotate the integer?
- How many bits is the integer?

0xFABCABAB >> N = 0x00FABCAB
0XFABCABAB << (32 - N) = 0XAB000000

*/
private static BITS_IN_INTEGER = 32;

public int rotate(int x, int N) {
    return (x << N | x >> (BITS_IN_INTEGER - N))
}
