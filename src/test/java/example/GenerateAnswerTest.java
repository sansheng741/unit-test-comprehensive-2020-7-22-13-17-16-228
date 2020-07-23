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

    @Test
    void should_generate_number_between_0_and_9_when_generate_given_GenerateAnswer() {
        //given
        GenerateAnswer generateAnswer = new GenerateAnswer();

        //when
        int[] answer = generateAnswer.generate();
        boolean isLegal = true;
        for(int i = 0; i < answer.length; i++){
            if(answer[i] < 0 || answer[i] > 9){
                isLegal = false;
                break;
            }
        }
        //then

        Assertions.assertEquals(true, isLegal);
    }

    @Test
    void should_generate_four_number_and_number_between_0_and_9_when_generate_given_GenerateAnswer() {
        //given
        GenerateAnswer generateAnswer = new GenerateAnswer();

        //when
        int[] answer = generateAnswer.generate();
        boolean isLegal = true;
        for(int i = 0; i < answer.length; i++){
            if(answer[i] < 0 || answer[i] > 9){
                isLegal = false;
                break;
            }
        }
        if(answer.length != 4){
            isLegal = false;
        }
        //then

        Assertions.assertEquals(true, isLegal);
    }
}
