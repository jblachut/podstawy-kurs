package _7_petle;

public class FunkcjeNaTablicach {

    //stwórz metodę sumującą tablicę

    static int suma(int[] tablica) {
        int wynik = 0;
        //pętla która zsumuje wszytskie elementy tablicy

        for (int liczba : tablica) {            // dla każdej liczbiy z tablicy

            wynik = liczba + wynik;

        }

        return wynik;
    }
        //dla wygody maina testującego umieszczamy w tym samym pliku
        public static void main (String[]args){
            int[] a = {10, 20, 30, 5, 10, 15};
            int[] b = {-20, 0, 5, 20,};

            System.out.println("suma a : " + suma(a));
            System.out.println("suma b : " + suma(b));
        }
    }
