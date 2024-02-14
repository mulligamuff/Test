package MCC;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Morse Code Converter!");

        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Morse to English");
            System.out.println("2. English to Morse");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character after nextInt()

            switch (choice) {
                case 1:
                    System.out.println("Enter Morse code:");
                    String morseInput = scanner.nextLine();
                    System.out.println("English: " + MorseCodeConverter.morseToEnglish(morseInput));
                    break;
                case 2:
                    System.out.println("Enter English text:");
                    String englishInput = scanner.nextLine();
                    System.out.println("Morse Code: " + MorseCodeConverter.englishToMorse(englishInput));
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
