package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double dollarConverter(double price, double amount) {
        return price * amount * (1.0 + IOF);
    }
}
