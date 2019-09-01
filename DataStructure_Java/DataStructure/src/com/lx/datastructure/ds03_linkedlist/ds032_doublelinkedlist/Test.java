package com.lx.datastructure.ds03_linkedlist.ds032_doublelinkedlist;

public class Test {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
//        list.add(new DNode(1,"aa"));
//        list.add(new DNode(4,"bb"));
//        list.add(new DNode(6,"cc"));

        list.addByOrder(new DNode(3,"kk"));
        list.addByOrder(new DNode(1,"kk"));
        list.addByOrder(new DNode(4,"kk"));
        list.addByOrder(new DNode(10,"kk"));
        list.addByOrder(new DNode(6,"kk"));
        list.show();
    }
}
