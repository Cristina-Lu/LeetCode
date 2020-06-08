package test.java.medium;

import main.java.medium.Problem17LetterCombinationsOfAPhoneNumber;
import org.junit.Test;

public class Problem17LetterCombinationsOfAPhoneNumberTest {
    @Test
    public void test(){
        Problem17LetterCombinationsOfAPhoneNumber problem17LetterCombinationsOfAPhoneNumber
                =new Problem17LetterCombinationsOfAPhoneNumber();
        System.out.println(problem17LetterCombinationsOfAPhoneNumber.letterCombinations("23"));
    }
}
