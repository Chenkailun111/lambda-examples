package ch01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Joker on 19/11/9.
 *
 * 学习Lambda表达式的第一个例子
 */
public class LambdaExample01 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JButton button = new JButton("测试");


        // JDK7的写法
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("被点击了");
//            }
//        });

        // JDK8 Lambda写法
        /***
         * Lambda表达式的写法
         *   参数 -> 主体
         *
         */
        button.addActionListener(event -> System.out.println("被电了"));

        panel.add(button);

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
