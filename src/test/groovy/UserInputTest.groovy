import dojo.model.produce.Tomato
import spock.lang.Specification


class UserInputTest extends Specification {

    def 'Mock example'(){
        when:'Making a mock object of the Tomato class'
            def tomatoMock = Mock(Tomato.class)
        then: 'The cost is no longer set'
            tomatoMock.getCost() == null

        when: 'Making a mock object and mocking the getCost method'
            def tomatoMock2 = Mock(Tomato.class)
            tomatoMock2.getCost() >> 10
        then:'The mock value is adjusted to what is previously set'
            tomatoMock2.getCost() == 10

        when: 'Making a spy of a new tomato object'
            def tomatoSpy = Spy(new Tomato())
        then: 'The real method is used'
            tomatoSpy.getCost() == 54

        when:'When making a spy of a new tomato object and mocking the getCost method'
            def tomatoSpy2 = Spy(new Tomato())
            tomatoSpy2.getCost() >> 20
        then: 'The value is changed to what is mocked'
            tomatoSpy2.getCost() == 20

        when: 'You use a function implementation of a mocked method'
            def tomatoMockFunc = Mock(Tomato.class)
            tomatoMockFunc.getCost() >> {
                def cost = 10
                cost += 100
                cost //no return statement is needed, this will be passed back
            }
        then:
            tomatoMockFunc.getCost() == 110

    }

}