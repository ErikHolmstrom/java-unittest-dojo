<h1>Java unit test dojo</h1>
This project is made for trying out unit testing in java.
This dojo can be done using either spock or Junit to try out unit testing some java code, choose whatever you prefer

<h3>Spock links</h3>
https://spockframework.org/spock/docs/2.3/

<h3>Junit links</h3>
https://junit.org/junit5/docs/current/user-guide/
https://site.mockito.org/


<h2>Basics</h2>
We will start by implementing the PointOfSaleTest test, the goal here is to learn some basics in with asserts
and setting up tests.
There is already a reference test you can look at.
1. Start by testing the "getChange" by asserting



<h2>Mocking</h2>
In the second exercise we will implement the UserInput test. The goal here is to practice mocking data. <br>
1. Test the shop method by mocking away the "getUserInput" method. A recommendation is to use the spy functionality.
2. Afterwards try to mock away the "ProduceFactory.getProduceFromString" functionality, refactor the code as needed 
to make it work