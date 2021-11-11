package Ex_2_1;

public class SpringButton implements Button{

    public SpringButton() {
        paint();
    }

    @Override
    public void paint() {
        System.out.println("SpringButton");
    }
}
