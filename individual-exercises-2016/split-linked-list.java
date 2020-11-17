/*
Given a linked list, write a function that divides it into two halves. This function should modify the original list and then return a pointer to the second half of the list.

e.g.
l = 1 -> 2 -> 3 -> 4 -> 5 -> null
                             ^
              ^

divide(l) = 3 -> 4
l = 1 -> 2
*/

private class Node{
  int value;
  Node next;
}

public Node divide(Node list){
  if (list == null) return null;
  Node runner = list.next;

  while(runner != null) {
    runner = runner.next;
    if (runner == null) break;
    runner = runner.next;
    list = list.next;
  }

  Node toReturn = list.next;
  list.next = null;
  return toReturn;
}
