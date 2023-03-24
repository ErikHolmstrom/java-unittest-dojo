package dojo.model;

import dojo.model.money.Money;
import dojo.model.produce.Produce;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PointOfSale {

    private List<Money> cash;
    private List<Produce> register;

    public PointOfSale(List<Money> initialMoney){
        cash = initialMoney;
        register = new ArrayList<>();
    }

    /**
     * Scans a shopping cart into the machine
     * @param cart
     */
    public void Purchase(ShoppingCart cart) {
        register.addAll(cart.getProduceList());
    }

    public List<Produce> getRegister() {
        return register;
    }

    /**
     * Gets the price total of all the registered produce
     * @return
     */
    public BigDecimal getCurrentRegisterPrice() {
        BigDecimal result = new BigDecimal(0);
        register.stream().forEach(p -> result.add(p.getCost()));
        return result;
    }


    /**
     * Takes a list of money and returns the change from the cashier of possible
     * @return
     * @throws NotEnoughMoneyException if buyer cannot afford his/her purchase or the cashier does not have enough change
     */
    public List<Money> getChange(List<Money> payment) throws NotEnoughMoneyException{
        int moneyBackAmount = getCurrentRegisterPrice().subtract(BigDecimal.valueOf(convertMoneyListToInt(payment))).intValue();
        if(moneyBackAmount < 0) {
            throw new NotEnoughMoneyException("Buyer does not have enough money");
        }
        List<Money> moneyBack = new ArrayList<>();
        while(moneyBackAmount > 0) {
            if(cash.size() == 0) {
                throw new NotEnoughMoneyException("Cashier does not have enough change");
            }
            for(int i=0; i< cash.size(); i++) {
                if(cash.get(i).getValue() <= moneyBackAmount) {
                    moneyBack.add(cash.get(i));
                    moneyBackAmount -= cash.get(i).getValue();
                    cash.remove(i);
                    break;
                }
            }
        }

        return moneyBack;
    }



    public int getCashValue() {
        return convertMoneyListToInt(cash);
    }

    private int convertMoneyListToInt(List<Money> moneyList) {
        return moneyList.stream().map(Money::getValue).collect(Collectors.summingInt(Integer::intValue));
    }

    class NotEnoughMoneyException extends Exception {
        public NotEnoughMoneyException(String msg) {
            super(msg);
        }
    }
}
