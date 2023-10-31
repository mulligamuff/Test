import java.util.Scanner;

public class ovn1 {

    // Kvadratprogram

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ange ett tal: ");
            double tal = scanner.nextDouble();

            double kvadrat = tal * tal;

            System.out.println("Kvadraten av " + tal + " är " + kvadrat);

            scanner.close();
        }
    }
