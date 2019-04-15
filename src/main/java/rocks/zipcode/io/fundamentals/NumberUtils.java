package rocks.zipcode.io.fundamentals;

public class NumberUtils {
    public static Integer getValue(String integerAsString) {
        return Integer.parseInt(integerAsString);
    }

    public static Double exponentiate(Double baseValue, Double exponent) {
        return Math.pow(baseValue, exponent);
    }

    public static Integer exponentiate(Integer baseValue, Integer exponent) {
        return exponentiate(baseValue.doubleValue(), exponent.doubleValue()).intValue();
    }
}
