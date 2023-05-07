public class PasswordPolicy {
    private static final int MIN_LENGTH = 8;
    private static final int MAX_LENGTH = 16;
    public boolean isValid(String password) {
        if (password == null || password.length() < MIN_LENGTH || password.length() > MAX_LENGTH) {
            return false;
        }
        boolean hasDigits = false;
        boolean hasSpecialCharacter = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigits = true;
            } else if (!Character.isLetter(c)) {
                hasSpecialCharacter = true;
            }
        }
        return hasDigits && hasSpecialCharacter;
    }

}
