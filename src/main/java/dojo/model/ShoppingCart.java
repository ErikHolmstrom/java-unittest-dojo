package dojo.model;

import dojo.model.produce.Produce;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Produce> produceList = new ArrayList<>();

    public ShoppingCart(){}

    public void addProduce(Produce p){
        produceList.add(p);
    }

    public List<Produce> getProduceList() {
        return produceList;
    }





}
