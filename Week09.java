package CSC1009.wk09_lab;

public class Week09 {
    public void wk09_question1(){
        
        RandomCharacter rc = new RandomCharacter();
        //Running getRandomLowerCaseLetter Function and printing out the output.
        char randomLowerCaseLetter = rc.getRandomLowerCaseLetter();
        System.out.println("The random lower case letter generated is: "+ randomLowerCaseLetter);
        //Running getRandomUpperCaseLetter Function and printing out the output.
        char randomUpperCaseLetter = rc.getRandomUpperCaseLetter();
        System.out.println("The random upper case letter generated is: "+ randomUpperCaseLetter);
        //Running getRandomDigitCharacter Function and printing out the output.
        int randomDigitCharacter = rc.getRandomDigitCharacter();
        System.out.println("The random digit character generated is: "+ randomDigitCharacter);
        //Running getRandomCharacter Function and printing out the output.
        char randomCharacter = rc.getRandomCharacter();
        System.out.println("The random character generated is: "+ randomCharacter);
    }

}
