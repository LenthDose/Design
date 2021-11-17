package Ex_3_1;

import javax.swing.*;

public abstract class Panel {

    public JFrame frame = new JFrame();
    public JPanel panel = new JPanel();

    public Panel() {
    }

    public Panel(Panel target) {
        this.frame = target.frame;
        this.panel = target.panel;
    }

    void setLayout(JFrame frame, JPanel panel){
        frame.add(panel);
        frame.setBounds(200,300,500,350);// JFrame最大化
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 让JFrame的关闭按钮起作用
        frame.setVisible(true);
    }

    public abstract Panel clone();
}
