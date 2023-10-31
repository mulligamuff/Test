package TDD;

public class PasswordValidator {
    private String expectedPassword;

    public PasswordValidator(String expectedPassword) {
        this.expectedPassword = expectedPassword;
    }

    public boolean isValidPassword(String password) {
        if (password == null || expectedPassword == null) {
            return false;
        }

        if (password.length() < 8) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isDigit(c)) {
                hasDigit = true;
            }

            if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        return hasDigit && hasSpecialChar && expectedPassword.equals(password);
    }
}
