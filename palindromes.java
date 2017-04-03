/*
Given a linked list, write a function to determine whether the list is a palindrome.

e.g.
palindrome(1 -> 2 -> 3) = false
palindrome(1 -> 2 -> 1) = true
*/

1 -> 2 -> 3 -> 2 -> 1 -> null
          ^
                        ^

private class Node {
    private int value;
    private Node next;
}

public boolean palindrome(Node n) {
    Node curr = n;
    Node runner = n;
    Stack<Integer> stack = new Stack<Integer>();

    while(renner != null & runner.next != null) {
        stack.push(curr.value);
        curr = curr.next;
        runner = runner.next.next;
    }

    if (runner != null) curr = curr.next;

    while (curr != null) {
        if (stack.pop().intValue() != curr.value) return false;
        curr = curr.next;
    }

    return true;
}
