package example;


import java.util.stream.IntStream;

/**
 * @author ck
 * @create 2020-07-23 21:13
 */
public class InputValidityCheck {

    public static boolean check(int[] input) {
        if (!isInputLengthCorrect(input)) {
            return false;
        }
        if (!isNumberDifferent(input)) {
            return false;
        }
        if (isOutOfRange(input)) {
            return false;
        }
        return true;
    }

    private static boolean isInputLengthCorrect(int[] input) {
        int correctInputLength = 4;
        if (input.length == correctInputLength) {
            return true;
        }
        return false;
    }

    private static boolean isOutOfRange(int[] input) {
        for (int e : input) {
            if(e < 0 || e > 9){
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberDifferent(int[] input) {
        int afterWeightRemovalLength = (int) IntStream.of(input).distinct().count();
        if(afterWeightRemovalLength - input.length < 0){
            return false;
        }
        return true;
    }
}
