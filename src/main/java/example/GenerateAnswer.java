package example;

import java.util.Random;

/**
 * @author ck
 * @create 2020-07-23 20:49
 */
public class GenerateAnswer {
    public int[] generate() {
        Random random = new Random();
        int[] answer = new int[4];
        for(int i = 0; i < 4; i++){
            answer[i] = random.nextInt(10);
        }
        return answer;
    }
}
