package MCC;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals("Invalid Morse Code", MorseCodeConverter.morseToEnglish(".... . .-.. .-.. --- @@@@"));
    }

    @Test
    public void testInvalidEnglishCharacter() {
        assertEquals("Invalid English Character", MorseCodeConverter.englishToMorse("ä"));
    }

    @Test
    public void testMorseWithExtraSpaces() {
        assertEquals("HELLO WORLD", MorseCodeConverter.morseToEnglish("....  . .-.. .-.. ---   .-- --- .-. .-.. -.."));
    }

}
