/*
  Given a linked list determine whether or not it contains a cycle.

  e.g.
  1 -> 2 -> 3 -> 4
       ^         |
       |_________|
slow        ^
fast        ^

  1 -> 2 -> 3 -> 4 -> 3 -> 4 -> null


  private class Node {
    int value;
    Node next;
  }

  public boolean hasCycle(Node n) {
    HashSet<Node> visited = new HashSet<>();
    for (Node curr = n; curr != null; curr = curr.next) {
      if (visited.contains(curr)) return ture;
      visited.add(curr);
    }

    return false;
  }

*/

private class Node {
  int value;
  Node next;
}

public boolean hasCycle(Node n) {
  if (n == null) return false;
  Node slow = n;
  Node fast = n.next;

  while (fast != null && fast.next != null) {
    if (fast == slow) return true;
    fast = fast.next.next;
    slow = slow.next;
  }

  return false;
}
