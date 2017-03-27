/*
Given two integers, write a function that swaps them without using any temporary variables.

Can do this by addition and then sanitzing.
x = x + y;
y = x - y;
x = x - y;

XOR bitwise will cancel out x.
x ^ x = 0;
x ^ y ^ x = y;
*/

public void swap(int x, int y) {
  x = x + y;
  y = x - y;
  x = x - y;
}

// OR

public void swapXOR(int x, int y) {
  x = x ^ y;
  y = x ^ y;
  x = x ^ y;
}
