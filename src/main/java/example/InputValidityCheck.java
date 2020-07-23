package example;

/**
 * @author ck
 * @create 2020-07-23 21:13
 */
public class InputValidityCheck {

    public static boolean check(int[] input) {
        boolean isLegal = true;
        for(int i = 0; i < input.length; i++){
            if(input[i] < 0 || input[i] > 9){
                isLegal = false;
                break;
            }
        }
        if(input.length != 4){
            isLegal = false;
        }
        return isLegal;
    }
}
