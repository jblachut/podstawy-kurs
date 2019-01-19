package _7_petle;

import java.util.Scanner;

public class Skarbonka {
    public static void main(String[] args) {

       // pętla while (warunkek) {instrukcje} / dopuki warunek jest spełniony to spełnia instrukcje i znów sprawdza warunek i jeśli jest spełniony...
                // jeśli nie spełniony to przechodzi dalej

        //jaś dostał pustą skarbonkę ie chce zebrać 100 zł program w pętli będzie prosił o wrzucenie pieniążka do skarboni aż zbierze sie 100 zł

        Scanner wejscie = new Scanner(System.in);
        int skarbonka = 0; // na samym początku w skarbonce jest zero
        // z racji tego że nie wiemy ile razy bedziemy prosić o pieniążka używamy while
        while (skarbonka<100) {
            System.out.println("Wrzuć monetę");
            int wrzutka = wejscie.nextInt();
            skarbonka=skarbonka+wrzutka;
            // skarbonka += wrzutka;  // inny zapis - bardziej popularny
        }

        System.out.println("udało się zebrać "+ skarbonka);
    }
}
