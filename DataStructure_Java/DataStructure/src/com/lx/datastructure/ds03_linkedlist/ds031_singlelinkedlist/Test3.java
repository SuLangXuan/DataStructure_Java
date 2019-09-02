package com.lx.datastructure.ds03_linkedlist.ds031_singlelinkedlist;

/**
 * 判断单链表中是否存在环
 */
public class Test3 {

    public static void main(String[] args) {
        // TODO: 2019/9/2 先创建一个有环的单向链表
        SNode head = new SNode();
        SNode node1 = new SNode(1,"aa");
        SNode node2 = new SNode(2,"bb");
        SNode node3 = new SNode(3,"cc");
        SNode node4 = new SNode(4,"dd");
        SNode node5 = new SNode(5,"ee");
        SNode node6 = new SNode(6,"ff");


        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        node6.setNext(node3);



    }


    /**
     * 6.判断单链表中是否存在环【网络搜索链表面试题，很多】
     * 使用快慢指针 来 判断，如果两指针能相遇，存在环。
     */
    public static SNode isLoop2(SNode first){
        SNode fast = first , slow = first;//定义两个指针，分别是快和慢
        //遍历一遍链表，如果最后是null的话就代表没有环
        while (fast != null && fast.getNext() != null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
            //如果俩相遇了，代表有环
            if (fast == slow){
                return fast;
            }
        }
        return null;
    }


    /**
     * 6.判断单链表中是否存在环【网络搜索链表面试题，很多】
     * 使用快慢指针 来 判断，如果两指针能相遇，存在环。
     */
    public static boolean isLoop(SNode head){
        SNode fast=head;
        SNode slow=head;
        while (fast != null && fast.getNext() != null){
            fast = fast.getNext().getNext();
            slow = head.getNext();
            if (fast == slow){
                break;
            }
        }

        if  (fast == null || fast.getNext() == null) {
            return false;
        }else{
            return true;
        }
    }
    
}
