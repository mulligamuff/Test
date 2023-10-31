package CalculatorTest;

public class Kalkylator {

    public double addera(double tal1, double tal2) {
        return tal1 + tal2;
    }

    public double subtrahera(double tal1, double tal2) {
        return tal1 - tal2;
    }

    public double multiplicera(double tal1, double tal2) {
        return tal1 * tal2;
    }

    public double dividera(double tal1, double tal2) {
        if (tal2 != 0) {
            return tal1 / tal2;
        } else {
            System.out.println("Fel: Kan inte dela med noll.");
            return Double.NaN; // Returnera ett felvärde
        }
    }

}
