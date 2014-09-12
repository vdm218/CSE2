////////////////////////////////////////////////////
//Veronica McKinny
//lab03
//Big Mac Java Program
//
//  first, compile the program
//      javac BigMac.java
//  then, run the program
//      java BigMac
//
//  This program should, based on user input,
//  compute the cost of buying some Big Macs.

//  activate Scanner for user input
import java.util.Scanner;

//  define a class
public class BigMac {
    
//  define a main method
  public static void main (String args[]) {
      
    //declare instance of Scanner
    Scanner myScanner;
    //call the Scanner constructor
    myScanner = new Scanner( System.in );
    
    //prompt user for number of tickets
    System.out.print(
    "Enter the number of Big Macs(an integer > 0): ");
    //accept user input for number
    int nBigMacs = myScanner.nextInt();
    //prompt user for the cost of a Big Mac
    System.out.print("Enter the cost per Big Mac as"
    + " a double (in the form xx.xx): " );
    //accept user input for cost
    double bigMac$ = myScanner.nextDouble();
    //prompt user for the percent sales tax
    System.out.print(
    "Enter the percent tax as a whole number (xx): ");
    //accept user input for tax rate
    double taxRate = myScanner.nextDouble();
    taxRate/=100; //user enters percent, but I want proportion
    
    //print out the output
    double cost$;
    int dollars, //whole dollar amount of cost
        dimes, pennies; //for storing digits to the
            //right of the decimal point for the cost$
    cost$ = nBigMacs*bigMac$*(1+taxRate);
    //get the whole amount, dropping decimal fraction
    dollars=(int)cost$;
    //get dimes amount, e.g.,
    // (int)(6.73*10) % 10 -> 67 % 10 -> 7
    // where the % (mod) operator returns the remainder
    // after the division:  583%100 -> 83, 27%5 -> 2
    dimes=(int)(cost$*10)%10;
    pennies=(int)(cost$*100)%10;
    System.out.println("The total cost of " + nBigMacs
        + " Big Macs, at $" + bigMac$ + " per Big Mac, with a"
        + " sales tax of " + (int)(taxRate*100) + "%, is $"
        + dollars + '.' + dimes + pennies + '.');
    
    
      
  } //end of main method
  
} //end of class