/////////////////////////////////////////////////////////////////
//Veronica McKinny
//hw10
//Poker Odds Java Program
//
//  This program should simulate what cards might be drawn in
//  one hand of poker, and then proceed to calculate the results
//  of pairs of ranks over 10,000 turns.

//  import Random
import java.util.Random;

//  import Scanner
import java.util.Scanner;

//  declare class
public class PokerOdds{

//  declare main method
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }//end of main method
  
//  declare method showHands
  public static void showHands(){
    //declare and construct instance of Scanner
    Scanner myScanner = new Scanner(System.in);
    //declare and initialize arrays for both deck and hand
    int[] deck = new int[52];
    int[] hand = new int[5];
    //declare int to use for loops
    int i = 0;
    //declare string to test for user input on whether or not to continue
    String userContinue = "";
    do{
        for(i = 0; i<52; i++){
            deck[i] = i; //set each spot in the deck array to a card placeholder
        }
        for(i = 0; i<5; i++){
            hand[i] = -1; //set each spot in the hand to -1 (mathematical placeholder)
        }
        //now, generate a random number for the card to be selected
        int card = 0;
        for(i=0; i<5; i++){
            card = (int)(Math.random()*(51-i));
            int temp = hand[i];
            hand[i]=deck[card];
            deck[card] = deck[51-i];
            deck[51-i] = temp;
        }
        String clubs="Clubs: ", 
            diamonds="Diamonds: ",
            hearts="Hearts: ",
            spades="Spades: ",
            rank="";
        for(i=0; i<5; i++){ //name the rank and suite of each card in hand
            int checkRank = (hand[i]%13);
            switch(checkRank){
                case 0:
                    rank+="A ";
                    break;
                case 1:
                    rank+="J ";
                    break;
                case 11:
                    rank+="Q ";
                    break;
                case 12:
                    rank+="K ";
                    break;
                default:
                    rank+=checkRank+" ";
                    break;
            }
            int checkSuite = (hand[i]/13);
            switch(checkSuite){
                case 0:
                    clubs+=rank;
                    break;
                case 1:
                    diamonds+=rank;
                    break;
                case 2:
                    hearts+=rank;
                    break;
                case 3:
                    spades+=rank;
                    break;
            }
            rank=""; //reset rank so that each card in hand is properly named
        }
        System.out.println(clubs);
        System.out.println(diamonds);
        System.out.println(hearts);
        System.out.println(spades);
        System.out.println();
        System.out.print("Go again? Enter 'y' or 'Y',"
        +" anything else to quit: ");
        userContinue = myScanner.next();
    }while(userContinue.equals("y") || userContinue.equals("Y"));
  }//end of showHands

//  declare method simulateOdds
  public static void simulateOdds(){
    //declare and initialize arrays for both deck and hand
    int[] deck = new int[52];
    int[] hand = new int[5];
    int i = 0; 
    int checkRank=0; 
    int noPairs = 0; 
    int[] whichPair = new int[13]; //keeps track of which rank has a pair
    for(int k=0; k<10000; k++){ //repeat checking for pairs 10,000 times
        for(i = 0; i<52; i++){
            deck[i] = i; //set each spot in the deck array to a card placeholder
        }
        for(i = 0; i<5; i++){
            hand[i] = -1; 
        }
        //now, generate a random number for the card to be selected
        int card = 0; 
        for(i=0; i<5; i++){ 
            //use 51-i to represtent which numbers may be drawn because drawn cards aren't replaced
            card = (int)(Math.random()*(51-i)); //draw a card that has the same numerical placeholder as one in the deck array
            int temp = hand[i];
            hand[i]=deck[card]; //set spot in hand array equal to the randomly drawn card
            deck[card] = deck[51-i];
            deck[51-i] = temp;
        }
        //create an array that has the rank of each of the 5 hand cards
        int[] whichRank = new int[13];
        int[] getRank = new int[5];
        for(i=0; i<5; i++){ //get rank for each card in hand
            checkRank = (hand[i]%13); //taking the remainder when divided by 13 gives which rank it is
            getRank[i] = checkRank;
        }
        int countPairs = 0;
        for(i=0; i<5; i++){
            for(int j=i+1; j<5; j++){
                if(getRank[i]==getRank[j]){
                    countPairs++;
                    checkRank = getRank[i];
                }
            }

        }
        if(countPairs==1){
            whichPair[checkRank]+=1;
        }
        else{
            noPairs++;
        }
    }
    String printResults="";
    //print results in two columns
    System.out.printf(" " + "%-6s%-20s\n", "rank", "freq of exactly one pair");
    for(i=12; i>=0; i--){ //name each rank based on their number
        if(i==12){
            printResults+="A";
        }
        else if(i==11){
            printResults+="K";
        }
        else if(i==10){
            printResults+="Q";
        }
        else if(i==9){
            printResults+="J";
        }
        else{
            printResults+=i+2;
        }
        System.out.printf(" "+ " " + "%-6s%-20s\n", printResults, whichPair[i]);
        printResults="";
    } //print results!
    System.out.println("---------------------------------------------------");
    System.out.println("total not exactly one pair: " + noPairs);
  }//end of simulateOdds

}//end of class
