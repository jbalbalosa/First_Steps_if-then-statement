public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("First Steps: if-then-statement");

        boolean isAlien = false;
        if(!isAlien) { //Simplified from if(isAlien == false)
            System.out.println("It is not an alien!");
            System.out.println("And I am scrared of aliens");
        }
        else
            System.out.println("You're an alien");


        //Logical Operators
        int topScore = 101;
        if (topScore < 100){
            System.out.println("You got the high score!");
        }
        else
            System.out.println("You got the great score");

/*        int topScore = 90;
        if (topScore != 100){
            System.out.println("You didn't get the high score!");
        }*/

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

    }
}