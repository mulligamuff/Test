import java.util.Scanner;

public class ovnLektion3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ange ditt namn: ");
        String nameUser = scan.nextLine();

        System.out.println("Hur mycket pengar har du?");
        int currentMoney = Integer.parseInt(scan.nextLine());

        for (int startCount = 1; startCount <= currentMoney; startCount++) {
            System.out.println(nameUser + " har räknat till: " + startCount);
        }
    }
}
