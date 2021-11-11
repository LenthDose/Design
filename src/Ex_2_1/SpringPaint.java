package Ex_2_1;

public class SpringPaint implements Paint{

    public SpringPaint() {
        createButton();
        createComboBox();
        createTextArea();
    }

    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextArea createTextArea() {
        return new SpringTextArea();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
