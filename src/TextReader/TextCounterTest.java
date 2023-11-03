package TextReader;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

@RunWith(Enclosed.class)
public class TextCounterTest {

    public static class TextCounterUnitTest {
        @Test
        public void testLineCount() {
            TextCounter textCounter = new TextCounter();
            textCounter.countLine("Line 1");
            textCounter.countLine("Line 2");
            textCounter.countLine("Line 3");
            assertEquals(3, textCounter.getLineCount());
        }

        @Test
        public void testCharacterCount() {
            TextCounter textCounter = new TextCounter();
            textCounter.countLine("This is a test.");
            assertEquals(15, textCounter.getCharacterCount());
        }
    }

    public static class TextReaderAndCounterIntegrationTest {
        @Test
        public void testIntegration() {

            String input = "This is a test.\nSecond line.\nstop";
            ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
            System.setIn(inputStream);

            TextReader textReader = new TextReader();
            String inputText = textReader.readText();

            TextCounter textCounter = new TextCounter();
            Scanner scanner = new Scanner(inputText);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                textCounter.countLine(line);
            }

            assertEquals(2, textCounter.getLineCount());
            assertEquals(30, textCounter.getCharacterCount());

            // Actual är 27

            System.setIn(System.in);
        }
    }
}
