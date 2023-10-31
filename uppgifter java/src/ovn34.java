import java.util.Scanner;

public class ovn34 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ange tecken (tryck * för att avsluta):");

        while (true) {
            char tecken = scan.next().charAt(0);

            if (tecken == '*') {
                System.out.println("Avslutar programmet.");
                break;
            } else {
                System.out.println("Du angav: " + tecken);
            }
        }

        scan.close();
    }

}
