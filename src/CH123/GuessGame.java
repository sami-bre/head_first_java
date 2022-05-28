/*
*   THIS IS HOW A REAL O.O STYLE JAVA PROGRAM LOOKS LIKE. IT'S A COLLECTION OF OBJECTS
*   THESE OBJECTS INTERACT WITH EACH OTHER.
* */
package CH123;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int targetNumber = (int) (Math.random()*10);

        System.out.println("I'm thinking of a number between 0 and 9... ");

        while(true){
            System.out.println("The number to guess is " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            guessp2 = p2.number;
            guessp3 = p3.number;

            if(guessp1 == targetNumber){
                p1IsRight = true;
            } else if(guessp2 == targetNumber){
                p2IsRight = true;
            } else if(guessp3 == targetNumber){
                p3IsRight = true;
            }

            if (p1IsRight || p2IsRight || p3IsRight){
                System.out.println("We have a winner!");
                System.out.println("CH123.Player 1 got it right? " + p1IsRight);
                System.out.println("CH123.Player 2 got it right? " + p2IsRight);
                System.out.println("player 3 got it right? " + p3IsRight);
                break;
            } else {
                System.out.println("Players will have to try again.");
            }

        }
    }
}

class Player{
    int number = 0; // where the guess goes
    public void guess(){
        number = (int) (Math.random()*10);
        System.out.println("I'm guessing " + number);
    }
}

class GameLauncher {
    public static void main(String[] args){
        GuessGame game = new GuessGame();
        game.startGame();
    }
}