import java.util.BigInteger

public class HugeInteger {
    public BigInteger number;
    
    public HugeInteger(String number) {
        this.number = new BigInteger(number);
    }
}
