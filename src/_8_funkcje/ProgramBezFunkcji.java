package _8_funkcje;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBezFunkcji {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US);
        double a = wejscie.nextDouble();

        double poleKwadratu=a*a;
        double poleKola=Math.PI * poleKwadratu;
        System.out.println("pole kwadratu to "+ poleKwadratu);
        System.out.println("pole kola to "+ poleKola);

        System.out.println("Losuję liczbę");
        double losowa = Math.random() *100; // od 0 do 100
        double poleKwadratu2=losowa*losowa;
        double poleKola2=Math.PI * poleKwadratu2;
        System.out.println("wylosowana liczba to "+  losowa);
        System.out.println("pole kwadratu to "+ poleKwadratu2);
        System.out.println("pole kola to "+ poleKola2);


    }
}
