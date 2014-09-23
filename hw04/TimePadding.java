///////////////////////////////////////////////////////////////////////
//Veronica McKinny
//hw04
//Time Padding Java Program
//
//  first, compile the program
//      javac TimePadding.java
//  then, run the program
//      java TimePadding
//
//  This program will, when the user enters the number of seconds
//  that have passed during the day, will display the time in
//  conventional form.

  //import Scanner
import java.util.Scanner;

  //declare class
public class TimePadding{
  
  //declare main method
  public static void main (String args[]){
    
    //declare instance of Scanner
    Scanner myScanner;
    //construct instance of Scanner
    myScanner = new Scanner(System.in);
    
    //prompt user for time in seconds
    System.out.print("Enter the time in seconds: ");
    
    //check to see if user input is valid
    if(myScanner.hasNextInt()){
    }//end of if
    else{
        System.out.println("You did not enter an int.");
        return; //terminate program
    }//end of else
    int userSeconds = myScanner.nextInt(); //accept user input
    if(userSeconds<1||userSeconds>86400){
        System.out.println("You did not enter an int in the range "
        + "[0,86400].");
        return; //terminate program
    }//end of if
    
    //calculate minutes and hours
    double minutes= userSeconds/60;
    double minutesCalc = minutes;
    int mins = (int)minutes;
    double hours = mins/60;
    int hr = (int)hours;
    double minutesRemain = minutesCalc-(hr*60);
    int min = (int)minutesRemain;
    double seconds;
    seconds=userSeconds-(min*60)-(hr*3600);
    int sec = (int)seconds;
    
    //declare strings
    String minString="lol";
    String secString="lol";
    //determine if padding is needed
    if(min<10){
        minString = "0" + Integer.toString(min);
    }//end of if for mins
    else{
        minString = Integer.toString(min);
    }//end of else for secs
    if(sec<10){
        secString = "0" + Integer.toString(sec);
    }//end of if for sec
    else{
        secString = Integer.toString(sec);
    }//end of else for sec

    //print output
    System.out.println("The time is " + hr + ":" + minString + ":" 
    + secString + ".");
    
  }//end of main method
}//end of class