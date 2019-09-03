package com.lx.datastructure.ds04_stack.ds043_calculator;

/**
 * 使用栈来实现计算器，专用的栈
 */
public class StackCalculator {

    private int top=-1;
    private int maxSize;
    private int[] stack;

    public StackCalculator(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    // TODO: 2019/9/3 栈满
    public boolean isFull(){
        return top == maxSize-1;
    }

    // TODO: 2019/9/3 栈空
    public boolean isEmpty(){
        return top == -1;
    }

    // TODO: 2019/9/3 入栈
    public void push(int num){
        if (isFull()) {
            System.out.println("当前栈满");
            return;
        }
        top++;
        stack[top]=num;
    }

    // TODO: 2019/9/3 出栈
    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("栈为空");
        }
        int i = stack[top];
        top--;
        return i;
    }

    // TODO: 2019/9/3 遍历栈
    public void show(){
        for (int i = top ;i>=0;i--){
            System.out.println(stack[i]);
        }
    }

    // TODO: 2019/9/3 查看栈顶的数据的值
    public int getTopData(){
        return stack[top];
    }

    // TODO: 2019/9/3 判断是否是运算符
    public boolean isOperator(int ch){
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    public boolean isOperator2(CharSequence ch){
        return "+-*/".contains(ch);
    }

    // TODO: 2019/9/3 返回运算符的优先级,数字越大，则优先级就越高.
    public int priority(int ch){
        if (ch == '+' || ch == '-'){
            return 1;
        }else if (ch == '*'|| ch == '/'){
            return 2;
        }else {
            return -1;
        }
    }

    // TODO: 2019/9/3 运算
    public int cal(int num1,int num2,int oper){
        int result = 0;
        switch (oper){
            case '+': result=num1+num2;break;
            case '-': result=num2-num1;break;
            case '*': result=num1*num2;break;
            case '/': result=num2/num1;break;
        }
        return result;
    }
}
