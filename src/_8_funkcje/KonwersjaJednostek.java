package _8_funkcje;

public class KonwersjaJednostek {
    public static final double mila = 1.609344;
    public static final int stopnie = 32;
    public static final double zmiennastatyczna = 1.8;


    //mile na km 1,6

    public static double kmtoml(double km) {
        return km / mila;

    }

    //km na mile
    public static double mltokm(double ml) {
        return ml * mila;

    }

    public static double frtoc(double fr) {
        return (fr - stopnie) / zmiennastatyczna;

    }

    public static double ctofr(double c) {
        return (c * zmiennastatyczna) + stopnie;


        //Far - C

    }
}