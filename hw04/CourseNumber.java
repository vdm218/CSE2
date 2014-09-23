///////////////////////////////////////////////////////////////
//Veronica McKinny
//hw04
//Course Number Java Program
//
//  first, compile the program
//      javac CourseNumber.java
//  then, run the program
//      java CourseNumber
//
//  this program should, when the user inputs
//  a course code, return the year and semester
//  in which the course takes place

  //import Scanner
import java.util.Scanner;

  //declare a class
public class CourseNumber{
  
  //declare a main method
  public static void main (String args[]){

    //declare instance of Scanner
    Scanner myScanner;
    //construct instance of Scanner
    myScanner = new Scanner(System.in);
    
    //prompt user for course semester
    System.out.print("Enter a six digit number giving"
    +" year and the course semester: ");
    
    //check to see if user input was valid
    if(myScanner.hasNextInt()){
    }//end of if
    else{
        System.out.println("You did not enter an int.");
        return; //terminate program
    }//end of else
    int userNumber = myScanner.nextInt(); //accept input for checking
    if(userNumber<186510||userNumber>201440){
        System.out.println("The number was outside of the"
        +" range [186510,201440].");
        return; //terminate program
    }//end of if
    
    //check the year of the user input
    double yearCode=userNumber; //declare the double year
    yearCode /=100;
    int year = (int)yearCode;
    //check the semester of the user input
    int yearCalculation; //put year in terms of code
    int semester;
    yearCalculation=year*100;
    semester=userNumber-yearCalculation;
    String timeOfYear = "lol";
    
    //determine semester
    if(semester==10){
        timeOfYear="spring";
    }//end of if
    else if(semester==20){
        timeOfYear="summer 1";
    }//end of else if
    else if(semester==30){
        timeOfYear="summer 2";
    }//end of else if
    else if(semester==40){
        timeOfYear="fall";
    }//end of else if
    else{
        System.out.println(semester + " is not a "
        +"legitimate semester.");
        return; //terminate program
    }//end of else
    
    //output results
    System.out.println("The course was offered in "
    + "the " + timeOfYear + " semester of " +
    year + ".");
      
      

  }//end of main method
} //end of class