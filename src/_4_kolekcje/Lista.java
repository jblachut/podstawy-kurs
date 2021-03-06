package _4_kolekcje;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        //List imiona; // zadeklarowanie zmiennej listy imion
       // List imiona = new ArrayList<>(); //Arraylist - lista oparta na tablicy
        List<String> imiona = new ArrayList<>();
        imiona.add("Wojciech");
        imiona.add("Justyna");
        imiona.add("Marcin");
        imiona.add("Sylwia");

        System.out.println(imiona);
        System.out.println("Rozmiar: " + imiona.size());
        System.out.println("Pozycja 1: " + imiona.get(1));

        for (String imie : imiona){
            if (imie.endsWith("a")) {
                System.out.println(imie);
                break; //zatrzymuje po 1 pętl
            }
        }
        //imiona.remove("Wojciech");
        //System.out.println(imiona);

        if (imiona.contains("Justyna")) {
            System.out.println("Tak");
        }else {
            System.out.println("Nie");
        }

        //imiona.sort()
        Collections.sort(imiona);
        System.out.println(imiona);

    }
}
