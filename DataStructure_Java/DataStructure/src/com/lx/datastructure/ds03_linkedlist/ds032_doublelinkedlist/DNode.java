package com.lx.datastructure.ds03_linkedlist.ds032_doublelinkedlist;

/**
 * 双向链表的节点
 */
public class DNode {
    private int no;
    private String name;
    private DNode next;
    private DNode pre;

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

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }

    public DNode getPre() {
        return pre;
    }

    public void setPre(DNode pre) {
        this.pre = pre;
    }

    public DNode() {
    }

    public DNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "DNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
