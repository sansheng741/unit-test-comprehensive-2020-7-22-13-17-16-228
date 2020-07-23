package example;

/**
 * @author ck
 * @create 2020-07-23 21:13
 */
public class InputValidityCheck {

    public static boolean check(int[] input) {
        //判断四个数字是否各不相同
        if(!isNumberDifferent(input)){
            return false;
        }
        //判断是否越界
        for(int i = 0; i < input.length; i++){
            if(input[i] < 0 || input[i] > 9){
                return false;
            }
        }
        //是否是四个数字
        if(input.length != 4){
            return false;
        }
        return true;
    }

    public static boolean isNumberDifferent(int[] input){
        for (int i = 0; i < input.length; i++) {
            for(int j = i + 1; j < input.length; j++){
                if(input[i] == input[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
