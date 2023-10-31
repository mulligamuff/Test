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
public class TextCounter {
    public static void main(String[] args) {

        TextReader textReader = new TextReader();

        String inputText = textReader.readText();

        int countLine = 0;
        int addLine = 0;

        Scanner scan = new Scanner(inputText);

        while (scan.hasNextLine()) {

            String line = scan.nextLine();

            if (!line.equals("stop")) {
                countLine++;
                addLine += line.length();
            }
        }

        System.out.println("Följande antal tecken skrevs in: " + addLine);
        System.out.println("I såhär många omgångar: " + countLine);
    }
}
