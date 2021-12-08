package Ex_7_2;

public class ChildrenDiscount implements Discount{
    @Override
    public double calculate(double price) {
        return price - 10;
    }
}
