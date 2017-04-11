/*
Given a  stack, sort the elements in the stack using no more than one additional stack.
Can sort, and reverse, with two stacks and a temp variable.

temp =

   1
   2
   3
   4
_  _

*/

public Stack<Integer> sortStack(Stack<Integer> stack) {
  if (stack == null || stack.isEmpty()) return stack;
  Stack<Integer> newStack = new Stack<Integer>();
  newStack.push(stack.pop());

  while (!stack.isEmpty()) {
    int temp = stack.pop();
    while (!newStack.isEmpty() && temp > newStack.peek()) {
      stack.push(newStack.pop());
    }
    newStack.push(temp);
  }
  return newStack;
}
