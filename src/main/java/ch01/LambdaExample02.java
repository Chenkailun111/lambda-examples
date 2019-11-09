package ch01;

import javax.swing.*;
import java.util.function.BinaryOperator;

/**
 * Created by Joker on 19/11/9.
 *
 * Lambda表达式多种写法
 */
public class LambdaExample02 {

    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("Run Thread.");
        Runnable r2 = () -> {
            System.out.println("L1");
            System.out.println("L2");
        };

        BinaryOperator<Integer> add = (x, y) -> x + y;
        BinaryOperator<Long> addExpr = (Long x, Long y) -> x + y;
    }
}
