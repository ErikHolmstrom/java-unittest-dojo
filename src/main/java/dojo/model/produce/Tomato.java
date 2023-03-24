package dojo.model.produce;

import java.math.BigDecimal;

public class Tomato implements Produce {

    private BigDecimal cost = new BigDecimal(54);


    @Override
    public BigDecimal getCost() {
        return cost;
    }

    @Override
    public Unit getUnit() {
        return Unit.Kilogram;
    }
}
