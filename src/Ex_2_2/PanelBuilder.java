package Ex_2_2;

import javax.swing.*;
import java.awt.*;

public abstract class PanelBuilder {

    protected Panel panel = new Panel();
    abstract void buildFrame();
    abstract void buildPanel();
    abstract void buildButton();
    abstract void buildText();
    abstract void buildLabel();
    abstract void setPanel();

    Panel createPanel(){
        return panel;
    }

    void setLayout(){
        JFrame frame = panel.getFrame();
        JPanel cards = new JPanel(new CardLayout());
        cards.add(Panel(),"p1");
        CardLayout cl = (CardLayout) cards.getLayout();
        cl.show(cards,"p1");
        frame.add(cards);
        frame.setBounds(300,200,200,100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    JPanel Panel(){
        return panel.getPanel();
    }
}
