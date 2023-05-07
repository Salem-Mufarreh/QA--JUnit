import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
@Nested
public class PasswordPolicyTest {


    @Test
    public void testIsValid() {
        PasswordPolicy policy = new PasswordPolicy();
        boolean result = policy.isValid("MyPassw0rd!");
        Assertions.assertTrue(result);
    }

    @Test
    public void testIsNotValidWithoutDigits() {
        PasswordPolicy policy = new PasswordPolicy();
        boolean result = policy.isValid("no_digits");
        Assertions.assertFalse(result);
    }

    @Test
    public void testIsNotValidWithoutSpecialCharacter() {
        PasswordPolicy policy = new PasswordPolicy();
        boolean result = policy.isValid("no_special_character");
        Assertions.assertFalse(result);
    }

    @Test
    public void testIsNotValidWithShortPassword() {
        PasswordPolicy policy = new PasswordPolicy();
        boolean result = policy.isValid("short");
        Assertions.assertFalse(result);
    }
    @Test
    @DisplayName("Null Value Test")
    public void testIsNotValidWithNullPassword() {
        PasswordPolicy policy = new PasswordPolicy();
        boolean result = policy.isValid(null);
        Assertions.assertFalse(result);
    }
    @Test
    void testIsNotValidWithLongPassword(){
        PasswordPolicy policy = new PasswordPolicy();
        boolean result = policy.isValid("VeryLongPasswordMorethan16");
        Assertions.assertFalse(result);
    }

}
