package _4_kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        //List imiona; // zadeklarowanie zmiennej listy imion
       // List imiona = new ArrayList<>(); //Arraylist - lista oparta na tablicy
        List<String> imiona = new ArrayList<>();
        imiona.add("Wojciech");
        imiona.add("Justyna");
        imiona.add("Sylwia");
        imiona.add("Sylwia");

        System.out.println(imiona);
        System.out.println("Rozmiar: " + imiona.size());
        System.out.println("Pozycja 1: " + imiona.get(1));
    }
}
