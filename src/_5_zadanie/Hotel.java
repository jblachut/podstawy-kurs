package _5_zadanie;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

public class Hotel {
    public static void main(String[] args) {
        //pobranie daty zameldowania
        System.out.println("Podaj datę zameldowania w formacie rrrr-mm-dd: ");
        Scanner in =new Scanner(System.in);
        String data1=in.nextLine();
        //definicja formattera z string na Localdate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //formatowanie daty zameldowania
        LocalDate meldunek = LocalDate.parse(data1, formatter);


        //pobieranie daty końca pobytu
        System.out.println("Podaj datę wymeldowania w formacie rrrr-mm-dd: ");
        String data2=in.nextLine();

        //zmiana formatu na podstawie wcześniej zdefinowanego formattera
        LocalDate koniec = LocalDate.parse(data2, formatter);

        //obliczenie ilości dni
        long iloscdni = ChronoUnit.DAYS.between(meldunek, koniec);

        //pobranie danych dotyczących ilości osób w formacie float by później można było mnożyć przez procent bez konwertowania
        System.out.println("Podaj liczbę osób doroslych: ");
        float dorosli = in.nextFloat();
        //long dorosli = in.nextLong();
        System.out.println("Podaj liczbę dzieci: ");
        float dzieci = in.nextFloat();
        System.out.println("Podaj liczbę niemowlakow: ");
        float niemowlakow = in.nextFloat();

        //definicja cen

        float cenadorosli=dorosli*180*iloscdni;
        float cenadzieci=dzieci*90*iloscdni;
        float cenaniemowlak=niemowlakow*20*iloscdni;
        float calosc=cenadorosli+cenadzieci+cenaniemowlak;



        System.out.println("kwota do zapłaty za osoby dorosłe to " +cenadorosli);
        System.out.println("kwota do zapłaty za dzieci to " +cenadzieci);
        System.out.println("kwota do zapłaty za niemowlaki to " +cenaniemowlak);


        if (iloscdni>7) {
            float rabat2=calosc/100;
            float rabat=rabat2*10;
            float cenaporabacie=calosc-rabat;
            System.out.println("Cena calościowa: " +calosc);
            System.out.println("Naliczono rabat w wysokości: " +rabat);
            System.out.println("Cena po udzieleniu rabatu: " +cenaporabacie);

        }else {
            System.out.println("Cena calościowa: " +calosc);
        }


    }
}
