package FirstFile.JAVASecond;

import java.math.BigDecimal;
import java.math.BigInteger;

public class First {
    public static void main(String[] args) {
        
        BigInteger num1 =  new BigInteger("17");
        BigInteger num2 = new BigInteger("4");

        BigInteger addNums = num1.divide(num2);
        System.out.println("The division is : " + addNums);

        BigDecimal a = new BigDecimal("17");
        BigDecimal b = new BigDecimal("4");
        BigDecimal sum = a.divide(b);

        System.out.println("The sum of the two numbers in BigDecomal is : " + sum);
    }
}
