package Ex_2_1;

public class SummerPaint implements Paint{

    public SummerPaint() {
        createButton();
        createComboBox();
        createTextArea();
    }

    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextArea createTextArea() {
        return new SummerTextArea();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
