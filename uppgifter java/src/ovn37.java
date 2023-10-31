import java.util.Scanner;

public class ovn37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange antal tal du vill mata in: ");
        int angeTal = scanner.nextInt();

        // Skapa en array för att lagra talen
        int[] talLager = new int[angeTal];

        System.out.println("Ange " + angeTal + " tal:");

        for (int i = 0; i < angeTal; i++) {
            System.out.print("Tal " + (i + 1) + ": ");
            talLager[i] = scanner.nextInt();
        }

        System.out.println("Du har angett följande tal:");
        for (int i = 0; i < angeTal; i++) {
            System.out.println("Tal " + (i + 1) + ": " + talLager[i]);
        }

        scanner.close();
    }
}
