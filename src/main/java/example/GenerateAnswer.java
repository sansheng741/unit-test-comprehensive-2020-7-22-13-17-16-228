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
            int number = 0;
            do{
                number = random.nextInt(10);
            }while(isContain(answer,number));
            answer[i] = number;
        }
        return answer;
    }

    private boolean isContain(int[] input, int i) {
        for (int number : input) {
            if(number == i){
                return true;
            }
        }
        return false;
    }
}
