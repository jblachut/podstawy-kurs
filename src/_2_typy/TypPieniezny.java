package _2_typy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TypPieniezny {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("7.38");
        BigDecimal b = new BigDecimal("3.99");

        BigDecimal suma = a.add(b);
        BigDecimal roznica = a.subtract(b);
        BigDecimal iloczyn = a.multiply(b).setScale(2, RoundingMode.HALF_UP); // set scale bo to potrzebujemy po wykoaniu polecenia
        BigDecimal iloraz = a.divide(b, 2, RoundingMode.HALF_UP); // dzielna, zaokrąglenie, i rodzaj zaokrąglenia / w dzielnej bo to już potrzebne już w trakcie wykonywania działania

        System.out.println(suma);
        System.out.println(roznica);
        System.out.println(iloczyn);
        System.out.println(iloraz);
    }
}
