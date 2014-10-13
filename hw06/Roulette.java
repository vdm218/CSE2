//////////////////////////////////////////////////////////////////////////////
//Veronica McKinny
//hw06
//Roulette Java Program
//
//  first, compile the program
//      javac Roulette.java
//  then, run the program
//      java Roulette
//
//  This program will perform an experiment on probability.
//  The program will run a scenario of a person, betting $1 
//  on each of 100 spins at a Roulette table, and calculate
//  the probability that person will win money by several
//  repetitions of the program.

//  import Scanner
import java.util.Scanner;

//  declare a class
public class Roulette{

//  declare a main method
  public static void main (String args[]){

    //declare and construct instance of Scanner
    Scanner myScanner = new Scanner(System.in);
    
    //prompt user for number
    int user = 0;
    while (user<1 || user>38){
        System.out.print("Enter an integer between 1 and 38: ");
        //accept user input
        if (myScanner.hasNextInt()){
            user = myScanner.nextInt();
            if(user<1||user>38){
                System.out.println("You did not enter an int in "
                + "the proper range [1,38].");
            }
        }
        else{
            System.out.println("You did not enter an int.");
        }
    }
    switch (user) { //print out the single number the person will bet on
        case 37:
            System.out.println("The single number the person will guess each"
            + " spin is 0.");
            break;
        case 38:
            System.out.println("The single number the person will guess each"
            + "spin is 00.");
            break;
        default:
        System.out.println("The single number the person will guess each spin "
        + "is " + user + ".");
        break;
    }
    
    //set up loops and other necessary values for running simulation
    //1000 times.
    int winsTotal = 0, lossTotal = 0, moneyWonTotal = 0, j = 0;
    //run inner loop 1000 times
    while (j<1000){
        //simulate roulette based on assumption that number chosen by
        //person is always the number the user chose. This is for 1 round
        int i = 0, wins = 0, moneyWon = 0;
        while(i<100){
            int roul = (int)(Math.random()*38) + 1;
            if (roul==user){
                wins += 1;
            }
            i++;
        }
        //determine whether or not the person gained money
        moneyWon = wins*36;
        if (wins>3) {
            winsTotal += 1;
        }
        if (wins==0){
            lossTotal += 1;
        }
        moneyWonTotal += moneyWon;
        moneyWon = 0;
        wins = 0;
        i = 0;
        j++;
    }
      
    System.out.println("\n Out of 1000 repetitions of a 100-spin "
    + "simulation of Roulette, and out of a total $100,000 " +
    "bet, the person betting had the following results: ");
    System.out.println("   Number of times the person lost "
    + "everything: " + lossTotal);
    System.out.println("   Number of times the person walked "
    + "away with a profit: " + winsTotal);
    System.out.println("   Total Winnings: $" + moneyWonTotal);
    
      
  }//end of main method
}//end of class