import dojo.model.PointOfSale;
import dojo.model.ShoppingCart;
import dojo.model.money.Money;
import dojo.model.produce.Bread;
import dojo.model.produce.Produce;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PointOfSaleJunitTest {

    @Test
    void getRegister() {
        List<Money> money = new ArrayList<>();
        money.add(new Money(Money.Value.OneThousand));
        PointOfSale pointOfSale = new PointOfSale(money);

        ShoppingCart sc = new ShoppingCart();
        sc.addProduce(new Bread());
        pointOfSale.Purchase(sc);

        List<Produce> result = pointOfSale.getRegister();
        assertEquals(1, result.size());
    }

}
