package example;

/**
 * @author ck
 * @create 2020-07-23 21:13
 */
public class InputValidityCheck {

    public static boolean check(int[] input) {
        if(!isNumberDifferent(input)){
            return false;
        }
        for(int i = 0; i < input.length; i++){
            if(input[i] < 0 || input[i] > 9){
                return false;
            }
        }
        if(input.length != 4){
            return false;
        }
        return true;
    }

    private static boolean isNumberDifferent(int[] input){
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
