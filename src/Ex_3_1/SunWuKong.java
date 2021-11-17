package Ex_3_1;

import javax.swing.*;

public class SunWuKong extends Panel{

    public SunWuKong() {
        setLabel();
    }

    public SunWuKong(SunWuKong target) {
        super(target);
        setLabel();
    }

    @Override
    public Panel clone() {
        return new SunWuKong(this);
    }


    void setLabel(){
        JLabel label = new JLabel(new ImageIcon("src/img/1.png"));
        panel.add(label);
        setLayout(frame, panel);
    }
}
