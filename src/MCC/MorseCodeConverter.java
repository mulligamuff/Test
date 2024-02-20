package MCC;

import java.util.HashMap;

public class MorseCodeConverter {
    private static final HashMap<String, String> morseToEnglish = new HashMap<>();
    private static final HashMap<String, String> englishToMorse = new HashMap<>();

    static {
        morseToEnglish.put(".-", "A");
        morseToEnglish.put("-...", "B");
        morseToEnglish.put("-.-.", "C");
        morseToEnglish.put("-..", "D");
        morseToEnglish.put(".", "E");
        morseToEnglish.put("..-.", "F");
        morseToEnglish.put("--.", "G");
        morseToEnglish.put("....", "H");
        morseToEnglish.put("..", "I");
        morseToEnglish.put(".---", "J");
        morseToEnglish.put("-.-", "K");
        morseToEnglish.put(".-..", "L");
        morseToEnglish.put("--", "M");
        morseToEnglish.put("-.", "N");
        morseToEnglish.put("---", "O");
        morseToEnglish.put(".--.", "P");
        morseToEnglish.put("--.-", "Q");
        morseToEnglish.put(".-.", "R");
        morseToEnglish.put("...", "S");
        morseToEnglish.put("-", "T");
        morseToEnglish.put("..-", "U");
        morseToEnglish.put("...-", "V");
        morseToEnglish.put(".--", "W");
        morseToEnglish.put("-..-", "X");
        morseToEnglish.put("-.--", "Y");
        morseToEnglish.put("--..", "Z");
        morseToEnglish.put(".----", "1");
        morseToEnglish.put("..---", "2");
        morseToEnglish.put("...--", "3");
        morseToEnglish.put("....-", "4");
        morseToEnglish.put(".....", "5");
        morseToEnglish.put("-....", "6");
        morseToEnglish.put("--...", "7");
        morseToEnglish.put("---..", "8");
        morseToEnglish.put("----.", "9");
        morseToEnglish.put("-----", "0");
        morseToEnglish.put(".-.-.-", ".");
        morseToEnglish.put("--..--", ",");
        morseToEnglish.put("..--..", "?");

        for (String key : morseToEnglish.keySet()) {
            String value = morseToEnglish.get(key);
            englishToMorse.put(value, key);
        }
    }

    public static String morseToEnglish(String morse) {
        StringBuilder english = new StringBuilder();
        String[] words = morse.split("   ");
        for (String word : words) {
            String[] letters = word.split(" ");
            for (String letter : letters) {
                String englishLetter = morseToEnglish.get(letter);
                if (englishLetter != null) {
                    english.append(englishLetter);
                } else {

                    return "Invalid Morse Code";
                }
            }
            english.append(" ");
        }
        return english.toString().trim();
    }

    public static String englishToMorse(String english) {
        StringBuilder morse = new StringBuilder();
        for (char c : english.toUpperCase().toCharArray()) {
            if (Character.isWhitespace(c)) {
                morse.append("   ");
            } else {
                String morseCode = englishToMorse.get(String.valueOf(c));
                if (morseCode != null) {
                    morse.append(morseCode).append(" ");
                } else {
                    return "Invalid English Character";
                }
            }
        }
        return morse.toString().trim();
    }

}
