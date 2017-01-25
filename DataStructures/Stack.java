package datastructures;
import java.util.Arrays;

class Stack {

  private String[] stack;
  private int stackSize;
  private int topOfStack = -1;

  Stack (int size) {
    stackSize = size;
    stack = new String[size];
    Arrays.fill(stack, "-1");
  }

  private void push(String value) {
    if(topOfStack + 1 < stackSize) {
      topOfStack++;
      stack[topOfStack] = value;
    }
    else {
      System.out.println("Stack is already full");
    }
    printStack(stack);
  }

  private void pushMultiple(String values) {
    String[] arr = values.split(" ");
    for(int i=0; i < arr.length; i++) {
      push(arr[i]);
    }
  }

  private void pop() {
    if(topOfStack > 0 && topOfStack < stackSize) {
      stack[topOfStack] = "-1";
      topOfStack--;
    }
    else
      System.out.println("Sorry the stack is empty");
    printStack(stack);
  }

  private void popMultiple(int values) {
    while(values > 0){
      pop();
      values--;
    }
  }

  private void peak() {
    System.out.println("Peek of the stack is:" + stack[topOfStack]);
  }

  private void printStack(String[] stack) {

    System.out.println("-------------------------------------------------------------------");
    System.out.print("| Key  | ");
    for(int i=0; i < stackSize; i++) {
      System.out.print(i + "  |  ");
    }
    System.out.println("");
    System.out.println("-------------------------------------------------------------------");

    System.out.print("| Value| ");
    for(int i=0; i < stackSize; i++) {
      if(stack[i] == "-1")
        System.out.print("  "+ " |  ");
      else
        System.out.print(stack[i] + " |  ");
    }

    System.out.println("");
    System.out.println("-------------------------------------------------------------------");
  }


  public static void main(String[] args) {
    Stack myStack = new Stack(10);
    myStack.push("10");
    myStack.push("15");
    myStack.pushMultiple("16 18 20 22 24");
    myStack.popMultiple(2);
  }
}
