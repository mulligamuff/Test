package CalculatorTest;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkylator kalkylator = new Kalkylator();

        while (true) {
            System.out.print("Kalkylatorn är igång, \n Ange ett tal: ");
            double tal1 = scanner.nextDouble();

            System.out.print("Kalkylatorn är igång Du kan använda följande räknesätt: (+, -, *, /) eller x för att avsluta: ");
            String operator = scanner.next();

            if (operator.equals("x")) {
                System.out.println("Kalkylatorn stängs av.");
                break;
            }

            System.out.print("Ange ett till tal: ");
            double tal2 = scanner.nextDouble();

            double resultat = 0.0;

            switch (operator) {
                case "+":
                    resultat = kalkylator.addera(tal1, tal2);
                    break;
                case "-":
                    resultat = kalkylator.subtrahera(tal1, tal2);
                    break;
                case "*":
                    resultat = kalkylator.multiplicera(tal1, tal2);
                    break;
                case "/":
                    resultat = kalkylator.dividera(tal1, tal2);
                    break;
                default:
                    System.out.println("Fel: Ogiltig operator.");
                    continue;
            }

            System.out.println("Resultat: " + resultat);
        }

        scanner.close();
    }

}
