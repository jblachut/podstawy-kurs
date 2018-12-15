package _2_typy;

import java.time.LocalDate;
import java.time.Month;

public class ObslugaSzkolen {

    public static void main(String[] args) {
        // Szkolenie szkolenieJava jeszcze nie przydzielono pamięci REFERENCJE
        Szkolenie szkolenieJava = new Szkolenie("Szkolenie Java", 10, 1000, LocalDate.of(2018,Month.DECEMBER,16)); // Lepsza wersja + konstruktory w klasie niż rozpisywanie niżej

       szkolenieJava.wyswietl();

        Szkolenie szkolenieJava1 = new Szkolenie();

        szkolenieJava1.nazwa = "Szkolenie Java1";
        szkolenieJava1.cena = 1000;
        szkolenieJava1.liczba = 15;
        szkolenieJava1.data = LocalDate.of(2018, Month.DECEMBER, 15);

        System.out.println("Szkolenie " + szkolenieJava1.nazwa);
        System.out.println("Cena " + szkolenieJava1.cena);
        System.out.println("Data " + szkolenieJava1.data);
        System.out.println("Liczba uczestników " + szkolenieJava1.liczba);

        System.out.println();

        Szkolenie szkoleniePhyton = new Szkolenie();
        szkoleniePhyton.nazwa = "Szkolenie Phyton";
        szkoleniePhyton.cena = 2200;
        szkoleniePhyton.liczba = 17;
        szkoleniePhyton.data = LocalDate.of(2019, Month.FEBRUARY, 15);

        System.out.println("Szkolenie " + szkoleniePhyton.nazwa);   //println - wydrukuj do nowej lini - print - wydrukuj w jednej lini
        System.out.printf("Cena: %.2f PLN\n", szkoleniePhyton.cena); // printf - formatowanie daty %.2f - 2 miejsca po przecinku \n  od nowej lini \t tabulator
        System.out.println("Data " + szkoleniePhyton.data);
        System.out.println("Liczba uczestników " + szkoleniePhyton.liczba);

    }
}