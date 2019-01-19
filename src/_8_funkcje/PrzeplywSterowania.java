package _8_funkcje;

public class PrzeplywSterowania {

    static void metoda0 () { // zdefiniowanie metody0 ale nie jej wywołanie - brak main
        System.out.println(" metoda 0");
    }

    static void metoda1 () { // zdefiniowanie metody0 ale nie jej wywołanie - brak main
        System.out.println(" metoda 1");
    }

    public static void main(String[] args) { //wywołanie main
        System.out.println("początek");
        metoda1();  // nie trzeba podawać nazwy klasy gdy jesteśmy w tej klasie
        System.out.println("początek2");
        metoda1();
        System.out.println("początek 3");
        metoda2("Ala ma kota"); // nazwa metoda2 a w nawiasie wartość parametru
        System.out.println();
        metoda2("Katowice sdsdsd");
        int wynik = powtorz("Lubie jave", 3);
        System.out.println("wynik powtarzania" +wynik);
    }

    static void metoda2(String napis) {
        System.out.println("metoda2 otrzymała parametr " + napis);
        System.out.println("Ten napis ma liter: " + napis.length());
        System.out.println("A napisany wielkimi literami: " + napis.toUpperCase());
    }
    static int powtorz(String napis, int ileRazy) {
        for(int i=0; i <ileRazy; i++){
            System.out.println(napis);
        }
        return napis.length()*ileRazy; //zwraca wynik funkcji ile znaków zostało w sumie wypisanych
    }
}
