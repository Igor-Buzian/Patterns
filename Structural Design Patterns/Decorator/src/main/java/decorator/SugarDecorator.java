package decorator;

import interfaces.Beverage;

public class SugarDecorator extends BeverageDecorator {
    private final double SUGAR_COST = 0.5;
    private final String DESCRIPTION = ", with sugar";

    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + DESCRIPTION;
    }

    @Override
    public double getCost() {
        return super.getCost() + SUGAR_COST;
    }
}
