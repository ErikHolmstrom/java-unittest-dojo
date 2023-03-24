package dojo.model.produce;

import java.math.BigDecimal;

public class Milk implements Produce {

    private BigDecimal cost = new BigDecimal(12);

    @Override
    public BigDecimal getCost() {
        return cost;
    }

    @Override
    public Unit getUnit() {
        return Unit.Piece;
    }
}
