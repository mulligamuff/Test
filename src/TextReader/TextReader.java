package TextReader;

import java.util.Scanner;

public class TextReader {
    public String readText() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder();

        System.out.println("Skriv in text. Skriv 'stop' för att avsluta.");

        String line;
        while (!(line = scanner.nextLine()).equalsIgnoreCase("stop")) {
            text.append(line).append("\n");
        }

        TextCounter textCounter = new TextCounter();
        textCounter.countLine(text.toString());

        return textCounter.toString();
    }

    public static void main(String[] args) {
        TextReader textReader = new TextReader();
        String result = textReader.readText();

        System.out.println(result);
    }
}