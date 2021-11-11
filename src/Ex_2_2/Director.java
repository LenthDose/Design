package Ex_2_2;

public class Director {
    private final PanelBuilder builder;

    public Director(PanelBuilder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.buildPanel();
        builder.buildButton();
        builder.buildText();
        builder.buildLabel();
        builder.setPanel();
        builder.setLayout();
    }
}
