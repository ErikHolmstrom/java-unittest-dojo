package dojo.model;

import dojo.model.produce.Bread;
import dojo.model.produce.Produce;
import dojo.model.produce.ProduceFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

    public String getUserInput() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        return reader.readLine();
    }

    public void shop(ShoppingCart shoppingCart) {
        try {
            String userInput;
            do {
                userInput = getUserInput();
                Produce parsedProduce = ProduceFactory.getProduceFromString(userInput);
                shoppingCart.addProduce(parsedProduce);
            } while(!userInput.isEmpty());
        } catch(IOException e) {
            //DO nothing
        } catch(NumberFormatException nfe) {
            //Do nothing
        }

    }

}
