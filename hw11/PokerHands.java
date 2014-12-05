//////////////////////////////////////////////////////////////////////////////
//Veronica McKinny
//hw11
//Poker Hands Java Program
//
//  This program should accept a hand of cards based on user input
//  and then determine what type of poker hand this is.

//  import Scanner
import java.util.Scanner;

//  declare class
public class PokerHands{

//  declare method showOneHand
  public static void showOneHand(int hand[]){
	String suit[]={"Clubs:	  ", "Diamonds: ", "Hearts:   ", "Spades:   "};
	String face[]={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	"4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
        out+=suit[s]; //add suit to the string
  	    for(int rank=0;rank<13;rank++){ //for each suit, add the cards in hand that are of that suit
    	    for(int card=0;card<5;card++){
     	        if(hand[card]/13==s && hand[card]%13==rank)
      	            out+=face[rank];
    	    }
  	    }
  	out+='\n';
	}
	System.out.println(out); //print the hand
  }//end of method showOneHand

//  declare method getSuit
  public static char getSuit(Scanner myScanner, char[] askSuit){
    System.out.print("Enter the suit: \'c\', \'d\', \'h\', \'s\' - "); //prompt user
    String user = myScanner.next();
    char yayUser = '\u0000'; //let this be blank
    boolean status = true; //keeps loop running until user inputs properly
    while(status){
        if(user.length()>1){ //checks if user entered a char or not
            System.out.println("You did not enter a valid response");
            System.out.print("Enter the suit: \'c\', \'d\', \'h\', \'s\' - ");
            user = myScanner.next(); //incorrect; reprompt user
        }
        else{
            yayUser = user.charAt(0); //set string equal to char
            int count = 0;
            for(int i = 0; i<4; i++){
                if(yayUser == askSuit[i]){
                    count++; //if the user input equals an entry in the suit array
                }
            }
            if(count==0){ //check if user input matched a suit
                System.out.println("You did not enter a valid response");
                System.out.print("Enter the suit: \'c\', \'d\', \'h\', \'s\' - ");
                user = myScanner.next(); //reprompt user if didn't match
            }
            else{
                status = false;
            }
        }
    }
    return yayUser; //return proper input
  }//end of getSuit

//  declare method getFace
  public static int getFace(Scanner myScanner){
    //for this, I want to convert the user's string input into an int to ensure
    //that it's easier to determine which card in the hand it is later
    System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2' - "); //prompt user for face
    int count = 0;
    int yayUser = 0; //what will eventually be returned
    boolean status = true; //condition to keep running until user enters proper input
    while(status){
        if(myScanner.hasNextInt()){ //check to see if what the user entered was already an int
            yayUser = myScanner.nextInt();
            if(yayUser>1&&yayUser<11){ //check if user input is one of the numbered cards
                yayUser = 12-yayUser + 2;
                status = false;
            }
            else{
                System.out.println("You did not enter a valid response");
                System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2' - ");
                continue; //if not, reprompt user
            }
        }
        else{
            String stuff = myScanner.next(); //if did not enter an int, check if it one of the four face cards
            if(stuff.length()>1){
                System.out.println("You did not enter a valid response");
                System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2' - ");
                continue; //if entered a string, reprompt user
            }
            else{
                char theUser = stuff.charAt(0);
                switch(theUser){ //if it was a char, check which char. If a face, assign it a number in the range [0,12] that's not already used
                    case 'a':
                        yayUser = 0;
                        status = false;
                        break;
                    case 'k':
                        yayUser = 1;
                        status = false;
                        break;
                    case 'q':
                        yayUser = 2;
                        status = false;
                        break;
                    case 'j':
                        yayUser = 3;
                        status = false;
                        break;
                    default:
                        System.out.println("You did not enter a valid response");
                        System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2' - ");
                        continue; //if not, reprompt user
                }
            }
        }
    }
    return yayUser; //return this int
  }//end of getFace

//  declare method addCard
  public static int addCard(int[] hand, int daSuit, int daFace, Scanner myScanner, char[] askSuit){
    int card = 0;
    daSuit = getSuit(myScanner, askSuit);
    daFace = getFace(myScanner);
    switch(daSuit){
        case 'c':
            card = daFace;
            break;
        case 'd':
            card = 13+daFace;
            break;
        case 'h':
            card = 26+daFace;
            break;
        case 's':
            card = 39+daFace;
            break;
    }
    return card;
  } //end of addCard

//  declare method shouldContinue
  public static boolean shouldContinue(Scanner myScanner){
    System.out.print("Enter \'y\' or \'Y\' to enter a(nother) hand - "); //prompt user
    String user = myScanner.next();
    if(user.length()>1){ //check to see if it was a char
        return false; //if not a char, don't continue
    }
    else{
        char yayUser = user.charAt(0);
        switch(yayUser){
            case 'y': case 'Y': //only continue with proper input
                return true;
            default:
                return false;
        }
    }
  }//end of shouldContinue

//  declare method checkRanks
  public static int[] checkRanks(int[] hand){
    int[] listRanks = new int[13];
    for(int i = 0; i<13; i++){
        listRanks[i] = 0;
    }
    for(int card = 0; card<5; card++){
        listRanks[hand[card]%13]++; //add one for each card that is of each rank to that rank's spot in the array
    }
    return listRanks;
  }//end of checkRanks

//  declare method checkSuits
  public static int[] checkSuits(int[] hand){
      int[] suitAnalysis = new int[4];
      for(int i = 0; i<4; i++){
          suitAnalysis[i] = 0;
      }
      for(int card = 0; card<5; card++){
          suitAnalysis[(hand[card])/13]++; //add one for each card that is of each suit to that suit's spot in the array
      }
      return suitAnalysis;
  }
  
//  declare method analyzeHand
  public static String analyzeHand(int[] listRanks, int[] suitAnalysis){
      int[] handAnalysis = new int[5];
      for(int h = 0; h<5; h++){
          handAnalysis[h] = 0;
      }
      for(int i = 0; i<13; i++){
          handAnalysis[listRanks[i]]++;
      }
      String handType = "";
      int checkFlush = 0; //check NOW for a flush before starting for other hands
      for(int k = 0; k<4; k++){
          if(suitAnalysis[k]==5){
              checkFlush++;
          }
      }
      //test for special hands
      if(handAnalysis[1]==5){ //check if the five individually ranked cards are consecutive
        int checkConsecutive = 0, low = 0, high = 0;
        for(int j = 0; j<13; j++){
            if(listRanks[j]==1){
                checkConsecutive++;
            }
            if(checkConsecutive==1&&low==0){ //in checking for consecutive, make sure ONLY first and last 1 spaces are recorded!
                if(listRanks[0]==1){
                    low = 0;
                }
                else{
                    low = j;
                }
            }
            else if(checkConsecutive==5&&high==0){
                high = j;
            }
        }
        if((high-low)>5){ //if the difference between the first and last 1's in the array is greater than 5, it is not a straight
            if(checkFlush>0){ //check if the not straight is a flush, or just a high card
                handType = "Flush";
            }
            else{
                handType = "High Card";
            }
        }
        else{ //check if straight is also a flush
            if(checkFlush>0){
                if(listRanks[0]==1&&listRanks[4]==1){ //check for Royal flush, also, by checking location of first and last cards in consecutive cards
                    handType = "Royal Flush";
                }
                else{
                    handType = "Straight Flush";
                }
            }
            else{
                handType = "Straight";
            }
        }
      }
      else if(handAnalysis[2]==1&&handAnalysis[3]==1){ //check for full house
          handType = "Full House";
      }
      else if(handAnalysis[2]==2){ //check for a Two Pair
          handType = "Two Pair";
      }
      else if(handAnalysis[2]==1){ //check for a One Pai
          handType = "One Pair";
      }
      else if(handAnalysis[4]==1){ //check for four of a kind
          handType = "Four of a Kind";
      }
      else if(checkFlush>0){ //check for a normal flush
          handType = "Flush";
      }
      else{ //everything else is just not a thing
          handType = "N/A";
      }
      return handType;
  }//end of analyzeHand

//  declare main method
  public static void main(String args[]){
    int[] hand = new int[5];
    int[] listRanks = new int[13];
    char[] askSuit = new char[]{ 'c', 'd', 'h', 's' };
    String[] askFace = { "a", "k", "q", "j", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
    Scanner myScanner = new Scanner(System.in);
    char daSuit = '\u0000';
    int daFace = 0;
    int card = 0;
    while(shouldContinue(myScanner)){
        for(int i = 0; i<5; i++){
            int checkCard = 0;
            card = addCard(hand, daSuit, daFace, myScanner, askSuit);
            for(int j = 0; j<i; j++){
                if(hand[j]==card){ //check that card hasn't already been entered
                    checkCard++;
                }
            }
            if(checkCard==0){
                hand[i] = card;
            }
            else{
                System.out.println("You already entered that card");
                i--;//cause the loop to run again if card was already entered
            }
        }
        showOneHand(hand);
        System.out.println("This is a " + analyzeHand(checkRanks(hand), checkSuits(hand)) + ".");
    }
  }//end of main method

}//end of class