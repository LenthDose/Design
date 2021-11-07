package Ex_3_2;

import javax.swing.*;


public class ChineseBuilder extends PanelBuilder{


    @Override
    void buildFrame() {
        panel.setFrame(new JFrame());
    }

    @Override
    void buildPanel() {
        panel.setPanel(new JPanel());
    }

    @Override
    void buildButton() {
        panel.setButton(new JButton("按钮"));
    }

    @Override
    void buildText() {
        panel.setTextField(new JTextField("文本框"));
    }

    @Override
    void buildLabel() {
        panel.setLabel(new JLabel("标签"));
    }

    @Override
    void setPanel() {
        Panel().add(panel.getButton());
        Panel().add(panel.getLabel());
        Panel().add(panel.getTextField());
    }

}
