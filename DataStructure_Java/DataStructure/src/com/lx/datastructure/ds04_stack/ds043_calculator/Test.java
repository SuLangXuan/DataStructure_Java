package com.lx.datastructure.ds04_stack.ds043_calculator;

public class Test {

    public static void main(String[] args) {
        StackCalculator stackCalculator = new StackCalculator(5);
        stackCalculator.push(1);
        stackCalculator.push(2);
        stackCalculator.push(3);
        stackCalculator.push(4);
        stackCalculator.push(5);
        stackCalculator.show();
        System.out.println(stackCalculator.getTopData());
        System.out.println(stackCalculator.pop());

        System.out.println(stackCalculator.cal(10, 20, '*'));
        System.out.println(stackCalculator.priority('+'));
        System.out.println(stackCalculator.priority('-'));
        System.out.println(stackCalculator.priority('*'));
        System.out.println(stackCalculator.priority('/'));

//        System.out.println(stackCalculator.pop());
    }
}
