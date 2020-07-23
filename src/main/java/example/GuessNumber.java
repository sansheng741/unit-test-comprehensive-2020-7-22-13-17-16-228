package example;

import java.util.Arrays;

/**
 * @author ck
 * @create 2020-07-23 19:57
 */
public class GuessNumber {


    public String guess(int[] input, int[] answer) {

        int numberOfA = countA(input, answer);
        int numberOfB = countB(input, answer);
        return String.format("%dA%dB",numberOfA,numberOfB);
    }

    private int countB(int[] input, int[] answer) {
        int result = 0;
        for(int i = 0; i < answer.length; i++){
            if(isContain(input,answer[i])){
                result++;
            }
        }
        return result - countA(input,answer);
    }

    private boolean isContain(int[] input, int i) {
        for (int number : input) {
            if(number == i){
                return true;
            }
        }
        return false;
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
