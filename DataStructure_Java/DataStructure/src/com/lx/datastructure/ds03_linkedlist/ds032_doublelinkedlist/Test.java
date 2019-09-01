package com.lx.datastructure.ds03_linkedlist.ds032_doublelinkedlist;

public class Test {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(new DNode(1,"aa"));
        list.add(new DNode(10,"cc"));
        list.add(new DNode(6,"cc"));
        list.add(new DNode(4,"bb"));
        list.add(new DNode(8,"cc"));

//        list.addByOrder(new DNode(3,"kk"));
//        list.addByOrder(new DNode(1,"kk"));
//        list.addByOrder(new DNode(4,"kk"));
//        list.addByOrder(new DNode(10,"kk"));
//        list.addByOrder(new DNode(6,"kk"));
        list.show();

        System.out.println("===== 有序的删除节点 ====");
        list.delete(10);
        list.show();


        System.out.println("========修改节点======");
        list.update(new DNode(4,"xuan"));
        list.show();

    }
}
