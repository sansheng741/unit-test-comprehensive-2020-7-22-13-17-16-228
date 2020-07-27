package example;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author ck
 * @create 2020-07-23 20:49
 */
public class GenerateAnswer {
    public int[] generate() {
        int[] randomArr = getArrZeroToNine();
        int[] answer = new int[4];
        Collections.shuffle(Arrays.asList(randomArr));
        System.arraycopy(randomArr, 0, answer, 0, 4);
        return answer;
    }

    private int[] getArrZeroToNine() {
        int[] randomArr = new int[10];
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = i;
        }
        return randomArr;
    }

}
