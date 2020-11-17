/*
Given a singly linked list, write a function to find the nth-to-last element of the list.

eg. list = 1 -> 2 -> 3 -> 4 -> 5

n = 1, output = 4
n = 2, output = 3
n = 3, output = 2
etc.

1 -> 2 -> 3 -> 4 -> 5 -> null
                    ^
curr
          ^
follower

*/

private class Node {
    private int value;
    private Node next;
}

public Node nthToLast(Node node, int n) {
    Node curr = node;
    Node follower = node;

    for (int i = 0; i < n; i++){
        if (curr == null) return null;
        curr = curr.next;
    }

    while (curr.next != null){
        curr = curr.next;
        follower = follower.next;
    }

    return follower;
}
