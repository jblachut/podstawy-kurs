package _8_funkcje;


import java.util.Locale;
import java.util.Scanner;

import static _8_funkcje.KonwersjaJednostek.*;

public class TestowanieFunkcji3 {
    public static void main(String[] args) {
        System.out.println("Podaj km");
        Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US);

        //km na mile

        double km = wejscie.nextDouble();
        double iloscmil= kmtoml(km);
        System.out.println("Ilość ml to "+ kmtoml(km));

        //ml na km
        System.out.println("Podaj ml");
        double ml =wejscie.nextDouble();
        System.out.println("ilosc km to "+ mltokm(ml));

        System.out.println("Podaj farenhaity");
        double fr =wejscie.nextDouble();
        System.out.println("ilosc c to "+ frtoc(fr));

        System.out.println("Podaj celciusze");
        double c =wejscie.nextDouble();
        System.out.println("ilosc fr to "+ ctofr(c));

// testy domyślne bez pytania użytkownika
            System.out.println("100 mil = " + mltokm(100.0) + " km" );
            System.out.println("2 mile = " + mltokm(2) + " km" );
            System.out.println();

            System.out.println("160 km = " + kmtoml(160.0) + " mil" );
            System.out.println("10 km = " + kmtoml(10.0) + " mil" );
            System.out.println();

            System.out.println("0 C = " + ctofr(0.0) + " F" );
            System.out.println("100 C = " + ctofr(100.0) + " F" );
            System.out.println("37 C = " + ctofr(37.0) + " F" );

            System.out.println("0 F = " + frtoc(0.0) + " C" );
            System.out.println("100 F = " + frtoc(100.0) + " C" );
            System.out.println("32 F = " + frtoc(32.0) + " C" );

        }
}
