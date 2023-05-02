import Smart.IntegerDigitsCount;
import Smart.PinValidate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestTraining {
    PinValidate pinValidate;
    IntegerDigitsCount integerDigitsCount;

    @Test
    public void pinValidateTest(){
        Assertions.assertTrue(PinValidate.validate("2334"));
    }

    @Test
    public void countTest() {
        Assertions.assertEquals(5,IntegerDigitsCount.count(2345));

    }
}
