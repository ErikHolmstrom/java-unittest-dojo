package dojo.model.produce;

public class ProduceFactory {

    public static Produce getProduceFromString(String produce) {
        if(produce.equals("Bread")){
            return new Bread();
        } else if(produce.equals("Milk")){
            return new Milk();
        } else if(produce.equals("Tomato")){
            return new Tomato();
        }
        return null;
    }


}
