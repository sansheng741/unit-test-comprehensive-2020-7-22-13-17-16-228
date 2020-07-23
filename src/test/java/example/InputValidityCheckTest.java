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
        int[] input = {1,2,3,4};
        //when
        boolean isLegal = InputValidityCheck.check(input);
        //then
        Assertions.assertEquals(true, isLegal);
    }

    @Test
    void should_return_false_when_check_given_12345(){
        //given
        int[] input = {1,2,3,4,5};
        //when
        boolean isLegal = InputValidityCheck.check(input);
        //then
        Assertions.assertEquals(false, isLegal);
    }

    @Test
    void should_return_false_when_check_given_number_less_than_0_and_more_than_9(){
        //given

        int[] input = {-1,2,3,4};
        //when
        boolean isLegal = InputValidityCheck.check(input);
        //then
        Assertions.assertEquals(false, isLegal);
    }

    @Test
    void should_return_false_when_check_given_number_1125(){
        //given

        int[] input = {1,1,2,5};
        //when
        boolean isLegal = InputValidityCheck.check(input);
        //then
        Assertions.assertEquals(false, isLegal);
    }
}
