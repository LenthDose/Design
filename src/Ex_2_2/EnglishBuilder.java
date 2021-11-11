package Ex_2_2;

import javax.swing.*;

public class EnglishBuilder extends PanelBuilder {

    @Override
    void buildPanel() {
        panel.setPanel(new JPanel());
    }

    @Override
    void buildButton() {
        panel.setButton(new JButton("button"));
    }

    @Override
    void buildText() {
        panel.setTextField(new JTextField("textField"));
    }

    @Override
    void buildLabel() {
        panel.setLabel(new JLabel("label"));
    }

    @Override
    void setPanel() {
        Panel().add(panel.getTextField());
        Panel().add(panel.getLabel());
        Panel().add(panel.getButton());
    }
}
