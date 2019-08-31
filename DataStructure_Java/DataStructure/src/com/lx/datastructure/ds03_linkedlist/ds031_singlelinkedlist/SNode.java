package com.lx.datastructure.ds03_linkedlist.ds031_singlelinkedlist;

/**
 * 单向链表的节点
 * 数据
 * 指针
 */
public class SNode {

    private int no;
    private String name;
    private SNode next;

    public SNode() {
    }

    public SNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SNode getNext() {
        return next;
    }

    public void setNext(SNode next) {
        this.next = next;
    }
}
