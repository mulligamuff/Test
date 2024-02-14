package MCC;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MorseCodeConverterTest {

    @Test
    public void testMorseToEnglish() {
        assertEquals("HELLO WORLD", MorseCodeConverter.morseToEnglish(".... . .-.. .-.. ---   .-- --- .-. .-.. -.."));
    }

    @Test
    public void testEnglishToMorse() {
        assertEquals(".... . .-.. .-.. ---   .-- --- .-. .-.. -..", MorseCodeConverter.englishToMorse("hello world"));
    }

    @Test
    public void testInvalidMorseCharacter() {
        assertEquals("", MorseCodeConverter.morseToEnglish(".... . .-.. .-.. --- @@@@"));
    }

    @Test
    public void testInvalidEnglishCharacter() {
        assertEquals("", MorseCodeConverter.englishToMorse("ä"));
    }
}
