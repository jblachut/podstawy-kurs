package _8_funkcje;
// dzięki importowi można bezpośednio w kodzie użyć samej nazwy metody po zaimportowaniu klas
import static _8_funkcje.FunkcjeGeometryczne.poleKola;
import static _8_funkcje.FunkcjeGeometryczne.poleKwadratu;

public class TestowanieFunkcji2 {
    public static void main(String[] args) {

        System.out.println("pole kwadratu o boku 2 wynosi " + poleKwadratu(2));
        System.out.println("pole kola o boku 2 wynosi " + poleKola(2));

    }
}
