package Smart;

import org.jetbrains.annotations.NotNull;

public class PinValidate {

    /**
     * Create a function that will test if a string is a valid PIN or not via a regular expression.
     * A valid PIN has:
     *  - - - Exactly 4 or 6 characters.
     *  - - - Only numeric characters (0-9).
     *  - - - No whitespace.
     *  Empty strings should return false when tested
     */

    public static boolean validate(@NotNull String pin) {
        char[] pinChars = pin.toCharArray();
        if (pinChars.length > 6 || pinChars.length < 4 || pinChars.length == 5)
            return false;
        for (char pinChar : pinChars) {
            if (pinChar == ' ')
                return false;
        }
            return pin.matches("\\d+");
    }
}
