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

    /**
     * Josephu  问题为：设编号为1，2，… n的n个人围坐一圈，
     * 约定编号为k（1<=k<=n）的人从1开始报数，
     * 数到m 的那个人出列，
     * 它的下一位又从1开始报数，数到m的那个人又出列，
     * 依次类推，直到所有人出列为止，由此产生一个出队编号的序列。
     */
    public void josephu(int k,int m,int n){
        if (k<1 || k>n || first==null) return;

        // TODO: 2019/9/2 拿到链表中最后的节点
        Boy endNode = getEndNode();

        // TODO: 2019/9/2 把first,end 移动到第K个节点
        for (int i = 0; i<k-1;i++){
            first = first.getNext();
            endNode = endNode.getNext();
        }

        while (true){
            if (first == endNode)break; // TODO: 2019/9/2 只剩最后一个节点
            // TODO: 2019/9/2 数对应的第m个节点，
            for (int i = 0;i<m-1;i++){
                first = first.getNext();
                endNode = endNode.getNext();
            }

            System.out.println("no:"+first.getNo());
            first = first.getNext();
            endNode.setNext(first);
        }
        System.out.println(first.getNo());


    }

    /**
     * 拿到链表中最后的节点
     */
    public Boy getEndNode(){
        Boy end = first;
        while (true){
            if (end.getNext() == first) break;
            end = end.next;
        }
        return end;
    }

}
