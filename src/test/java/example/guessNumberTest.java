package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class guessNumberTest {
    @Test
    void should_return_4A0B_when_guess_given_answer_1234_and_input_guess_1234() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        AnswerGenerator answerGenerator = new TestAnswerGenerator();
        int[] guessNum = {1,2,3,4};
        int[] answer = {1,2,3,4};

        //when
        String result = guessNumber.guess(guessNum, answerGenerator.answerNumber());

        //then
        assertEquals("4A0B",result);
    }

    @Test
    void should_return_0A0B_when_guess_given_answer_1234_and_input_guess_5678() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        int[] guessNum = {5,6,7,8};
        int[] answer = {1,2,3,4};

        //when
        String result = guessNumber.guess(guessNum, answer);

        //then
        assertEquals("0A0B", result);
    }

    @Test
    void should_return_0A4B_when_guess_given_answer_1234_and_input_guess_4312() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        int[] guessNum = {4,3,1,2};
        int[] answer = {1,2,3,4};

        //when
        String result = guessNumber.guess(guessNum, answer);

        //then
        assertEquals("0A4B", result);
    }

    @Test
    void should_return_0A2B_when_guess_given_answer_1234_and_guess_3456() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        int[] guessNum = {3,4,5,6};
        int[] answer = {1,2,3,4};

        //when
        String result = guessNumber.guess(guessNum, answer);

        //then
        assertEquals("0A2B", result);
    }

    @Test
    void should_return_false_when_judge_guess_number_legal_given_input_number_12345() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        int[] guessNum = {1,2,3,4,5};

        //when
        boolean result = guessNumber.isLegalGuessNum(guessNum);

        //then
        assertEquals(false, result);
    }

    @Test
    void should_return_true_when_judge_guess_number_legal_given_input_number_1234() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        int[] guessNum = {1,2,3,4};

        //when
        boolean result = guessNumber.isLegalGuessNum(guessNum);

        //then
        assertEquals(true, result);
    }
}
