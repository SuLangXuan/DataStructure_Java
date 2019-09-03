package com.lx.datastructure.ds04_stack.ds043_calculator;

/**
 * 使用栈完成表达式的计算 思路
 * 1. 通过一个 index  值（索引），来遍历我们的表达式
 * 2. 如果我们发现是一个数字, 就直接入数栈
 * 3. 如果发现扫描到是一个符号,  就分如下情况
 * 3.1 如果发现当前的符号栈为 空，就直接入栈
 * 3.2 如果符号栈有操作符，就进行比较,如果当前的操作符的优先级小于或者等于栈中的操作符， 就需要从数栈中pop出两个数,在从符号栈中pop出一个符号，进行运算，将得到结果，入数栈，然后将当前的操作符入符号栈， 如果当前的操作符的优先级大于栈中的操作符， 就直接入符号栈.
 * 4. 当表达式扫描完毕，就顺序的从 数栈和符号栈中pop出相应的数和符号，并运行.
 * 5. 最后在数栈只有一个数字，就是表达式的结果
 */
public class Calculator {
    public static void main(String[] args) {

        // TODO: 2019/9/3
        cal("2+3*2-4*8");
    }

    public static int cal(String expression){

        // TODO: 2019/9/3 创建两个栈 数栈 运算符栈 `
        StackCalculator stackNum = new StackCalculator(10);
        StackCalculator stackOper = new StackCalculator(10);

        // TODO: 2019/9/3 遍历表达式的每一个字符 
        int index = 0;
        char c = ' ';
        int num1,num2,oper;
        while (true){
            //表达式中的每一个字符
            c = expression.substring(index,index+1).charAt(0);
            System.out.println(c);
//            System.out.println("=====数栈========");
//            stackNum.show();
//            System.out.println("=====运算符栈========");
//            stackOper.show();
            // TODO: 2019/9/3 判断字符 
            if (stackNum.isOperator(c)){
                //是字符
                if (stackOper.isEmpty()){
                    // TODO: 2019/9/3 如果符号栈为空，直接入栈，
                    stackOper.push(c);
                }else {
                    // TODO: 2019/9/3 小于等于 取去数栈对应的数，符号栈的符号，进行运算，然后把值入数栈，再把当前符号入符号栈
                    if (stackOper.priority(c)<=stackOper.priority(stackOper.getTopData())){
                        num1 = stackNum.pop();
                        num2 = stackNum.pop();
                        oper = stackOper.pop();
                        int res = stackNum.cal(num1, num2, oper);
                        stackNum.push(res);
                        stackOper.push(c);
                    }else {// TODO: 2019/9/3 如果当前的符号优先级大于符号栈,直接入栈
                        stackOper.push(c);
                    }
                }
            }else {
                //是数字，加入数栈，因为c 是对应的字符‘1’ 要按asic码表转换，就是相差48 ，所以减48
                stackNum.push(c-48);
            }
            
            index++;
            if (index >= expression.length()) break;
        }

        System.out.println("==========遍历完=================");
        System.out.println("=====数栈========");
        stackNum.show();
        System.out.println("=====运算符栈========");
        stackOper.show();

        // TODO: 2019/9/3 遍历完后，开始计算
        while (!stackOper.isEmpty()){
            num1 = stackNum.pop();
            num2 = stackNum.pop();
            oper = stackOper.pop();
            int res = stackNum.cal(num1, num2, oper);
            stackNum.push(res);
        }

        int result = stackNum.pop();
        System.out.println("表达式"+expression+"="+result);
        return result;
    }
}

  