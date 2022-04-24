package enums_practice;


public class TaxRates {
    States states;

    public TaxRates(States states) {
        this.states = states;
    }

    public Object getCurrentStateTax(States state) {
        switch (state){
            case GA -> {
                return calGATaxRate();
            }
            case VA -> {
                return 6;
            }
            case MD -> {
                return 7;
            }
            default -> {
                return 0;
            }
        }
    }

    public int calGATaxRate() {
        //We could put in some parameters for covering different classes

        return 8;
    }
}
