package com.lx.datastructure.ds03_linkedlist.ds031_singlelinkedlist;

/**
 *  带头节点的单向链表
 */
public class SingleLinkedList {

    private SNode head;

    public SingleLinkedList() {
        head = new SNode();
    }

    /**
     * 添加节点
     */
    public void add(SNode node){
        // TODO: 2019/8/31 找到链表中的最后一个节点，然后加入
        SNode temp = head;
        while (true){
            if (temp.getNext() == null) break;//找到最后一个节点了
            temp = temp.getNext();
        }
        temp.setNext(node);
    }

    /**
     * 遍历打印链表中的全部节点
     */
    public void show(){
        if (head.getNext()==null){
            System.out.println("当前链表为空");
            return;
        }
        SNode temp = head.getNext();
        while (true){
            System.out.println(temp);
            if (temp.getNext() == null) break;//找到最后一个节点了
            temp = temp.getNext();
        }
    }

}
