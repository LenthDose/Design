package Ex_3_1;

import javax.swing.*;

public class SunWuKong extends Panel{

    public SunWuKong() {
        JLabel label = new JLabel();
        ImageIcon img = new ImageIcon("src/img/1.png");
        label.setIcon(img);
        panel.add(label);
        setLayout(frame, panel);
    }

    public SunWuKong(SunWuKong target) {
        super(target);
        JLabel label = new JLabel();
        ImageIcon img = new ImageIcon("src/img/1.png");
        label.setIcon(img);
        panel.add(label);
        setLayout(frame, panel);
    }

    @Override
    public Panel clone() {
        return new SunWuKong(this);
    }

}
