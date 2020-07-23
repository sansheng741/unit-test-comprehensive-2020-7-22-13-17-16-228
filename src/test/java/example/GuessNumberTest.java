package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author ck
 * @create 2020-07-23 19:32
 */
public class GuessNumberTest {

    @Test
    void should_return_4A0B_when_guess_given_answer_1234_input_1234() {

        //given
        GuessNumber guessNumber = new GuessNumber();
        int[] answer = {1,2,3,4};
        int[] input = {1,2,3,4};

        //when
        String result = guessNumber.guess(input,answer);

        //then
        Assertions.assertEquals("4A0B", result);
    }


    @Test
    void should_return_0A0B_when_guess_given_answer_1234_input_5678() {

        //given
        GuessNumber guessNumber = new GuessNumber();
        int[] answer = {1,2,3,4};
        int[] input = {5,6,7,8};

        //when
        String result = guessNumber.guess(input,answer);

        //then
        Assertions.assertEquals("0A0B", result);
    }

}
