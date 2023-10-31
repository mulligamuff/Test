import java.util.Scanner;

public class ovnLektion4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        double numOne = Double.parseDouble(scan.nextLine());

        System.out.print("Enter your second number: ");
        double numTwo = Double.parseDouble(scan.nextLine());

        System.out.print("Enter your third number: ");
        double numThree = Double.parseDouble(scan.nextLine());

        double sum = numOne + numTwo + numThree;

        double avg = sum/3;

        System.out.println("Your total is: " + sum + " and your average is: " + avg);

    }
}
