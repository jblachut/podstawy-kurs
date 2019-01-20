package _8_funkcje;

public class Parametry1 {

    static void metoda1(int x) {
        System.out.println("metoda1, x = " + x);
        x += 5;
        System.out.println("metoda1, x = " + x);
    }

    static void metoda2(Skarbona skarbonka) {
        System.out.println("metoda2, wartosc = " + skarbonka.wartosc);
        skarbonka.wplata(7);
        System.out.println("metoda2, wartosc = " + skarbonka.wartosc);
    }

    public static void main(String[] args) {
        int x = 100;
        System.out.println("main, x = " + x);
        metoda1(x);
        System.out.println("main, x = " + x);
        System.out.println();

        Skarbona skarbonka = new Skarbona();
        System.out.println("main, wartosc = " + skarbonka.wartosc);
        metoda2(skarbonka);
        System.out.println("main, wartosc = " + skarbonka.wartosc);
    }
}


class Skarbona {
    int wartosc = 0;

    void wplata(int ile) {
        wartosc += ile;
    }
}


