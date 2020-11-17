/*
Given a binary tree, write a fucntion to test if the tree is a binary search tree.
*/

       5
     /   \
    2     7
   / \   / \
  1   3 6   8

  private class Node {
    private int value;
    private Node right;
    private Node left;
  }

  public boolean isBST(Node n) {
    return isBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  n = 5
  n = 2, min

  public boolean isBST(Node n, int min, int max) {
    if (n == null) return ture;
    if (n < min || n > max) return false;
    return isBST(n.left, min, n.value) && isBST(n.right, n.value + 1, max);
  }
