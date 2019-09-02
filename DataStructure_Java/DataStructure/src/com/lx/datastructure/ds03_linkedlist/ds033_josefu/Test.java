package com.lx.datastructure.ds03_linkedlist.ds033_josefu;

import com.lx.datastructure.ds03_linkedlist.ds031_singlelinkedlist.SingleLinkedList;

public class Test {
    public static void main(String[] args) {
        // TODO: 2019/9/2 构建一个单向环形链表
        SingleCircleLinkedList list = new SingleCircleLinkedList();
        list.createSingleCircleLinkedList(10);
        list.show();
    }
}
