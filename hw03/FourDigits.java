////////////////////////////////////////////////////////
//Veronica McKinny
//hw03
//Four Digits Java Program
//
//  first, compile the program
//      javac FourDigits.java
//  then, run the program
//      java FourDigits
//
//  This program should, when user inputs a number with
//  four digits in the decimal place, print those
//  four digits.

//  import Scanner
import java.util.Scanner;

//  define a class
public class FourDigits{

//  define a method
  public static void main(String args[]){
    
    //declare instance of Scanner
    Scanner myScanner;
    //call the Scanner constructor
    myScanner = new Scanner( System.in );
    
    //prompt user for sample number
    System.out.print("Enter a double and I display "
    + "the four digits to the right of the decimal "
    + "point - ");
    //accept user input
    double userNumber = myScanner.nextDouble();
    
    //calculate each individual number
    //define an int for each decimal place
    int ten, hundredth, thousandth, fourth;
    //get amount for each number, e.g.
    // (int)(1.2345*10)%10 -> 12 % 10 -> 2
    // where the % (mod) operator returns the 
    // remainder after division.
    ten=(int)(userNumber*10)%10; //calculates decimal in tenth place
    hundredth=(int)(userNumber*100)%10; //calculates decimal in hundredth place
    thousandth=(int)(userNumber*1000)%10; //calculates decimal in thousandth place
    fourth=(int)(userNumber*10000)%10; //calculates decimal in hundredthousandth place
    
    //print output result
    System.out.println("The four digits are " +
    ten + hundredth + thousandth + fourth);




    } //end of main method
    
} //end of class