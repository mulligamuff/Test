package TDD;

import static org.junit.Assert.*;
import org.junit.Test;

public class PasswordValidatorTest {
    // Define the expected password as a static field
    private static String expectedPassword = "ValidP@ssw0rd";

    @Test
    public void testValidPassword() {
        PasswordValidator validator = new PasswordValidator(expectedPassword);
        assertTrue(validator.isValidPassword("ValidP@ssw0rd"));
    }

    @Test
    public void testShortPasswordIsInvalid() {
        PasswordValidator validator = new PasswordValidator(expectedPassword);
        assertFalse(validator.isValidPassword("Short1$"));
    }

    @Test
    public void testNoDigitIsInvalid() {
        PasswordValidator validator = new PasswordValidator(expectedPassword);
        assertFalse(validator.isValidPassword("NoDigit@Pass"));
    }

    @Test
    public void testNoSpecialCharIsInvalid() {
        PasswordValidator validator = new PasswordValidator(expectedPassword);
        assertFalse(validator.isValidPassword("NoSpecialChar123"));
    }

    @Test
    public void testValidPasswordWithSetPassword() {
        PasswordValidator validator = new PasswordValidator("D!nM4mm4");
        assertTrue(validator.isValidPassword("D!nM4mm4"));
    }

    @Test
    public void testInvalidPasswordWithSetPassword() {
        PasswordValidator validator = new PasswordValidator("D!nM4mm4");
        assertFalse(validator.isValidPassword("InvalidPassword"));
    }
}
