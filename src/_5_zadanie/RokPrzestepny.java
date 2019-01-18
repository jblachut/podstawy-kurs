package _5_zadanie;


import java.util.Scanner;

public class RokPrzestepny{

    public static void main(String[] args) {
        System.out.print("podaj rok: ");
        Scanner wejscie = new Scanner(System.in);

        String rokk = wejscie.nextLine();

        // zmiana z string na int
        float rok =Integer.parseInt(rokk);


        // sprawdz czy rok jest podzielny przez 4 oraz nie jest podzielny
        // przez sto lub jest podzielny przez 400.
        if (rok%4==0 && rok%100!=0 || rok%400==0){
            System.out.println("Tak");
        } else {
            System.out.println("Nie");
        }
    }
}