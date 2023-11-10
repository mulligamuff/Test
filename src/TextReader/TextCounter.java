package TextReader;

public class TextCounter {

    private int countLine = 0;
    private int characterCount = 0;

    public void countLine(String text) {
        String[] lines = text.split("\n");
        countLine = lines.length;

        for (String line : lines) {
            characterCount += line.length();
        }
    }

    public int getCountLine() {
        return countLine;
    }

    public int getCharacterCount() {
        return characterCount;
    }

    @Override
    public String toString() {
        return "Number of lines: " + countLine + "\nNumber of characters: " + characterCount;
    }
}