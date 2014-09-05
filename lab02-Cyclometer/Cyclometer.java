////////////////////////////
//Veronica McKinny
//lab02
//Cyclometer Java Program
//
//  first, compile the program
//      javac Cyclometer.java
//  then, run the program
//      java Cyclometer

//  define a class
public class Cyclometer{
    
//  define a main method
  public static void main(String args[]) {

    //our input data
         int secsTrip1=480;      //seconds passed during trip 1
         int secsTrip2=3220;     //seconds passed during trip 2
         int countsTrip1=1561;   //counts passed during trip 1
         int countsTrip2=9037;   //counts passed during trip 2
    
    //our intermediate variables and output data
         double wheelDiameter=27.0,  //the wheel diameter
         PI=3.14159, //the value that will be used for pi
         feetPerMile=5280,    //the value we will use converting feet to miles and vice versa
         inchesPerFoot=12,    //the value we will use to convert inches to feet and vice versa
         secondsPerMinute=60; //the value we will use to convert seconds to minutes and vice versa
         double distanceTrip1, distanceTrip2, totalDistance; //how all 3 distances relate

    //print out numbers stored in the variables that store number of seconds and counts
    System.out.println("Trip 1 took " + 
        (secsTrip1/secondsPerMinute) + " minutes and had " + 
        countsTrip1 + " counts.");
    System.out.println("Trip 2 took " + 
        (secsTrip2/secondsPerMinute) + " minutes and had " + 
        countsTrip2 + " counts.");
    
    //run the calculations; store the values. Document your
    //calculation here.
    //this will calculate how long each distance 1 and distance 2 are in miles
    //as well as the total distance travelled between the two trips.
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    //  Above gives distance in inches
    //  (for each count, a rotation of the wheel travels
    //  the diameter in inches times PI)
    distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;

    //print out the output data
    System.out.println("Trip 1 was " + distanceTrip1 + " miles.");
    System.out.println("Trip 2 was " + distanceTrip2 + " miles.");
    System.out.println("The total distance was " + totalDistance + " miles.");
    
    
    
  } //end of main method
  
} //end of class