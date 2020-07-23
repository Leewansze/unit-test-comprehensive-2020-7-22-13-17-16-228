package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuessNumber {
    public String guess(int[] guessNum, int[] answer) {
        int answerIndex;
        int guessIndex;
        int countA = 0;
        int countB = 0;
        String result;
        List<Integer> answerList = new ArrayList<>();
        List<Integer> guessList = new ArrayList<>();
        for(int i = 0; i< answer.length; i++){
            answerList.add(answer[i]);
        }
        for(int i = 0; i< guessNum.length; i++){
            guessList.add(guessNum[i]);
        }

        for(int i = 0; i < guessNum.length; i++){
            if(answerList.contains(guessList.get(i))){
                answerIndex = answerList.indexOf(answerList.get(i));
                guessIndex = guessList.indexOf(guessList.get(i));
                if(answerIndex == guessIndex){
                    countA++;
                }else{
                    countB++;
                }
            }
        }
        result = String.format("%dA%dB", countA, countB);
        return result;
    }

    public boolean isLegalGuessNum(int[] number){
        if(number.length != 4){
            return false;
        }
        for(int index = 0; index < number.length; index++){
            if(number[index] < 0 || number[index] > 9){
                return false;
            }
        }
        return true;
    }

    public int[] inputFromScreen(){
        int inputGuessNumber[] = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < inputGuessNumber.length; i++){
            inputGuessNumber[i] = sc.nextInt();
        }
        return inputGuessNumber;
    }

    public static void main(String[] args) {
        GuessNumber gn = new GuessNumber();
        int arr[] = gn.inputFromScreen();
        gn.isLegalGuessNum(arr);

    }
}
