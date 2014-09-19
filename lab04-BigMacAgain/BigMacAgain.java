///////////////////////////////////////////////////////////
//Veronica McKinny
//lab04
//Big Mac Again Java Program
//
//  first, compile the program
//      javac BigMacAgain.java
//  then, run the program
//      java BigMacAgain
//
//  this program should, when user enters the number of big macs
//  desired as well as whether or not they want fries, print
//  the cost of a meal.

//  activate Scanner for user input
import java.util.Scanner;

//  define a class
public class BigMacAgain{

//  define a main method
  public static void main (String args[]){

//  declare instance of Scanner
    Scanner myScanner;
//  construct instance of Scanner declared above
    myScanner = new Scanner(System.in);

    //prompt user for number of Big Macs
    System.out.print("Enter the number of Big Macs: ");

    //check to make sure user actually entered an int
        if(myScanner.hasNextInt()){
        }//end of outer if
            else{
                System.out.println("You did not enter an int.");
                return; //leaves the program, i.e.
                        //the program terminates
            }//end of else
    //accept user input for number of Big Macs
        int nBigMacs = myScanner.nextInt();  
    //check to make sure the user entered a positive number
        if(nBigMacs<0){
            System.out.println("You did not enter an int greater than 0.");
            return; //leaves the program, i.e.
                    //the program terminates
        }//end of inner if

    //calculate cost of Big Macs
    double costBigMacs; //define cost
    costBigMacs = nBigMacs*2.22;
    //format cost so there are only two decimal points
    costBigMacs *= 100;
    int x = (int)costBigMacs;
    double costBigMacsFinal = x;
    costBigMacsFinal /= 100;
    //print out order of Big Macs
    System.out.println("You ordered " + nBigMacs +
    " Big Macs for a cost of " + nBigMacs + "*2.22 = $" 
    + costBigMacsFinal);
    
    //prompt user to input whether or not they want fries
    System.out.print("Do you want an order of fries " +
    "(Y/y/N/n)? - ");
    
    //accept user input
    char userChar = myScanner.next().charAt(0);
    //check to make sure user answered yes or no
    if(userChar=='Y'||userChar=='y'){
            //calculate and print out total cost for meal with fries
        double friesCost=2.15;
        System.out.println("You ordered fries at a cost of $" + 
        friesCost); //prints cost of fries
        double costMealFries=friesCost+costBigMacsFinal;
        System.out.println("The total cost of the meal is $"
            + costMealFries);
        return;
    }//end of if
        else if (userChar=='N'||userChar=='n'){
            System.out.println("The total cost of the meal is $"
                + costBigMacsFinal);
        }//end of else if
            else{
                System.out.println("You did not enter "
                + "\'Y\', \'y\', \'N\', or \'n\'.");
            }//end of else
    

  } //end of main method
  
} //end of class

