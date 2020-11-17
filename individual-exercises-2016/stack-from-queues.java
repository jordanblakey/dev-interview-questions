/*
    Implement a stack with basic functionality (push and pop) using queues to store the data.

push(2)

primary = 1 -> 2
secondary =
*/

public class Stack {
  private Queue<Integer> primary = new LinkedList<Integer>();
  private Queue<Integer> secondary = new LinkedList<Integer>();

  public Stack() {}

    public void push(int x) {
      secondary.add(x);
      while (!primary.isEmpty()) {
        second.add(primary.remove());
      }

      Queue<Integer> temp = primary;
      primary =  secondary;
      secondary = temp;
    }

    public int pop() {
      if (primary.isEmpty()) throw new IndexOutOfBoundsException();
      return primary.remove();
    }

}
