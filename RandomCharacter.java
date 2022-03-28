package CSC1009.wk09_lab;

import java.util.Random;

public class RandomCharacter {
    //Generate Random Lower Case Letter using the import random function
    public char getRandomLowerCaseLetter() {
        
        Random ran = new Random();
        return (char)('a' + ran.nextInt(26));
    }
    //Generate Random Upper Case Letter using the import random function
    public char getRandomUpperCaseLetter() {
        
        Random ran = new Random();
        return (char)('A' + ran.nextInt(26));
    }
    //Generate Random Digit Character using the import random function
    public int getRandomDigitCharacter() {
        
        Random ran = new Random();
        return ran.nextInt(0, 9);
    }
    //Generate Random Character using the import random function
    public char getRandomCharacter() {
        
        //Running the first random to choose between RandomUpperCase or RandomLowerCase Function.
        Random ran = new Random();
        int lowerCase = ran.nextInt(0,1);
        if( lowerCase == 0){
            return getRandomLowerCaseLetter();
        }
        else{
            return getRandomUpperCaseLetter();
        }
    }

}
