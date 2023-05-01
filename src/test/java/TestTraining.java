import Smart.PinValidate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;

public class TestTraining {
    PinValidate pinValidate;

    @Test
    public void pinValidateTest(){
        Assertions.assertTrue(PinValidate.validate("2334"));

    }
}
