package Ex_4_1;

public class OperationAdapter implements ProductionOperation{

    private final OtherProduction production;
    private final CarProduction carProduction;

    public OperationAdapter(OtherProduction production, CarProduction carProduction) {
        this.production = production;
        this.carProduction = carProduction;
    }

    @Override
    public void ProductionController() {
        production.ProductionLight();
        production.ProductionSound();
    }

    @Override
    public void CarController() {
        carProduction.CarLight();
        carProduction.CarSound();
    }
}
