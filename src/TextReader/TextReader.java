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

        return text.toString();
    }
}

    // De skulle vara i sepparata classer, vilket den typ är, men detta är endast ett "Tekniskt fel".

class TextCounter {

    private int lineCount = 0;
    private int characterCount = 0;
    public void countLine(String line) {
        lineCount++;
        characterCount += line.length();
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getCharacterCount() {
        return characterCount;
    }
}
