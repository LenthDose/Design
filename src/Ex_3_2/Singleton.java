package Ex_3_2;

import javax.swing.*;


public class Singleton {

    private static Singleton instance;

    private Singleton(String name) {
        JFrame frame = new JFrame();
        frame.setTitle(name+"看月亮");
        JLabel label = new JLabel("月亮的半径是1738.0km,距地球是363300.0km");
        JPanel panel = new JPanel();
        panel.add(label);
        frame.add(panel);
        frame.setBounds(200,300,300,150);// JFrame最大化
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 让JFrame的关闭按钮起作用
        frame.setVisible(true);
    }

    public static Singleton getInstance(String name){
        if (instance == null){
            instance = new Singleton(name);
        }
        return instance;
    }
}
