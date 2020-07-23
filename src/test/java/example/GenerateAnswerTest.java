package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author ck
 * @create 2020-07-23 20:38
 */
public class GenerateAnswerTest {

    @Test
    void should_generate_four_number_when_generate_given_GenerateAnswer() {
        //given
        GenerateAnswer generateAnswer = new GenerateAnswer();

        //when
        int[] answer = generateAnswer.generate();

        //then
        Assertions.assertEquals(4, answer.length);
    }
}
