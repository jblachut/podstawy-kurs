package _7_petle;

/*

 */

import java.math.BigDecimal;
import java.util.Scanner;

public class Parkomat {

    public static void main(String[] args) {

        System.out.println("Ilę godzin będziesz parkował");
        Scanner wejscie = new Scanner(System.in);
        BigDecimal ilosc = wejscie.nextBigDecimal();
        BigDecimal cena = new BigDecimal ("2.9");
        BigDecimal oplata = (BigDecimal) ilosc.multiply(cena); // gdyby ilosc godzin była int
                                                               // cena.multyply(BigDecimal.Valueof(ilosc))/ muliplej
        System.out.println("Opłata za parkowanie wynosi " +oplata);


        BigDecimal kwota = new BigDecimal(0);// na samym początku w skarbonce jest zero można wpisać Bigdecimal.ZERO

        while (kwota.compareTo(oplata)<0) { // starsza wersja :
            System.out.println("Wrzuć monetę");
            BigDecimal wrzutka = wejscie.nextBigDecimal();
            kwota  = kwota.add(wrzutka);
            // skarbonka += wrzutka;  // inny zapis - bardziej popularny
        }
        System.out.println("Należność  "+ oplata);
        System.out.println("udało się zebrać "+ kwota);
        if (oplata.compareTo(kwota)<0) {
            BigDecimal reszta=kwota.subtract(oplata);
            System.out.println("do wydania "+ reszta);
        }


}
}