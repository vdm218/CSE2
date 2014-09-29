////////////////////////////////////////////////////////////////////////
//Veronica McKinny
//hw05
//Burger King Java Program
//
//  first, compile the program
//      javac BurgerKing.java
//  then, run the program
//      java BurgerKing
//
//  this program should give the user a variety of
//  options for an order and, based on user input,
//  offer more options depending on what the user
//  first chose.

//  import scanner
import java.util.Scanner;

//  declare class
public class BurgerKing{

//  declare a main method
  public static void main (String args[]){

    //declare instance of Scanner
    Scanner myScanner;
    //construct instance of Scanner
    myScanner = new Scanner(System.in);
    
    //prompt user for choice of burger, soda, or fries
    System.out.println("Enter a letter to indicate a "
    + "choice of:");
    System.out.println("\t Burger (B or b)");
    System.out.println("\t Soda (S or s)");
    System.out.print("\t Fries (F or f): ");
    
    //accept and test user input
    String order1 = myScanner.next();
    char option1;
    int order1Test = order1.length();
    if(order1Test>=2){ //check if user inputted a char
        System.out.println("A single char is expected.");
        return; //terminate program
    }
    else{
        option1 = order1.charAt(0);
    }
    //determine what path to take based on user input
    switch (option1){
        case 'B': case 'b': //what to do for burger
            //ask user what they want on burger
            System.out.println("Enter A or a for \""
            + "all the fixins\"");
            System.out.println(" C or c for cheese");
            System.out.print(" N or n for non of the"
            + " above: ");
            //accept and test user input
            String orderB = myScanner.next();
            char optionB;
            int orderBTest = orderB.length();
            if(orderBTest>=2){ //check if user inputted a char
                System.out.println("A single char is expected.");
                return; //terminate program
            }
            else{
                optionB = orderB.charAt(0);
            }
            switch (optionB){ //take a path depending on user choice
                case 'A': case 'a': //with all the fixins
                    System.out.println("You ordered a "
                    + "burger with all the fixins.");
                    break;
                case 'C': case 'c': //with cheese
                    System.out.println("You ordered a "
                    + "burger with cheese.");
                    break;
                case 'N': case 'n': //with nothing
                    System.out.println("You ordered a "
                    + "plain burger.");
                    break;
                default:
                    System.out.println("You did not enter"
                    + " any of A, a, C, c, N, or n.");
                    break; //terminate program
            }
            break;
        case 'S': case 's': // what to do for soda
            //ask user which soda they'd like
            System.out.println("Enter which soda you'd like:");
            System.out.println(" P or p for Pepsi");
            System.out.println(" C or c for Coke");
            System.out.println(" S or s for Sprite");
            System.out.print(" M or m for Mountain Dew: ");
            //accept and test user input
            String orderS = myScanner.next();
            char optionS;
            int orderSTest = orderS.length();
            if(orderSTest>=2){ //check if user inputted a char
                System.out.println("A single char is expected.");
                return; //terminate program
            }
            else{
                optionS = orderS.charAt(0);
            }
            //print out user choice
            switch (optionS) {//take path depending on user choice
                case 'P': case 'p': //path for Pepsi
                    System.out.println("You ordered a Pepsi.");
                    break;
                case 'C': case 'c': //path for Coke
                    System.out.println("You ordered a Coke.");
                    break;
                case 'S': case 's': //path for Sprite
                    System.out.println("You ordered a Sprite.");
                    break;
                case 'M': case 'm': //path for Mountain Dew
                    System.out.println("You ordered a "
                    + "Mountain Dew.");
                    break;
                default:
                    System.out.println("You did not enter one"
                    + " of P, p, C, c, S, s, M, or M.");
            }
            break;
        case 'F': case 'f': //what to do for fries
            //prompt user for order size
            System.out.println("Enter an order size: ");
            System.out.println(" L or l for a large order");
            System.out.print(" S or s for a small order: ");
            //accept and test user input
            String orderF = myScanner.next();
            char optionF;
            int orderFTest = orderF.length();
            if(orderFTest>=2){ //check if user inputted a char
                System.out.println("A single char is expected.");
                return; //terminate
            }
            else{
                optionF = orderF.charAt(0);
            }
            //print out user choice
            switch (optionF) { //take path depending on user choice
                case 'L': case 'l': //path for large
                    System.out.println("You ordered large fries.");
                    break;
                case 'S': case 's': //path for small
                    System.out.println("You ordered small fries.");
                    break;
                default:
                    System.out.println("You did not enter one of"
                    + " L, l, S, or s.");
                    break;
            }
            break;
        default:
            System.out.println("You did not enter any of"
            + " B, b, S, s, F, or f.");
            break;
    }
      
      
      
  }//end of main method
}//end of class