///////////////////////////////////////////////////////////////////
//Veronica McKinny
//hw05
//Boola Boola Java Program
//
//  first, compile the program
//      javac BoolaBoola.java
//  then, run the program
//      java BoolaBoola
//
//  This program should randomly assign
//  three boolean variables that are combined
//  by two random operators and asks the user
//  whether the randomly generated statement
//  is true or false. It should then tell the
//  user whether or not their response is true

//  import Scanner
import java.util.Scanner;

//  declare class
public class BoolaBoola{

//  declare a main method
  public static void main (String args[]){
    
    //declare instance of Scanner
    Scanner myScanner;
    //construct instance of Scanner
    myScanner = new Scanner(System.in);
    
    //determine if each Boolean function is t/f
    boolean randomFirst;
    String firstString = "t or f";
    int ranF = (int)(Math.random()*2);
    if (ranF==0){
        randomFirst = true;
        firstString = "true";
    }
    else{
        randomFirst = false;
        firstString = "false";
    }
    boolean randomSecond;
    String secondString = "f or t";
    int ranS = (int)(Math.random()*2);
    if (ranS==0){
        randomSecond = true;
        secondString = "true";
    }
    else{
        randomSecond = false;
        secondString = "false";
    }
    boolean randomThird;
    String thirdString = "frue or talse";
    int ranT = (int)(Math.random()*2);
    if (ranT==0){
        randomThird = true;
        thirdString = "true";
    }
    else{
        randomThird = false;
        thirdString = "false";
    }
    //all of above sets each boolean statement
    //as well as what will print out when asking
    //the user for the trueness of the statement.
    
    //determine the logical operators
    String operatorOne; //set first operator
    int caseOpO = 0;
    int opO = (int)(Math.random()*2);
    if (opO==0){
        operatorOne = "&&";
        caseOpO = 1;
    }
    else{
        operatorOne = "||";
        caseOpO = 2;
    }
    String operatorTwo; //set second operator
    int caseOpT = 0;
    int opT = (int)(Math.random()*2);
    if (opT==0){
        operatorTwo = "&&";
        caseOpT = 1;
    }
    else{
        operatorTwo = "||";
        caseOpT = 2;
    }
    
    //have the computer determine the trueness
    //of the resultant statement
    boolean result = true; //final statement
    if (caseOpO==1 && caseOpT==1){
        result=randomFirst&&randomSecond&&randomThird;
    }//this performs statment assuming both operaters are &&
    if (caseOpO==1 && caseOpT==2){
        result=randomFirst&&randomSecond||randomThird;
    }//this performs statement assuming first op is && and
     //second op is ||
    if (caseOpO==2 && caseOpT==1){
        result=randomFirst||randomSecond&&randomThird;
    }//this performs statement assuming first op is ||
     //and second op is &&
    if (caseOpO==2 && caseOpT==2){
        result=randomFirst||randomSecond||randomThird;
    }//this performs statement assuming first op is ||
     //and second op is ||
    
    //prompt user for truthiness
    System.out.print("Does " + firstString + " " + 
    operatorOne + " " + secondString + " " + operatorTwo 
    + " " + thirdString + " have the value true (T or t)"
    + " or false (F or f)?: ");
    
    //accept and test user input
    String user = myScanner.next();
    char userTF;
    int lengthTest = user.length();
    if (lengthTest>1){ //check that user entered one char
        System.out.println("A single character is expected.");
        return; //terminate program
    }
    else{ //assign char to user input
        userTF = user.charAt(0);
    }
    switch (userTF) {
        case 'T': case 't':
            if (result==true){
                System.out.println("Correct.");
            }
            else{
                System.out.println("Wrong; try again.");
            }
            break;
        case 'F': case 'f':
            if (result==false){
                System.out.println("Correct.");
            }
            else{
                System.out.println("Wrong; try again.");
            }
            break;
        default:
            System.out.println("Wrong; try again.");
            break;
    }
    
    
    
  }//end of main method
}//end of class