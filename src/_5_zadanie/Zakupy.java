package _5_zadanie;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.ArrayList;


public class Zakupy {

    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        ArrayList<Produkt> produkt1 = new ArrayList<>();
        char end = 'T';
        String nazwa;
        BigDecimal cena;
        int ilosc;

        while (end == 'T') {
            System.out.print("Podaj nazwę produktu: ");
            nazwa = wejscie.nextLine();
            System.out.print("Podaj cenę produktu: ");
            cena = wejscie.nextBigDecimal();
            System.out.print("Podaj ilość sztuk: ");
            ilosc = wejscie.nextInt();

            produkt1.add(new Produkt(nazwa, cena, ilosc));

            System.out.println(" Wprowadzic kolejną pozycję na liście? (T/N)");
            String word = wejscie.next();
            word = word.toUpperCase();
            end = word.charAt(0);

            System.out.println("Lista zawiera : "+produkt1.size() + "produkty");


        }




    }
}