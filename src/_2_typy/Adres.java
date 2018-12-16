package _2_typy;

public class Adres {
    String kodpocztowy;
    String ulica;
    String miasto;


    //1. Tworzenie nowego obiektu- Konstruktor :
    //budowa konstruktora
    //public lub private  Szkolenie - nazwa taka jak klasy (lista parametrow)  {
    //System.out.println("bezparametryczny");
    // bezparametryczny konstruktor ma się nazywać jak klas
    public Adres() {
        System.out.println("bezparametryczny"); //- wykonuje się podczast otworzenia nowego obiektu new

    }

    //parametryczny

    public Adres(String kodpocztowy, String ulica, String miasto) {
        System.out.println("parametryczny");
        this.kodpocztowy = kodpocztowy; //this to ta z góry tzn z klasy - musimy pokazać konstruktorowi co do czego chcemy dopisa
        this.ulica = ulica;
        this.miasto = miasto;

    }


    //2. Wypisanie informacji o obiekcie
    // tworzenie metody //
    // public lub private typ zwracalny nazwa (lista parametrow)
    public void wyswietl() { // publiczna funcja nic nie zwraca i nie ma żadnych parametrów tzn zczytuje całość z klasy nie trzeba przepisywać
        System.out.println("Miasto " + this.miasto);
        System.out.println("kodpocztowy " + this.kodpocztowy);
        System.out.println("ulica " + this.ulica);
    }

}

