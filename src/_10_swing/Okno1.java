package _10_swing;

import javax.swing.*;

public class Okno1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame(); //utworzenie nowego okienka
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// by po zamknięciu okna program się zakończył
        frame.setSize(600,400);// definicja rozmiaru okna
        frame.setTitle("Tytuł okna"); // tytuł okna

        JLabel label = new JLabel("Ala ma kota"); //stworzenie labelu z tekstem ...
        frame.add(label); // dodoanie label do okna

        frame.setVisible(true); // sprawienie że okienko jest widoczne

    }
}
