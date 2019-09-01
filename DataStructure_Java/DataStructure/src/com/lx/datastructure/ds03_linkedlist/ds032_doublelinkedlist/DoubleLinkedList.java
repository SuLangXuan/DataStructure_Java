package com.lx.datastructure.ds03_linkedlist.ds032_doublelinkedlist;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 双向链表
 */
public class DoubleLinkedList {

    private DNode head;

    public DoubleLinkedList() {
        head = new DNode();
    }

    /**
     * 添加节点
     * 找到最后一个节点添加
     */
    public void add(DNode node){
        DNode temp = head;
        while (true){
            if (temp.getNext() == null) break;
            temp = temp.getNext();
        }
        temp.setNext(node);
        node.setPre(temp);
    }

    /**
     * 有序添加节点
     * 找到合适的节点，然后设置前后next pre
     */
    public void addByOrder(DNode node){
        DNode temp = head;
        boolean flag = false;// TODO: 2019/9/1 标识当前节点在链表中是否已经存在
        while (true){
            //找到最后了
            if (temp.getNext() == null)break;
            if (temp.getNext().getNo()>node.getNo()) break;
            if (temp.getNo() == node.getNo()){
                flag = true;
                break;
            }
            temp = temp.getNext();
        }
        if (flag){
            System.out.println("当前节点已经存在"+node);
        }else {
                node.setNext(temp.getNext());
                temp.setNext(node);
                node.setPre(temp);
        }
    }

    /**
     * 顺序遍历打印链表中的全部节点
     */
    public void show(){
        if (head.getNext()==null){
            System.out.println("当前链表为空！");
            return;
        }
        DNode temp = head.getNext();
        while (true){
            System.out.println(temp);
            if (temp.getNext() == null) break;//找到最后一个节点了
            temp = temp.getNext();
        }
    }
}
