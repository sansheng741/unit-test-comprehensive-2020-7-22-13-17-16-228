package example;

import java.util.Arrays;

/**
 * @author ck
 * @create 2020-07-23 19:57
 */
public class GuessNumber {
    public String guess(int[] input, int[] answer) {
        if(Arrays.equals(input,answer)){
            return "4A0B";
        }
        return "0A0B";
    }
}
