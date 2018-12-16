package _2_typy;

import java.math.BigDecimal;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Wiek {
    public static void main(String[] args) {
        System.out.print("podaj datę urodzenia w formacie rrrr-mm-dd: ");

        Scanner wejscie = new Scanner(System.in);

        String data = wejscie.nextLine();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dataU = LocalDate.parse(data, formatter);

        System.out.print("podaj płec Kobieta/Mężczyzna: ");

        String plec = wejscie.nextLine();

        LocalDate dzis = LocalDate.now();

        Period roznica = Period.between(dataU, dzis);

        int wiek = roznica.getYears();

        System.out.println("Twój wiek to: " + wiek);
        System.out.println("Twoja płeć to: " + plec);

        if (wiek < 18) {

            System.out.print("Jesteś niepełnoletni ");
        } else if
            (wiek < 65) {
                System.out.print("Jesteś w wieku produkcyjnym ");
            } else {
                System.out.print("Jesteś w wieku emerytalnym ");
                ;
            }}

        }




