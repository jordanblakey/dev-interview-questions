/*
Given a tree, write a function that prints out the nodes of the tree in level order.

e.g.
tree:
      1
    /   \
   2     3
  / \   / \
 4   5 6   7

traverse(tree): 1 2 3 4 5 6 7
*/

private class Node {
  int value;
  Node left;
  Node right;
}

toVisit = {}

private void traverse(Node tree) {
  if (tree == null) return;
  Queue<Node> toVisit = new LinkedList<Node>();
  toVisit.add(tree);
  while (!toVisit.isEmpty()) {
    Node curr = toVisit.remove();
    System.out.print(curr.value());
    if (curr.left != null) toVisit.add(curr.left);
    if (curr.right != null) toVisit.add(curr.right);
  }
}
