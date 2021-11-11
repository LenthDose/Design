package Ex_2_1;

public class SpringTextArea implements TextArea{

    public SpringTextArea() {
        paint();
    }

    @Override
    public void paint() {
        System.out.println("SpringTextArea");
    }
}
