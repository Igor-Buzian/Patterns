package decorator;

import interfaces.Beverage;

public class MilkDecorator extends BeverageDecorator {
    private final double MILK_COST = 1.5;
    private final String DESCRIPTION = ", with milk";

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+DESCRIPTION;
    }

    @Override
    public double getCost() {
        return super.getCost()+MILK_COST;
    }
}
