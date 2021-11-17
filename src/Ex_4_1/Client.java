package Ex_4_1;

public class Client {

    public static void main(String[] args) {
        ProductionOperation operation;
        OtherProduction production = new OtherProduction();
        CarProduction car = new CarProduction();
        operation = new OperationAdapter(production,car);
        operation.ProductionController();
        operation.CarController();
    }
}
