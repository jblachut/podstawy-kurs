package _4_kolekcje;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String,Integer> inwentarz = new HashMap<>();
        inwentarz.put("Mysz",4);
        inwentarz.put("Monitor",2);
        inwentarz.put("Glosniki", 10);

        System.out.println(inwentarz);
        inwentarz.put("Monitor",21);
        System.out.println(inwentarz); // dane się nadpisują w mapie, klucze muszą być unikalne


    }
}
