package com.lx.datastructure.ds03_linkedlist.ds031_singlelinkedlist;

/**
 * 单向链表功能测试
 */
public class Test {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
//        list.add(new SNode(1,"aa"));
//        list.add(new SNode(2,"bb"));
//        list.add(new SNode(3,"cc"));

        list.addByOrder(new SNode(6,"ee"));
        list.addByOrder(new SNode(2,"dd"));
        list.addByOrder(new SNode(4,"ff"));

        list.show();

        System.out.println("===========");
//        list.delete(4);
        list.update(new SNode(4,"GG"));
        list.show();
    }
}
