///////////////////////////////////////////////////////////////
//Veronica McKinny
//hw03
//Root Java Program
//
//  first, compile the program
//      javac Root.java
//  then, run the program
//      java Root
//
//  This program should crudely estimate 
//  the cube root of a number

//  activate Scanner for user input
import java.util.Scanner;

//  define a class
public class Root{

//  define a main method
  public static void main(String args[]) {
      
    //declare instance of Scanner
    Scanner myScanner;
    //call the new Scaner onstructor
    myScanner = new Scanner(System.in);

    //prompt user for a double
    System.out.print("Enter a double, and I print its cube root - ");
    //accept user input for double
    double userDouble = myScanner.nextDouble();
    
    //compute crude cube root
    //define necesary variables for six crude guesses and the approx userDouble
    double guess1, guess2, guess3, guess4, guess5, guess6, approxDouble;
    guess1=userDouble/3; //calculate guess1
    guess2=(2*guess1*guess1*guess1+userDouble)/(3*guess1*guess1); //calculate guess2
    guess3=(2*guess2*guess2*guess2+userDouble)/(3*guess2*guess2); //calculate guess3
    guess4=(2*guess3*guess3*guess3+userDouble)/(3*guess3*guess3); //calculate guess4
    guess5=(2*guess4*guess4*guess4+userDouble)/(3*guess4*guess4); //calculate guess5
    guess6=(2*guess5*guess5*guess5+userDouble)/(3*guess5*guess5); //calculate guess6
    approxDouble=guess6*guess6*guess6; //guess6 cubed is the approxDouble
    
    //print out the output
    System.out.println(guess6 + "*" + guess6 + "*" + guess6
    + "=" + approxDouble);
      
  } //end of main method
    
} //end of class
