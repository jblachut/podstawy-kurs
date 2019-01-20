package _9_kalkulator;

import java.util.Scanner;

// INSTRUKCJE STERUJĄCE
//switch
public class KlakulatorKonsolowy2 {
    public static void main(String[] args) {
        System.out.println("Podaj kolejne działania w formie x + x");
        System.out.println("Zakończ podając literę");

        Scanner wejscie = new Scanner(System.in);
        while (true) { //rozpoczyna pętle bo pyta cały czas
            System.out.println(">");
            try { //łapanie wyjątku
                double arg1 = wejscie.nextDouble();  //delitherem jest spacja next wpisze 1 token sc.useDelimiter(!@#$%%^); - dołożenie kolejnych delimiterów poza spacją
                String operacja = wejscie.next();    // nextline - całość, next do spacji
                double arg2 = wejscie.nextDouble();
                double wynik;

                switch (operacja) {
                    case "+":
                        wynik = arg1 + arg2;
                        break;
                    case "-":
                        wynik = arg1 - arg2;
                        break;
                    case "*":
                        wynik = arg1 * arg2;
                        break;
                    case "/":
                        wynik = arg1 / arg2;
                        break;
                    default:
                        wynik = 0;

                }
                System.out.println(wynik);


            } catch (Exception e) {
                System.out.println("Do widzenia");
                break;

            }
        }
    }
}
