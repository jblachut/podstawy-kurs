package _2_typy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Szkolenie {
    BigDecimal cena;
    int liczba;
    String nazwa;
    LocalDate data;
    Adres adres;



    //1. Tworzenie nowego obiektu- Konstruktor :
    //budowa konstruktora
    //public lub private  Szkolenie - nazwa taka jak klasy (lista parametrow)  {
        //System.out.println("bezparametryczny");
    // bezparametryczny konstruktor ma się nazywać jak klasa
    public Szkolenie() {
        System.out.println("bezparametryczny"); //- wykonuje się podczast otworzenia nowego obiektu new

    }

    //parametryczny

    public Szkolenie(String nazwa, int liczba, BigDecimal cena, LocalDate data, Adres adres ) {
        System.out.println("parametryczny");
        this.nazwa = nazwa; //this to ta z góry tzn z klasy - musimy pokazać konstruktorowi co do czego chcemy dopisac
        this.cena = cena;
        this.liczba = liczba;
        this.data = data;
        this.adres=adres;
    }


    //2. Wypisanie informacji o obiekcie
    // tworzenie metody //
    // public lub private typ zwracalny nazwa (lista parametrow)
    public void wyswietl() { // publiczna void funkcja nic nie zwraca i nie ma żadnych parametrów tzn zaczytuje całość z klasy nie trzeba przepisywać
        System.out.println("Szkolenie " + this.nazwa);
        System.out.println("Cena " + this.cena);
        System.out.println("Data " + this.data);
        System.out.println("Liczba uczestników " + this.liczba);
        adres.wyswietl();

    }public BigDecimal obliczprzychodBrutto() {
      //  double przychod = this.liczba * this.cena;
      //  return przychod;

        return cena.multiply(BigDecimal.valueOf(liczba)); // bez this też może być
    }
    public BigDecimal obliczPrzychodNetto() {
        return obliczprzychodBrutto().divide(BigDecimal.ONE.add(StaleAplikacji.STAWKA_VAT), 2, RoundingMode.HALF_UP);

        // można też dla czystości zapisu stawkę VAT wyrzucić do nowej zmiennej tymczasowej
        //    public BigDecimal obliczPrzychodNetto() {
        //BigDecimal vat = BigDecimal.ONE.add(StaleAplikacji.STAWKA_VAT);
        //return obliczprzychodBrutto().divide(vat, 2,  RoundingMode.HALF_UP);
    }

}
