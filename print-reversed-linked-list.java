/*
Given a linked list, write a function that prints the nodes of the list in reverse order.

e.g.
printReversedList(1 -> 2 -> 3)
3
2
1

Reverse linked list method
1 <- 2 <- 3

Recursive method
printReversedList(1 -> 2 -> 3)
*/

private class Node {
  int value;
  Node next;
}

public void printReversedList(Node n) {
  if (n==null) return;
  printReversedList(n.next);
  System.out.println(n.value);
}
