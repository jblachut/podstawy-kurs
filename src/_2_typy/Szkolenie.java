package _2_typy;

import java.time.LocalDate;

public class Szkolenie {
    double cena;
    int liczba;
    String nazwa;
    LocalDate data;


    //1. Tworzenie nowego obiektu- Konstruktor :
    //budowa konstruktora
    //public lub private  Szkolenie - nazwa taka jak klasy (lista parametrow)  {
        //System.out.println("bezparametryczny");
    // bezparametryczny konstruktor ma się nazywać jak klasa
    public Szkolenie() {
        System.out.println("bezparametryczny"); //- wykonuje się podczast otworzenia nowego obiektu new

    }

    //parametryczny

    public Szkolenie(String nazwa, int liczba, double cena, LocalDate data ) {
        System.out.println("parametryczny");
        this.nazwa = nazwa; //this to ta z góry tzn z klasy - musimy pokazać konstruktorowi co do czego chcemy dopisac
        this.cena = cena;
        this.liczba = liczba;
        this.data = data;
    }


    //2. Wypisanie informacji o obiekcie
    // tworzenie metody //
    // public lub private typ zwracalny nazwa (lista parametrow)
    public void wyswietl() { // publiczna funcja nic nie zwraca i nie ma żadnych parametrów tzn zczytuje całość z klasy nie trzeba przepisywać
        System.out.println("Szkolenie " + this.nazwa);
        System.out.println("Cena " + this.cena);
        System.out.println("Data " + this.data);
        System.out.println("Liczba uczestników " + this.liczba);
    }

}
