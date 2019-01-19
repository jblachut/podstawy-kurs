package _7_petle;

import java.util.stream.IntStream;

public class SumaParzystych {

    static int suma(int[] tablica) {
        int wynik = 0;

        for (int i = 0; i < tablica.length; i++) { //definicja pętli pozycja
            // liczby w tablicy - i =0 i jest mniejsze niż wielkość tablicy, i dodaj do i 1
            if (tablica[i] % 2 == 0) {
                wynik += tablica[i];                    // do wyniku dodaj wartość z pozycji i w tablicy
            }
        }

            return wynik;
        }
    static int suma_stream(int[] tablica) {
        return IntStream.of(tablica).filter(x -> x%2==0).sum();
    }

    //dla wygody maina testującego umieszczamy w tym samym pliku
    public static void main (String[]args){
        int[] a = {10, 20, 30, 5, 10, 15};
        int[] b = {-20, 0, 5, 20,};

        System.out.println("suma a : " + suma_stream(a));
        System.out.println("suma b : " + suma(b));
    }
}
