package _11_zadanie_petle;

public class Zadanie2 {

    private void tabliczkaMnozenia(int n) {
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=n; j++)
            {
                System.out. printf("%d\t",i*j);
            }
            System.out.println() ;
        }
    }
    public static void main(String [] args){
        Zadanie2 t = new Zadanie2 ();
        t.tabliczkaMnozenia(10);
    }
}


