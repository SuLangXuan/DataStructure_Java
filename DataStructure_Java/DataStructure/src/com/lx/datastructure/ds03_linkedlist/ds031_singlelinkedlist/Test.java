package com.lx.datastructure.ds03_linkedlist.ds031_singlelinkedlist;

/**
 * 单向链表功能测试
 */
public class Test {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        //添加节点
//        list.add(new SNode(1,"aa"));
//        list.add(new SNode(2,"bb"));
//        list.add(new SNode(3,"cc"));

        //todo 有效添加节点
        list.addByOrder(new SNode(6,"ee"));
        list.addByOrder(new SNode(2,"dd"));
        list.addByOrder(new SNode(4,"ff"));

        list.show();

        System.out.println("=====删除节点======");
        //todo 删除节点
        list.delete(6);
        System.out.println("=====修改节点======");
        //todo 修改节点
        list.update(new SNode(4,"GG"));
        list.show();
        System.out.println("=====查询节点======");
        // TODO: 2019/8/31 查询节点
        list.check(new SNode(2,""));

        System.out.println("=====单链表中有效节点的个数:"+ list.length() +"个======");

        System.out.println("==========查找单链表中的倒数第k个结点 【新浪面试题】===============");
        list.find(3);

        System.out.println("=== 反转链表 ====");
        list.reverse();
        list.show();

        System.out.println("=== 反转打印 方式1：反向遍历 =====");
        list.reversePrint1();
        System.out.println("=== 反转打印 方式2：Stack栈 =====");
        list.reversePrint2();
    }
}
