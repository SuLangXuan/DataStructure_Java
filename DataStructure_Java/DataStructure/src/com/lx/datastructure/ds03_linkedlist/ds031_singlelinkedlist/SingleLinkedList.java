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
     * 根据节点的编号有序的添加节点
     */
    public void addByOrder(SNode node){
        SNode temp = head;
        boolean flag = false;// TODO: 2019/8/31 标识当前节点在链表中是否已经存在
        while (true){
            // TODO: 2019/8/31 找到节点合适的位置，添加节点
            if (temp.getNext() == null) break;// TODO: 2019/8/31 已经是链表的最后了，说明当前节点的编号比链表中的全部节点都大
            if (node.getNo()<temp.getNext().getNo()) break;// TODO: 2019/8/31 下一个节点的编号比要添加的节点编号大，该节点需要加在下一个节点前
            if (node.getNo() == temp.getNext().getNo()){
                flag = true;
                break;
            }
            temp = temp.getNext();
        }
        if (flag){
            System.out.println("当前节点已经存在，不能重复添加");
        }else {
            node.setNext(temp.getNext());
            temp.setNext(node);
        }

    }

    /**
     * 删除节点
     */
    public void delete(int no){
        SNode temp = head;
        boolean flag = false;// TODO: 2019/8/31 标识要删除的节点是否存在
        while (true){
            if (temp.getNext() == null) break;
            if (temp.getNext().getNo() == no){
                flag = true;
                break;
            }
            temp = temp.getNext();
        }
        if (flag){
            temp.setNext(temp.getNext().getNext());
        }else {
            System.out.println("no:"+ no +"不存在");
        }
    }

    /**
     * 修改链表中的节点
     */
    public void update(SNode node){
        SNode temp = head;
        boolean flag = false;// TODO: 2019/8/31 标识当前节点在链表中是否存在
        while (true){
            if (temp.getNext() == null) break;// TODO: 2019/8/31 已经是链表的最后了，说明链表中没有对应的节点
            if (node.getNo() == temp.getNext().getNo()){
                flag = true;
                break;
            }
            temp = temp.getNext();
        }
        if (flag){
            node.setNext(temp.getNext().getNext());
            temp.setNext(node);
        }else {
            System.out.println("链表中没有对应的节点");
        }
    }

    /**
     * 查询
     */
    public void check(SNode node){
        SNode temp = head;
        boolean flag = false;// TODO: 2019/8/31 标识当前节点在链表中是否存在
        while (true){
            if (temp.getNext() == null) break;// TODO: 2019/8/31 已经是链表的最后了，说明链表中没有对应的节点
            if (node.getNo() == temp.getNo()){
                flag = true;
                break;
            }
            temp = temp.getNext();
        }
        if (flag){
            System.out.println(temp);
        }else {
            System.out.println("链表中没有对应的节点");
        }
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

    /**
     * TODO: 2019/8/31  单链表面试题(新浪、百度、腾讯)
     * 1.求单链表中有效节点的个数
     * 2.查找单链表中的倒数第k个结点 【新浪面试题】
     */

    /**
     * 1.求单链表中有效节点的个数
     */
    public int length(){
        SNode temp = head;
        if (head.getNext() == null){
            System.out.println("当前链表为空");
            return 0;
        }
        int count = 0;
        while (temp.getNext() != null){
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    /**
     * 2.查找单链表中的倒数第k个结点 【新浪面试题】
     */
    public void find(int num){
        if (head.getNext()== null) {
            System.out.println("当前节点为空");
            return;
        }
        int length = length();
        SNode temp = head.getNext();
        if (num>length){
            System.out.println("有效节点的个数为"+length+"个，不能查找倒数的第"+num+"个节点");
            return;
        }
        for (int i = 0;i <length-num;i++){
            temp = temp.getNext();
        }
        System.out.println(temp);
    }



}
