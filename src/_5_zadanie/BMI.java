package _5_zadanie;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("Podaj swój wzrost w m");
        Scanner wejscie = new Scanner(System.in);
        float wzrost = wejscie.nextFloat();

        // zmiana z string na float
        //float wzrostcm =Integer.parseInt(wzrost);
        //double wzrostcm =Integer.parseInt(wzrost);


        System.out.println("Podaj wagę w kg: ");

        float waga = wejscie.nextFloat();
        //float wagakg =Integer.parseInt(waga);
        //double wagakg =Integer.parseInt(waga);

        float mianownik = wzrost*wzrost;
        float bmi = waga/mianownik;

        System.out.println("Twoje BMI wynosi: " + bmi);

        if (bmi<18 && bmi>12) {

            System.out.print("Masz niedowagę ");
        } else if
        (bmi >18 && bmi<25) {
            System.out.print("Twoja waga jest prawidłowa ");
        } else if
            (bmi >25 && bmi<29) {
            System.out.print("Twoje  BMI wskazuje na otyłość");
        } else if
        (bmi >30) {
            System.out.print("Ciężka otyłość");

        }else {
            System.out.print("Coś poszło nie tak");

        }


    }
}
