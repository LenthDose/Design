package Ex_2_1;

public class SpringPaint implements Paint{
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
