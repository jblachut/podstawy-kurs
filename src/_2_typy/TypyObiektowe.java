package _2_typy;

import java.util.Scanner;

public class TypyObiektowe {

    public static void main(String[] args) {

        System.out.print("podaj swoje imię : ");

        Scanner wejscie = new Scanner(System.in);

        String imie = wejscie.nextLine();

        int iloscZnakow = imie.length();
        System.out.println("Słowo " + imie + " ma " + iloscZnakow + " znakow");

        if (iloscZnakow <= 6) {
            System.out.println("Krótkie słowo");
        }else {
            System.out.println("Długie słowo");
        }

        boolean ostatniaLiteraA = imie.endsWith("a") || imie.endsWith("A"); // or || i if wszystko w jednym nawiasie

                if (ostatniaLiteraA= true && !imie.equalsIgnoreCase("Kuba")) { // ! wykrzyknik zaprzecznie.
                    System.out.println("kobieta");
                }else {
                    System.out.println("mezczyzna");
                }

    }
}
