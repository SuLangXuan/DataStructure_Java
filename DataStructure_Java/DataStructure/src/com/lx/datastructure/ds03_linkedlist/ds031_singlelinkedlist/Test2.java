package com.lx.datastructure.ds03_linkedlist.ds031_singlelinkedlist;

import java.util.Stack;

/**
 * 合并两个有序的单链表，合并之后的链表依然有序 【腾讯面试题，有点难度】
 * TODO: 2019/8/31 先创建两个有序的链表，然后遍历两个链表，使用栈把两个链表的节点存储起来，然后在新链表上有序的添加节点
 */
public class Test2 {

    private static Stack<SNode> stack = new Stack<>();

    public static void main(String[] args) {
        // TODO: 2019/8/31 先创建两个有序的链表，
        SingleLinkedList list1 = new SingleLinkedList();
        SingleLinkedList list2 = new SingleLinkedList();

        // TODO: 2019/8/31 给两个链表添加数据
        list1.add(new SNode(1,"aa"));
        list1.add(new SNode(5,"bb"));
        list1.add(new SNode(9,"cc"));

        list2.add(new SNode(3,"ee"));
        list2.add(new SNode(6,"ff"));
        list2.add(new SNode(13,"gg"));

        // TODO: 2019/8/31  遍历两个链表，使用栈把两个链表的节点存储起来
        addStack(list1);
        addStack(list2);
        // TODO: 2019/8/31 新的链表
        SingleLinkedList list3 = new SingleLinkedList();

        // TODO: 2019/8/31 把栈上的节点，在新链表上进行有序的添加节点
        while (stack.size()>0){
            list3.addByOrder(stack.pop());
        }
        list3.show();
    }



    public static void addStack(SingleLinkedList list){

        SNode temp = list.getHead().getNext();
        while (true){
            if (temp == null) break;
            stack.add(temp);
            temp = temp.getNext();
        }

    }
    
}
