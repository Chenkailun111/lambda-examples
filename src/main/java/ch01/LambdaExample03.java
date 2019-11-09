package ch01;

import javax.swing.*;

/**
 * Created by Joker on 19/11/9.
 *
 * lambda引用变量
 */
public class LambdaExample03 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JButton button = new JButton("测试");

        final String name = "小墨鱼";

        button.addActionListener(event -> System.out.println("被电了 " + name));

        panel.add(button);

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
