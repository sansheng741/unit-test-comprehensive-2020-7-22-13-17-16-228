package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author ck
 * @create 2020-07-23 21:53
 */
public class GameFlow {
    Scanner sc = new Scanner(System.in);
    List<String> guessResultList = new ArrayList<>();

    public void startGame(){

        //游戏一开始，生成答案
        GenerateAnswer generateAnswer = new GenerateAnswer();
        int[] answer = generateAnswer.generate();
        //玩家通过控制台输入猜测
        GuessNumber guessNumber = new GuessNumber();
        for(int i = 0; i < 6; i++){
            int[] input = getGuessInput();
            boolean check = InputValidityCheck.check(input);
            if(check){
                String guessResult = guessNumber.getResult(input, answer);
                if("4A0B".equals(guessResult)){
                    System.out.println("win, all correct");
                    break;
                }
                //打印信息
                printInfo(input,guessResult);
            }else{
                System.out.println("Wrong Input，Input again");
            }
        }
    }

    private void printInfo(int[] input, String guessResult) {
        System.out.println("Input　　    Output             Instruction");
        for (String s : guessResultList) {
            System.out.println(s);
        }
        StringBuffer currentGuessInfo = new StringBuffer();
        for (int i = 0; i < input.length; i++) {
            currentGuessInfo.append(input[i]);
        }
        currentGuessInfo.append("         "+guessResult);
        guessResultList.add(currentGuessInfo.toString());
        System.out.println(currentGuessInfo);
    }

    private int[] getGuessInput() {
        int[] input = new int[4];
        for (int i = 0; i < 4; i++) {
            input[i] = sc.nextInt();
        }
        return input;
    }


}
