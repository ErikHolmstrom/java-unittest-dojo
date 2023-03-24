import dojo.model.produce.Milk
import spock.lang.Specification

class ProduceTest extends Specification {

    // Example of a test
   def 'test'() {
       given: 'Something'
            Milk milk = new Milk()
       when: 'Doing this'
            def cost = milk.getCost()
       then: 'This should happen'
            cost == 24
   }
}