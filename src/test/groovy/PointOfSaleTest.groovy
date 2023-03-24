import dojo.model.PointOfSale
import dojo.model.ShoppingCart
import dojo.model.money.Money
import dojo.model.produce.Bread
import spock.lang.*

class PointOfSaleTest extends Specification {
    /**
     * Lets start by making a test for the method: Purchase
     *
     */


    def "Check that register"() {
       given:
        List<Money> money = [new Money(Money.Value.OneThousand)]
        PointOfSale pointOfSale = new PointOfSale(money)

        def sc = new ShoppingCart()
       sc.addProduce(new Bread())
        pointOfSale.Purchase(sc)
       when:
       def result = pointOfSale.getRegister()

       then:
        result.size() == 1

    }
}