package example;

import java.util.Arrays;

/**
 * @author ck
 * @create 2020-07-23 19:57
 */
public class GuessNumber {

    public String getResult(int[] input, int[] answer) {
        int numbersAndPositionsAreCorrect = countNumbersAndPositionsAreCorrect(input, answer);
        int correctNumberAndIncorrectPosition = countCorrectNumberAndIncorrectPosition(input, answer);

        return formatResult(numbersAndPositionsAreCorrect, correctNumberAndIncorrectPosition);
    }

    private String formatResult(int numbersAndPositionsAreCorrect, int correctNumberAndIncorrectPosition) {
        return String.format("%dA%dB", numbersAndPositionsAreCorrect, correctNumberAndIncorrectPosition);
    }

    private int countCorrectNumberAndIncorrectPosition(int[] input, int[] answer) {
        int result = 0;
        for (int i = 0; i < answer.length; i++) {
            if (isArrContainElem(input, answer[i])) {
                result++;
            }
        }
        return result - countNumbersAndPositionsAreCorrect(input, answer);
    }

    private boolean isArrContainElem(int[] arr, int elem) {
        for (int e : arr) {
            if (e == elem) {
                return true;
            }
        }
        return false;
    }


    private int countNumbersAndPositionsAreCorrect(int[] input, int[] answer) {
        int result = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == input[i]) {
                result++;
            }
        }
        return result;
    }
}
