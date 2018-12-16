package _4_kolekcje;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapa {
    public static void main(String[] args) {
        Map<String,Integer> inwentarz = new TreeMap<>();
        inwentarz.put("Mysz",4);
        inwentarz.put("Monitor",2);
        inwentarz.put("Glosniki", 10);

        System.out.println(inwentarz);
        inwentarz.put("Monitor",21);
        System.out.println(inwentarz); // dane się nadpisują w mapie, klucze muszą być unikalne

        System.out.println("Stan Głośników: " + inwentarz.get("Glosniki"));

        System.out.println(inwentarz.values());
        System.out.println(inwentarz.keySet());
        System.out.println(inwentarz.containsKey("Glosniki"));
        System.out.println(inwentarz.containsValue(10));
        int suma = 0;

        for (String klucz : inwentarz.keySet()) {
            suma=suma+inwentarz.get(klucz);
        }
        System.out.println("suma produktów: " + suma);
    }
}
