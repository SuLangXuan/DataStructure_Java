package com.lx.datastructure.ds04_stack.ds043_calculator;


import java.util.ArrayList;
import java.util.Stack;

/**
 * 后缀表达式
 */
public class SuffixExpression {

    public static void main(String[] args) {
        getSuffxExpressionValue("3 4 + 5 * 6 - ");
    }

    /**
     * 计算后缀表达式的值
     */
    public static Integer getSuffxExpressionValue(String suffixExpression){
        //TODO: 2019/9/4 1.把后缀表达式分割存储到list中
        ArrayList<String> list = suffexExpressionToList(suffixExpression);
        System.out.println(list);

        // TODO: 2019/9/4
        /**
         * 1)从左至右扫描，将3和4压入堆栈；
         * 2)遇到+运算符，因此弹出4和3（4为栈顶元素，3为次顶元素），计算出3+4的值，得7，再将7入栈；
         * 3)将5入栈；
         * 4)接下来是×运算符，因此弹出5和7，计算出7×5=35，将35入栈；
         * 5)将6入栈；
         * 6)最后是-运算符，计算出35-6的值，即29，由此得出最终结果
         */

        Stack<Integer> stack = new Stack<>();
        for (String s : list) {
            // TODO: 2019/9/4 如果是数字，入数栈
            if (s.matches("\\d+")){
                stack.push(Integer.parseInt(s));
            }else {
                Integer num1 = stack.pop();
                Integer num2 = stack.pop();
                Integer res = 0;
                if (s.equals("+")){
                    res = num1+num2;
                }else if (s.equals("-")){
                    res = num2-num1;
                }else if (s.equals("*")){
                    res = num1*num2;
                }else if (s.equals("/")){
                    res = num2/num1;
                }else {
                    System.out.println("运算符有误");
                }
                stack.push(res);
            }
        }
        Integer cal = stack.pop();
        System.out.println(suffixExpression + " = " + cal);
        return cal;
    }

    /**
     * TODO: 2019/9/4 1.把后缀表达式分割存储到list中
     */
    public static ArrayList<String> suffexExpressionToList(String suffixExpression){
        String[] strings = suffixExpression.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (String string : strings) {
            list.add(string);
        }
        return list;
    }


}
