package dojo.model.money;

public class Money {
    private Value value;

    public Money(Value value) {
        this.value = value;
    }

    public int getValue() {
        return value.getValue();
    }

    enum Value {
        One(1),
        Two(2),
        Five(5),
        Ten(10),
        Twenty(20),
        Fifty(50),
        OneHundred(100),
        TwoHundred(200),
        FiveHundred(500),
        OneThousand(1000);

        private final int value;
        Value(int val){
            this.value = val;
        }
        public int getValue(){
            return value;
        }

    }


}
