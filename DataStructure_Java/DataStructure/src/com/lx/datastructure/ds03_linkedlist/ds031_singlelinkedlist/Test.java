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

        System.out.println("===========");
        //todo 删除节点
//        list.delete(4);
        //todo 修改节点
        list.update(new SNode(4,"GG"));
        list.show();
        System.out.println("===========");
        // TODO: 2019/8/31 查询节点
        list.check(new SNode(2,""));

    }
}
