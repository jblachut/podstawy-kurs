package _4_kolekcje;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Zbior {
    public static void main(String[] args) {
        Set<String> numeryPesel = new HashSet<>();

        numeryPesel.add("7856595214");
        numeryPesel.add("7856595213");
        numeryPesel.add("7856595215");
        numeryPesel.add("7856595216");
        numeryPesel.add("7856595217");
        numeryPesel.add("7856595218");

        System.out.println(numeryPesel);

        numeryPesel.remove("7856595214");
        System.out.println(numeryPesel);

        if (numeryPesel.contains("7856595213")) {
            System.out.println("TAK");
        } else

            { System.out.println("NIE");}



        Set<String> posortowany = new TreeSet<>();
        posortowany.addAll(numeryPesel);

        Set<String> kolejnosc = new LinkedHashSet<>();
        kolejnosc.add("Wojciech");
        kolejnosc.add("Klaudia");
        kolejnosc.add("Anna");
        System.out.println(kolejnosc);


    }
}