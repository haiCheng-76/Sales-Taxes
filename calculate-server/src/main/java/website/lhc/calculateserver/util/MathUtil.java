package website.lhc.calculateserver.util;

import website.lhc.commoserver.exceptions.ServerException;

import java.math.BigDecimal;


public class MathUtil {

    public static BigDecimal add(BigDecimal val1, BigDecimal val2) {
        return val1.add(val2);
    }

    public static BigDecimal addDouble(double val1, double val2) {
        return add(BigDecimal.valueOf(val1), BigDecimal.valueOf(val2));
    }

    public static BigDecimal sub(BigDecimal val1, BigDecimal val2) {
        return val1.subtract(val2);
    }

    public static BigDecimal subDouble(double val1, double val2) {
        return sub(BigDecimal.valueOf(val1), BigDecimal.valueOf(val2));
    }

    public static BigDecimal mult(BigDecimal val1, BigDecimal val2) {
        return val1.multiply(val2);
    }

    public static BigDecimal div(BigDecimal val1, BigDecimal val2) {
        if (val1.compareTo(val2) == -1) {
            throw new ServerException("无效数据");
        }
        return val1.divide(val2);
    }
}
