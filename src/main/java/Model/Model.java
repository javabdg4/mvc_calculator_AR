package Model;

import java.math.BigInteger;

public class Model {

    private static final String INITIAL_VALUE = "0";

    private BigInteger total;

    public void multiply(String value) {
        total = total.multiply(new BigInteger(value));
    }

    public void setValue(String value) {
        total = new BigInteger(value);
    }

    public String getValue() {
        return total.toString();
    }
}
