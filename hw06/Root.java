//////////////////////////////////////////////////////////////////////////
//Veronica McKinny
//hw06
//Root Java Program
//
//  first, compile the program
//      javac Root.java
//  then, run the program
//      java Root
//
//  This program should use the bisection method
//  to calculate the square root of a double that the
//  user is forced to input. 

//  import Scanner
import java.util.Scanner;

//  declare a class
public class Root{

//  declare a main method
  public static void main (String args[]){
      
    //declare and construct instance of Scanner
    Scanner myScanner = new Scanner(System.in);
    
    //prompt user to input a double greater than 0.
    double x = 0;
    System.out.print("Enter a double that is greater than 0: ");
    if (myScanner.hasNextDouble()){ //test that user inputted a double
        x = myScanner.nextDouble(); //accept user input
        if (x<=0){ //test that user input is greater than 0
            System.out.println("You did not enter a double "
            + "greater than 0.");
            return; //terminate program
        }
    }
    else{
        System.out.println("You did not enter a double.");
        return; //terminate program
    }
    
    //start bisection method
    //declare necessary variables
    double low = 0, high = (1+x), middle = 13, middleSquare = 0;
    while ((high-low)>(0.0000001*(1+x))){ //run bisection
        middle = (high + low)/2;
        middleSquare = middle*middle; //assign middle to high or low
        if (middleSquare>x){
            high = middle;
        }
        else{
            low = middle;
        }
    }
    System.out.println("The square root of " + x + " is "
    + middle);

      
  }//end of main method
}//end of class