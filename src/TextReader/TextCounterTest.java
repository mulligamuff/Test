package TextReader;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class TextCounterTest {

    public static class TextCounterUnitTest {
        @Test
        public void testLineCount() {
            TextCounter textCounter = new TextCounter();
            textCounter.countLine("Line 1");
            textCounter.countLine("Line 2");
            textCounter.countLine("Line 3");
            assertEquals(3, textCounter.countLine(3));
        }

        @Test
        public void testCharacterCount() {
            TextCounter textCounter = new TextCounter();
            textCounter.addLine("This is a test.");
            assertEquals(15, textCounter.countLine());
        }
    }

    public static class TextReaderAndCounterIntegrationTest {
        @Test
        public void testIntegration() {
            TextReader textReader = new TextReader();
            String input = "This is a test.\nSecond line.\nstop";
            String inputText = textReader.addLine();

            TextCounter textCounter = new TextCounter();
            int lineCount = textCounter.countLines(inputText);
            int characterCount = textCounter.countLine(inputText);

            assertEquals(2, lineCount);
            assertEquals(30, characterCount);
        }
    }
}
