import java.util.Scanner;

public class ovn2 {

    // Löne Kalkylatorn

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Grundlön
            double grundlon = 8000;

            System.out.print("Ange försäljningssumman: ");
            double extraLon = scanner.nextDouble();

            // Provisionsandel (9%)
            double provisionAndel = 0.09;

            // Beräkna provisionen
            double provision = extraLon * provisionAndel;

            // Beräkna total lön
            double totalLon = grundlon + provision;

            System.out.println("Grundlön: " + grundlon + " kr");
            System.out.println("Provision (9% av försäljningssumman): " + provision + " kr");
            System.out.println("Total lön: " + totalLon + " kr");

            scanner.close();
        }
    }