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
     * 删除双向链表中的节点
     */
    public void delete(int num){
        if (head.getNext() == null) return;
        DNode temp = head.getNext();
        boolean flag = false; // TODO: 2019/9/1 标识在链表中是否找到对应要删除的节点
        while (true){
            if (temp==null) break;
            if (temp.getNo() == num){
                flag = true;
                break;
            }
            temp = temp.getNext();
        }
        if (flag){

            if (temp.getNext()!=null){
                temp.getPre().setNext(temp.getNext());
                temp.getNext().setPre(temp.getPre());
            }else {// TODO: 2019/9/1 如果是最后一个节点，不需要设置下一个节点的pre,当前节点直接删除
                temp.getPre().setNext(null);
            }
        }else {
            System.out.println("num:"+num+"在链表中不存在");
        }
    }




    /**
     * 修改双向链表的节点
     */
    public void update(DNode node){
        if (head.getNext() == null) return;
        DNode temp = head.getNext();
        boolean flag = false;
        while (true){
            if (temp == null) break; // TODO: 2019/9/1 找到最后，没找着
            if (temp.getNo() == node.getNo()){
                flag = true;
                break;
            }
            temp = temp.getNext();
        }
        if (flag){
            temp.getPre().setNext(node);
            if (temp.getNext()!=null){// TODO: 2019/9/1 最后一个节点的情况 
                node.setNext(temp.getNext());
            }
        }else {
            System.out.println("链表中不存在对应的节点");
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
            if (temp == null) break;//找到最后一个节点了
            System.out.println(temp);
            temp = temp.getNext();
        }
    }


}
