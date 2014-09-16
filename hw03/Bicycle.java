//////////////////////////////////////////////////////////////
//Veronica McKinny
//hw03
//Bicycle Java Program
//
//  first, compile the program
//      javac Bicycle.java
//  then, run the program
//      java Bicycle
//
//  This program should, based on user input,
//  compute the distance traveled and the avg mph.

//  activate Scanner for user input
import java.util.Scanner;

//  define a class
public class Bicycle {
    
//  define a main method
  public static void main (String args[]) {
      
    //declare instance of Scanner
    Scanner myScanner;
    //call the Scanner constructor
    myScanner = new Scanner( System.in );
    
    //prompt user for counts
    System.out.print("Enter the number of counts on a cyclometer: ");
    //accept user input for number
    int nCounts = myScanner.nextInt();
    //prompt user for seconds
    System.out.print("Enter the number of seconds during which "
    + "the counts occured: ");
    //accept user input for number
    int nSeconds = myScanner.nextInt();
    
    //define necessary variables
    double wheelDiameter=27.0, //the wheel diameter in inches
    PI = 3.14159, //the value that will be used for pi
    feetPerMile=5280, //the value we will use converting feet to miles and vice versa
    inchesPerFoot=12, //the value we will use converting inches to feet and vice versa
    secondsPerMinute=60, //the value we will use converting seconds to minutes and vice versa
    minutesPerHour=60; //the value we will use converting minutes to hours
    double distance, time, timeInHours, mph; //the resultants
    
    //compute values for distance, time, and mph here.
    distance=nCounts*wheelDiameter*PI; //gives distance in inches
    distance=distance/(inchesPerFoot*feetPerMile); //converts inches to miles
    time=nSeconds/secondsPerMinute; //converts seconds to minutes
    timeInHours=time/minutesPerHour; //converts minutes to hours
    mph=distance/timeInHours; //gives mph in terms of miles and hours (as it should)
    //cause the input to come out to two decimal points
     distance=distance*100;
     int x = (int)distance;
     double distanceF = x;
     distanceF=distanceF/100;
     mph=mph*100;
     int y = (int)mph;
     double mphF = y;
     mphF=mphF/100;
     
    
    //print out the output data
    System.out.println("The distance was " + distanceF + " miles and took "
    + time + " minutes.");
    System.out.println("The average speed was " + mphF + "mph.");
      
      
  } //end of main method
    
}   //end of class