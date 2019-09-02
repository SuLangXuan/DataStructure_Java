package com.lx.datastructure.ds03_linkedlist.ds033_josefu;

/**
 * 单向环形链表
 */
public class SingleCircleLinkedList {

    public Boy first = null;


    /**
     * 创建一个单向的环形链表
     */
    public void createSingleCircleLinkedList(int num){
        if (num<1) return;
        Boy curBoy = null;
        for (int i = 1;i <= num;i++){
            Boy boy = new Boy(i);
            if (i==1){
                first = boy;
                first.setNext(first);
                curBoy = first;
            }else {
                curBoy.setNext(boy);
                boy.setNext(first);
                curBoy = boy;
            }
        }
    }


    /**
     * 遍历环形链表
     */
    public void show(){
        if (first == null){
            System.out.println("当前链表为空");
            return;
        }
        Boy curBoy = first;
        while (true){
            System.out.println(curBoy);
            if (curBoy.getNext()==first) break;
            curBoy = curBoy.getNext();
        }

    }


}
