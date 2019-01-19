package _8_funkcje;

public class TestowanieFunkcji {
    public static void main(String[] args) {
        double[] liczby ={0, 5, 1.5, -1, 10};  //stwórz tablice liczby z konkretnymi liczbami
        for (double liczba :liczby){      // dla każdej z pozycji z tablicy wykonaj pętlę zastępując zmienną liczba pozycją z tablicy
            double kwadrat = FunkcjeGeometryczne.poleKwadratu(liczba); // oblicz pole kwadratu z funkcji
            double kolo= FunkcjeGeometryczne.poleKola(liczba); // oblicz pole kola z funkcji

            System.out.println("Dla liczby" + liczba + "pole kwadratu wynosi " + kwadrat + ", a pole koła " + kolo);
        }

    }
}
