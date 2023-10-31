import java.util.Scanner;

public class playTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Hitta rätt Nummer

        int correctNumber = 42;
        int otherNumber = 2;
        int userNumber1;
        boolean isCorrect = false;

        System.out.println("Find the correct number, with a twist: ");

        do {
            System.out.println("\nEnter a number: ");
            userNumber1 = Integer.parseInt(scan.nextLine());

            int otherNumber2 = otherNumber * userNumber1;

            System.out.println("\nYour number has unfortunately been changed to the following: " + otherNumber2);

            if (otherNumber2 == correctNumber) {
                System.out.println("CONGRATULATIONS! You've found the number!");
                isCorrect= true;  // Detta stänger när korrekt nummer hittats

            } else if (otherNumber2 > correctNumber) {
                System.out.println(otherNumber2 + " is a Higher value than the target value ");
            } else {
                System.out.println(otherNumber2 + " is a Lower value than the target value ");
            }

        } while (!isCorrect);

            scan.close();

        }
    }