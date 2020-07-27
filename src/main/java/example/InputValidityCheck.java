package example;

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
        if (input.length == 4) {
            return true;
        }
        return false;
    }

    private static boolean isOutOfRange(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0 || input[i] > 9) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberDifferent(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == input[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
