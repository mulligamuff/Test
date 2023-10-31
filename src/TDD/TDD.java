package TDD;

import java.util.Scanner;

public class TDD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange ett lösenord som uppfyller följande krav:\n");
        System.out.println("- Minst 8 tecken");
        System.out.println("- Minst 1 siffra");
        System.out.println("- Minst 1 specialtecken");

        String expectedPassword = scanner.nextLine();
        PasswordValidator passwordValidator = new PasswordValidator(expectedPassword);

        while (true) {

            String password = scanner.nextLine();

            if (passwordValidator.isValidPassword(password)) {
                System.out.println("Lösenordet är giltigt!");
                break;
            } else {
                System.out.println("Lösenordet uppfyller inte kraven eller matchar inte det förväntade lösenordet. Försök igen.");
            }
        }

        scanner.close();
    }
}
