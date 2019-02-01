package _11_zadanie_petle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Zadanie3 {

    public static void main(String[] args) {

        String odpowiedz=JOptionPane.showInputDialog("Twój ulubiony język programowania?");


        while(!odpowiedz.equals("Java")){

            JOptionPane.showMessageDialog(null,"Spróbuj ponownie, Twój ulubiony język programowania?");
            String odpowiedz2=JOptionPane.showInputDialog("Twój ulubiony język programowania?");


            if (odpowiedz2.equals("Java") || odpowiedz.equals("Java"))

                JOptionPane.showMessageDialog(null,"Super!");
                System.exit(0);


        }
        JOptionPane.showMessageDialog(null,"Super!");
        System.exit(0);

    }


}
