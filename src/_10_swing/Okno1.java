package _10_swing;

import javax.swing.*;
import java.awt.*;

public class Okno1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame(); //utworzenie nowego okienka
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// by po zamknięciu okna program się zakończył
        frame.setSize(600,400);// definicja rozmiaru okna
        frame.setTitle("Tytuł okna"); // tytuł okna

        JLabel label = new JLabel("Ala ma kota"); //stworzenie labelu z tekstem ...
        label.setHorizontalAlignment(SwingConstants.CENTER); // wyśrodkowanie tekstu
        label.setFont(new Font("Arial",Font.BOLD, 40)); //cuda na kiju trzeba dodać nowy obiekt czcionka i podać atrybuty,
                                                                   // nazwa czcionki z systemu
        label.setForeground(Color.RED); // zmiana koloru czcionki
        //1 Color kolorTla = Color.BLUE; //zdefiniowanie nowego koloru z gotowej stałej
        //2 Color kolorTla = new Color(1.0f, 1.0f, 0,5f); podać wartości rgb z zakresu 0 -1
        //3 Color kolorTla = new Color(255, 255, 150); podać wartości rgb z zakresu 0 255
        //4 system 16stkowy po 2 cyfry na kolor
        Color kolorTla = new Color(0xFFFFA0);

        label.setOpaque(true);
        label.setBackground(kolorTla);

        frame.add(label); // dodoanie label do okna

        frame.setVisible(true); // sprawienie że okienko jest widoczne

    }
}
