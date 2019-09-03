package com.lx.datastructure.ds04_stack.ds041_stack_array;

/**
 * 使用数组实现栈
 */
public class StackArray {

  private int top=-1;
  private int maxSize;
  private int[] stack;

    public StackArray(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    public boolean isFull(){
      return top == maxSize-1;
  }

  public boolean isEmpty(){
      return top == -1;
  }

  public void push(int num){
      if (isFull()){
          System.out.println("栈已经满了");
          return;
      }
      top++;
      stack[top] = num;
  }

  public int pop(){
      if (isEmpty()){
          throw new RuntimeException("栈为空的");
      }
      int value = stack[top];
      top--;
      return value;
  }

    /**
     * 遍历栈
     */
  public void show(){
      //栈
      for (int i=top;i>=0;i--){
          System.out.println("stack["+ i +"]="+stack[i]);
      }
  }


}
