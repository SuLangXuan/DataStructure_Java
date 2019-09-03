package com.lx.datastructure.ds04_stack.ds042_stack_linkedlist;

import com.lx.datastructure.ds03_linkedlist.ds031_singlelinkedlist.SNode;
import com.lx.datastructure.ds03_linkedlist.ds031_singlelinkedlist.SingleLinkedList;

/**
 * 使用链表 来 实现栈
 */
public class StackLinkedList {
    private int top=-1;
    private int maxSize;
    private SingleLinkedList stack;

    public StackLinkedList(int maxSize) {
        this.maxSize = maxSize;
        stack = new SingleLinkedList();
    }

    public boolean isFull(){
        return maxSize == stack.length();
    }

    public boolean isEmty(){
        return stack.length() == 0;
    }

    public void push(int num){
        if (isFull()){
            System.out.println("栈满，不能添加");
            return;
        }
        SNode node = new SNode(num,"");
        stack.add(node);
    }

    public int pop(){
        if (isEmty()){
            throw new RuntimeException("栈空");
        }
        return stack.find2(1).getNo();
    }

    public void show(){
        stack.reversePrint1();
    }

}
