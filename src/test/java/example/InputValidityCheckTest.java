package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author ck
 * @create 2020-07-23 21:10
 */
public class InputValidityCheckTest {

    @Test
    void should_return_true_when_check_given_1234() {
        //given
        InputValidityCheck inputValidityCheck = new InputValidityCheck();
        int[] input = {1,2,3,4};
        //when
        boolean isLegal = inputValidityCheck.check(input);
        //then
        Assertions.assertEquals(true, isLegal);
    }
}
