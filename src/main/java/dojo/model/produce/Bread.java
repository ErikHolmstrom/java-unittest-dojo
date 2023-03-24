package dojo.model.produce;

import java.math.BigDecimal;

public class Bread implements Produce{
    private BigDecimal cost = new BigDecimal(20);

    @Override
    public BigDecimal getCost() {
        return cost;
    }

    @Override
    public Unit getUnit() {
        return Unit.Piece;
    }
}
