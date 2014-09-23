///////////////////////////////////////////////////
//Veronica McKinny
//hw04
//Month Java Program
//
//  first, compile the program
//      javac Month.java
//  then, run the program
//      java Month
//
//  This program should, when user enters a month,
//  give the number of days in the month.

// import Scanner
import java.util.Scanner;

// declare class
public class Month{

// declare main method
  public static void main (String args[]){
      
    //declare instance of Scanner
    Scanner myScanner;
    //construct instance of Scanner
    myScanner = new Scanner(System.in);
  
    //prompt user for month
    System.out.print("Enter an int giving the number of the "
     + "month (1-12): ");
    
    //check that user input is valid
    if(myScanner.hasNextInt()){
    }//end of if
    else{
        System.out.println("You did not enter an int.");
        return; //terminate, or leave, program
    }//end of else
    int month = myScanner.nextInt();
    if(month<=0 || month>=13){
        System.out.println("You did not enter an int between"
         + " 1 and 12.");
        return; //terminate, or leave, program
    }//end of if

    //determine number of days by month
    if(month==1||month==3||month==5||month==7||month==8||
    month==10||month==12){
        System.out.println("The month has 31 days.");
        return; //terminate, or leave, program
    }//end of if
    else if(month==4||month==6||month==9||month==11){
        System.out.println("The month has 30 days.");
        return; //terminate, or leave, program
    }//end of else if
    else if(month==2){
        //prompt user for year
        System.out.print("Enter an int giving the year: ");
    }//end of else if
        //check that user input is valid
        if(myScanner.hasNextInt()){
        }//end of if
        else{
            System.out.println("You did not enter an int.");
            return; //terminate, or leave, program
        }//end of else
        int year = myScanner.nextInt();
        if(year<=0){
            System.out.println("You did not enter a valid "
            + "year (an int greater than 0).");
            return;
        }//end of if
        //determine whether or not year is a leap year
        double febIsProblem = year;
        febIsProblem /=4;
        if (febIsProblem ==(int)febIsProblem){
            System.out.println("The month has 29 days.");
        }//end of if
        else{
            System.out.println("The month has 28 days.");
        }//end of else
    
    
    
  }//end of main method
}//end of class