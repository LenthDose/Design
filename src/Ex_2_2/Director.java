package Ex_3_2;

public class Director {
    private PanelBuilder builder = null;

    public Director(PanelBuilder builder) {
        this.builder = builder;
    }

    public Panel construct(){
        builder.buildFrame();
        builder.buildPanel();
        builder.buildButton();
        builder.buildText();
        builder.buildLabel();
        builder.setPanel();
        builder.setLayout();
        return builder.createPanel();
    }
}
