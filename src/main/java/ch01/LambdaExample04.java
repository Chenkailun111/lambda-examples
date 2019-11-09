package ch01;

import javax.swing.*;

/**
 * Created by Joker on 19/11/9.
 *
 * Lambda函数接口学习
 */
public class LambdaExample04 {

    public static void main(String[] args) {
        MyInterface myInterface = (type) -> System.out.println("吃 " + type);
        myInterface.eat("鸡");
    }
}
