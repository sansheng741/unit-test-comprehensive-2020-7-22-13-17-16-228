package example;

import java.util.*;
import static org.mockito.Mockito.*;
/**
 * @author ck
 * @create 2020-07-23 21:53
 */
public class Game {

    private List<String> guessResultList = new ArrayList<>();
//    private AnswerGenerator generateAnswer = new AnswerGenerator();
    private GuessNumber guessNumber = new GuessNumber();

    public void startGame() {

        AnswerGenerator generateAnswer = mock(AnswerGenerator.class);

        // stubbing appears before the actual execution
        when(generateAnswer.generateAnswer()).thenReturn(new int[]{1,2,3,4});
        int[] answer = generateAnswer.generateAnswer();

        GameProcess(answer);
    }

    private void GameProcess(int[] answer) {
        int opportunity = 6;

        for (int i = 0; i < opportunity; i++) {
            int[] input = getGuessInput();

            if (InputValidityCheck.check(input)) {
                String guessResult = guessNumber.getResult(input, answer);
                String allCorrect = "4A0B";
                if (allCorrect.equals(guessResult)) {
                    System.out.println("win, all correct");
                    break;
                }
                //打印信息
                printInfo(input, guessResult);
            } else {
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
        for (int num : input) {
            currentGuessInfo.append(num);
        }
        currentGuessInfo.append("         " + guessResult);
        guessResultList.add(currentGuessInfo.toString());
        System.out.println(currentGuessInfo);
    }

    private int[] getGuessInput() {
        Scanner sc = new Scanner(System.in);
        int inputLength = 4;
        int[] input = new int[inputLength];
        for (int i = 0; i < inputLength; i++) {
            input[i] = sc.nextInt();
        }
        return input;
    }


}
