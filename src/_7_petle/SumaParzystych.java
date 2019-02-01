package _7_petle;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class SumaParzystych {

    static int suma(int[] tablica) {
        int wynik = 0;

        for (int i1 : tablica) { //definicja pętli pozycja
            // liczby w tablicy - i =0 i jest mniejsze niż wielkość tablicy, i dodaj do i 1
            if (i1 % 2 == 0) {
                wynik += i1;                    // do wyniku dodaj wartość z pozycji i w tablicy
            }
        }

        return wynik;
    }

    static int suma_stream(int[] tablica) {return IntStream.of(tablica).filter(x -> x % 2 == 0).sum();
    }

    // w przypadku gydy wniku może nie być tworzymy clase intiger zamiast typu int
    private static Integer max(int[] tablica) { //integer bo musimy zwrócić nulla
        if (tablica.length == 0) {
            return null;
        }
        int max = tablica[0];
        //for (int x = 0; x < tablica.length; x++) { //definicja pętli pozycja
        // liczby w tablicy - i =0 i jest mniejsze niż wielkość tablicy, i dodaj do i 1
        //przy int x=0 itd trzeba wpsywać tablica[x], w nowszej wersji nie trzeba - wystarczy x
        for (int x : tablica)
            if (x > max) {
                max = x;
            }
        return max;
    }

    //nowoczesne podejście do wartości opcjonalncy - soecialna klasa opcional
    private static OptionalInt maxx(int[] tablica) { //integer bo musimy zwrócić nulla

        if (tablica.length == 0) {
            return OptionalInt.empty();
        }
        int maxx = tablica[0];
        //for (int x = 0; x < tablica.length; x++) { //definicja pętli pozycja
        // liczby w tablicy - i =0 i jest mniejsze niż wielkość tablicy, i dodaj do i 1
        //przy int x=0 itd trzeba wpsywać tablica[x], w nowszej wersji nie trzeba - wystarczy x
        for (int x : tablica)
            if (x > maxx) {
                maxx = x;
            }
        return OptionalInt.of(maxx);
    }

    //dla wygody maina testującego umieszczamy w tym samym pliku
    public static void main (String[]args){
        int[] a = {10, 20, 30, 5, 10, 15};
        int[] b = {-20, -10, -5, -20};
        int[] c = {};

        System.out.println("max a : " + max(a));
        System.out.println("max b : " + max(b));
        System.out.println("max c : " + max(c));

        OptionalInt opt = maxx(c);
        if (opt.isPresent()){
            System.out.println("Wynik wynosi " +opt.getAsInt());
        } else {
            System.out.println("Brak wyniku");
        }
    }
}


//kiedy nie ma wyniku