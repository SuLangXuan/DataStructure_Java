package com.lx.datastructure.ds03_linkedlist.ds032_doublelinkedlist;

public class Test {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
//        list.add(new DNode(1,"aa"));
//        list.add(new DNode(10,"cc"));
//        list.add(new DNode(6,"cc"));
//        list.add(new DNode(4,"bb"));
//        list.add(new DNode(8,"cc"));

        list.addByOrder(new DNode(3,"kk"));
        list.addByOrder(new DNode(1,"kk"));
        list.addByOrder(new DNode(4,"kk"));
        list.addByOrder(new DNode(10,"kk"));
        list.addByOrder(new DNode(6,"kk"));
        list.show();
        System.out.println("======有序添加节点后， 查看 每个节点的 pre next 是否正确 =====");
//        DNode temp = list.getHead();
//        while (true){
//
//            System.out.println("=============start===================");
//            System.out.println("pre===="+temp.getPre());
//            System.out.println(temp);
//            System.out.println("next====="+temp.getNext());
//            System.out.println("==============end==================");
//            System.out.println();
//            if (temp.getNext()== null) break;
//            temp = temp.getNext();
//        }


        System.out.println("===== 有序的删除节点 ====");
        list.delete(10);
        list.show();


        System.out.println("========修改节点======");
        list.update(new DNode(4,"xuan"));
        list.show();

    }
}
