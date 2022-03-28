package CSC1009.wk09_lab;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.beans.Transient;

import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;

public class RandomCharacterTest {
    
    RandomCharacter rc = new RandomCharacter();

    //Repeat the test unit for getRandomLowerCaseLetter by 15 times
    @RepeatedTest(value = 15)
    public void testGetRandomLowerCaseLetter(){
        int asciival = rc.getRandomLowerCaseLetter();
        assertTrue(asciival>=97 && asciival <= 122);

    }

    //Repeat the test unit for getRandomUpperCaseLetter by 15 times
    @RepeatedTest(value = 15)
    public void testGetRandomUpperCaseLetter(){
        int asciival = rc.getRandomUpperCaseLetter();
        assertTrue(asciival>=65 && asciival <= 90);
    }

    //Repeat the test unit for getRandomDigitCharacter by 15 times
    @RepeatedTest(value = 15)
    public void testGetRandomDigitCharacter(){
        int asciival = rc.getRandomDigitCharacter();
        assertTrue(asciival>=0 && asciival <= 9);
    }

    //Repeat the test unit for getRandomCharacter by 15 times
    @RepeatedTest(value = 15)
    public void testGetRandomCharacter(){
        int asciival = rc.getRandomCharacter();
        assertTrue(asciival>=97 && asciival <= 122 || asciival>=65 && asciival <= 90);
    }

    //Test on the getRandomDigitCharacter generated isPrime or not
    @Test
    public void isPrime(){
        int intval = rc.getRandomDigitCharacter();
        boolean isPrime = true;
        //i start at 2 because 0 and 1 is not a prime number
        for (int i=2; i<intval; i++){
            //if number is divisble, the number will not be a prime number
            if (intval % i ==0){
                isPrime = false;
                //check if isPrime is true for false
                assertTrue(isPrime);
                return;
            }
        }
        //check if isPrime is true for true
        assertTrue(isPrime);
    }
}
