package _3_tablice;

public class Tablice1 {
    public static void main(String[] args) {
        int[] tablica = new int[8];

        System.out.println("Długość tablicy: "+ tablica.length);
        System.out.println("Element 3 tablicy: " + tablica[2]);  //numerowanie od 0 więc element trzeci ma nr 2
        //System.out.println("Element nieistniejąc" + tablica[8]); pojawia sie wtedy wyjątek bo indeksowanie jest od 0 - 7

        tablica[3] = 165;

        int[] tablicaWypelniona = {178, 185, 165, 195 };

        //pętle !!
        // pętla for
        //      implementuj zmienne ; dopóki elementów tablic jest wiecej niż już powstałych zmiennych; dodaj powtórzenie do i
        for (int i = 0; i < tablicaWypelniona.length; i++) {
                System.out.println(i + ": " + tablicaWypelniona[i]);
        }
        System.out.println("");

        //od tyłu

        for (int j = tablicaWypelniona.length-1; j >=0; j--) {
            System.out.println(j + ": " + tablicaWypelniona[j]);
        }
        System.out.println("");

        // co druga

        for (int g = 0; g <tablicaWypelniona.length; g=g+2) {
            System.out.println(g + ": " + tablicaWypelniona[g]);
        }
    }
}
