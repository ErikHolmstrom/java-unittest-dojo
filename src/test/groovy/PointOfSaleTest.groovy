import dojo.model.PointOfSale
import dojo.model.ShoppingCart
import dojo.model.money.Money
import dojo.model.produce.Bread
import spock.lang.*

class PointOfSaleTest extends Specification {


    void setupSpec(){
        //A function used to setup data that will be run ONCE before ALL the tests
    }

    void setup() {
        //A function used to setup data that will be run ONCE before EVERY test
    }

    void cleanupSpec(){
        //A function used to clean up data that will be run ONCE after ALL the tests
    }

    void cleanup(){
        //A function used to clean up data that will be run ONCE after EVERY test
    }

    //An example of a test implementation
    def "Check that the produce in the shopping cart is added to the register"() {
       given: 'One thousand "money" in the pos'
            List<Money> money = [new Money(Money.Value.OneThousand)]
            PointOfSale pointOfSale = new PointOfSale(money)

        and:'Attempting to purchase some bread'

            def sc = new ShoppingCart()
            sc.addProduce(new Bread())
            pointOfSale.Purchase(sc)

       when: 'Fetching the register from the pos'
            def result = pointOfSale.getRegister()

       then: 'The pos register should contain the bread'
            result.size() == 1
            result.get(0) instanceof Bread

    }
}