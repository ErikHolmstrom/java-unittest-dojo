<h1>Java unit test dojo</h1>
This project is made for trying out unit testing in java.
This dojo can be done using either spock or Junit to try out unit testing some java code, choose whatever you prefer

<h3>Spock links</h3>
https://spockframework.org/spock/docs/2.3/

<h3>Junit links</h3>
https://junit.org/junit5/docs/current/user-guide/
https://site.mockito.org/


<h2>Step 1: Basics</h2>
We will start by implementing the PointOfSaleTest test, the goal here is to learn some basics in with asserts
and setting up tests.

1. Start by testing the cost of the produce in the "ProduceTest" class
2. (For spock) Implement the ProduceFactoryTest 



<h2>Step 2: Mocking</h2>
In the second exercise we will implement the UserInput test. The goal here is to practice mocking data. <br>
1. Test the shop method by mocking away the "getUserInput" method. A recommendation is to use the spy functionality.
2. Afterwards try to mock away the "ProduceFactory.getProduceFromString" functionality, refactor the code as needed 
to make it work


<h2>Step 3: Setup & Cleanup</h2>
Now we will test reusing code between different tests, Open the PointOfSale test class. <br>
The point of sale (pos) works like a machine in a supermarket, it takes a list of money in the constructor that represents the Bills & coins that is in the machine.
The pos then takes a shopping cart containing a list of produce and puts it into the registry.
The customer then can give the POS money by using the "getChange" method, make sure that the change returns represents what can be removed from the machine and 
handed to the customer by the saleworker.
<br>
There is already a reference test which makes a POS which scans the produce in a shopping cart you can look at.

1. Make a happy case where the customer pays for some produce and gets the correct money back
2. Try some not as happy cases and see what happens, maybe you can find some bugs?
3. Try to catch the thrown exceptions, google if you are unsure how