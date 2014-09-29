/////////////////////////////////////////////////////////////////////////
//Veronica McKinny
//lab05
//Random Games Java Program
//
//  first, compile the program
//      javac RandomGames.java
//  then, run the program
//      java RandomGames
//
//  this program should, when user is prompted to choose
//  roulette, craps, or pick a card, output a reasonable
//  and, ultimately, random result for the game.

//  import Scanner
import java.util.Scanner;

//  declare class
public class RandomGames{
    
//  declare a main method
  public static void main(String args[]){
    
    //declare instance of scanner
    Scanner myScanner;
    //construct instance of scanner
    myScanner= new Scanner(System.in);
    
    //prompt user for input
    System.out.print("Enter R or r for Roulette, C " +
    "or c for craps, P or p for pick a card: ");
    //accept user input, if only one char
    String gameTest = myScanner.next();
    char game;
    int gameTestLength = gameTest.length();
    if (gameTestLength>=2){
        System.out.println("A single character "
        + "is expected.");
        return; //terminate, or leave, program
    }//end of if
    else{
        game = gameTest.charAt(0);
    }//end of else
    
    //determine what game, if any game, to select
    int roul = (int)(Math.random()*38); //define numbers for Roulette
    String roulLol = "lol"; //determine string for Roulette
    int dice1 = (int)(Math.random()*6) + 1; //define 1 dice roll
    int dice2 = (int)(Math.random()*6) + 1; //define other dice roll
    int diceTotal = dice1+dice2; //total of both dice rolls
    int card = (int)(Math.random()*13) + 1; //define card value for p
    int suit = (int)(Math.random()*4) + 1; //define suit for p
    String cardName = "joker";
    String suitName = "shovels";
    switch (game) {
        case 'R': case 'r': //Roulette
            switch (roul) {
                case 37: //set 37 to 00
                    roul = 0;
                    roulLol = "0" + Integer.toString(roul);
                    break;
                default:
                    roulLol = Integer.toString(roul);
                    break;
            }
            System.out.println("Roulette: " + roulLol);
            break;
        case 'C': case 'c': //Craps
            System.out.println("Craps: " + dice1+ "+" 
            + dice2 + "=" + diceTotal);
            break;
        case 'P': case 'p': //Picking a card
            switch (card) { //define special cards
                case 1:
                        cardName = "Ace";
                    break;
                case 11:
                    cardName = "Jack";
                    break;
                case 12:
                    cardName = "Queen";
                    break;
                case 13:
                    cardName = "King";
                    break;
                default:
                    cardName = Integer.toString(card);
                    break;
            }
            switch (suit) { //define suits
                case 1:
                    suitName = "hearts";
                    break;
                case 2:
                    suitName = "diamonds";
                    break;
                case 3:
                    suitName = "spades";
                    break;
                case 4:
                    suitName = "clubs";
                    break;
            }
            System.out.println(cardName + " of " 
            + suitName);
            break;
        default:
            System.out.println("\'" + game + "\'"
            + " is not one of \'R\', \'r\', \'C\'"
            + ", \'c\', \'P\', or \'p\'.");
            break;
    }
      
  }//end of main method
}//end of class