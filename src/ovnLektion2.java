import java.util.Scanner;

public class ovnLektion2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ange Namn: ");
        String nameStudent = scan.nextLine();

        System.out.print("Ange Ålder: ");
        int ageStudent = scan.nextInt();
        scan.nextLine(); // Läs in radslut efter nästa int

        System.out.print("Ange Hemort: ");
        String locationStudent = scan.nextLine();

        System.out.print("Ange Favoritband: ");
        String favbandStudent = scan.nextLine();

        // Skriv ut informationen
        System.out.println("\nPersonlig information:");
        System.out.println("Namn: " + nameStudent);
        System.out.println("Ålder: " + ageStudent);
        System.out.println("Hemort: " + locationStudent);
        System.out.println("Favoritband: " + favbandStudent);

        // Stäng scanner när du är klar med den
        scan.close();
    }
}
