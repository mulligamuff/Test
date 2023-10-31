import java.util.Scanner;

public class ovn29 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ange avgångstid (timme minut): ");
        int avgångTimme = scan.nextInt();
        int avgångMinut = scan.nextInt();

        System.out.print("Ange körtid (timme minut): ");
        int körtidTimme = scan.nextInt();
        int körtidMinut = scan.nextInt();

        int ankomstTimme = avgångTimme + körtidTimme;
        int ankomstMinut = avgångMinut + körtidMinut;

        if (ankomstMinut >= 60) {
            ankomstTimme++;
            ankomstMinut -= 60;
        }

        if (ankomstTimme >= 24) {
            System.out.println("NÄSTA DAG");
            ankomstTimme -= 24;
        }

        System.out.println("Ankomsttid: " + ankomstTimme + " " + ankomstMinut);

        scan.close();
    }
}

