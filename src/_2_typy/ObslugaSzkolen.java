package _2_typy;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class ObslugaSzkolen {

    public static void main(String[] args) {
        // Szkolenie szkolenieJava jeszcze nie przydzielono pamięci REFERENCJE
        Adres szkolenieJavaAdres = new Adres("34-350", "Słoneczna", "Katowice");
        Szkolenie szkolenieJava = new Szkolenie("Szkolenie Java", 10, new BigDecimal("1000"), LocalDate.of(2018, Month.DECEMBER, 16), szkolenieJavaAdres); // Lepsza wersja + konstruktory w klasie niż rozpisywanie niżej

        szkolenieJava.wyswietl();
        BigDecimal przychodBrutto = szkolenieJava.obliczprzychodBrutto();
        BigDecimal przychodNetto = szkolenieJava.obliczPrzychodNetto();
        System.out.println("Przychod brutto " + przychodBrutto);
        System.out.println("Przychod netto " + przychodNetto);



        System.out.println();
        Adres szkoleniePhytonAdres = new Adres("00-100", "Makowa", "Warszawa");
        Szkolenie szkoleniePhyton = new Szkolenie("Szkolenie Phyton", 12, new BigDecimal("2000"), LocalDate.of(2018, Month.DECEMBER, 23),szkoleniePhytonAdres);

        szkoleniePhyton.wyswietl();
        BigDecimal przychodBruttop = szkoleniePhyton.obliczprzychodBrutto();
        BigDecimal przychodNettop = szkoleniePhyton.obliczPrzychodNetto();
        System.out.println("Przychod brutto " + przychodBruttop);
        System.out.println("Przychod netto " + przychodNettop);


    }
}