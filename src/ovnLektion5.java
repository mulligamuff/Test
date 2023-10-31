import java.util.Scanner;

public class ovnLektion5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skrriv in antal kronor du vill omvandla till Pund och Dollar: ");
        double antalKrona = Double.parseDouble(scan.nextLine());
        double antalPund = antalKrona / 10;
        double antalDollar = antalKrona / 6;

        System.out.println(antalKrona + "kr blir");
        System.out.println("I Pund: " + antalPund);
        System.out.println("I Dollar: " + antalDollar);

    }
}
