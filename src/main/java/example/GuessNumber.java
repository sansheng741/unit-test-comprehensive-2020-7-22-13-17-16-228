package example;

import java.util.Arrays;

/**
 * @author ck
 * @create 2020-07-23 19:57
 */
public class GuessNumber {
    public String guess(int[] input, int[] answer) {

        int numberOfA = countA(input, answer);

        return String.format("%dA0B",numberOfA);
    }

    private int countA(int[] input,int[] answer) {
        int result = 0;
        for(int i = 0; i < answer.length; i++){
            if(answer[i] == input[i]){
                result++;
            }
        }
        return result;
    }
}
