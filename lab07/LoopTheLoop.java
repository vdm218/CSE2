///////////////////////////////////////////////////////////////////////////
//Veronica McKinny
//lab07
//Loop The Loop Java Program
//
//  first, compile the program
//      javac LoopTheLoop.java
//  then, run the program
//      java LoopThe Loop
//
//  This program will, when the user enters a number
//  between 1 and 15, print out a set of stars that
//  goes from 1 star to the number the user inputted.

//  import Scaner
import java.util.Scanner;

//  declare a class
public class LoopTheLoop{
    
//  declare a main method
  public static void main (String args[]){
      
    //declare and construct intance of Scanner
    Scanner myScanner = new Scanner(System.in);
    
    //declare number of stars
    int nStars = 16;
    boolean contin = true;
    while(contin){
        while(nStars<1||nStars>15){ //obtain proper input
            System.out.print("Enter an int between 1 and 15: "); //prompt user
            while(!myScanner.hasNextInt()){//test that user entered int
                System.out.println("You did not enter an int in");
                String x = myScanner.next();
                System.out.print("Enter an int between 1 and 15: ");
            }
            nStars = myScanner.nextInt(); //accept user input
            if (nStars<1||nStars>15){ //test that user input was in proper range
                System.out.println("You did not enter an int in "
                + "the range [1,15].");
            }
        }
        int star = 0, n = 0;
        String asterisks = "", a = "";
        while (n<nStars){ //run first star line
            a += "*";
            n++;
        }
        System.out.println(a);
        while (star<nStars){ //run rest of star lines
            asterisks += "*";
            System.out.println(asterisks);
            star++;
        }
        System.out.print("Enter Y or y to go again: "); //ask if program should repeat
        String cont = "twinkle twinkle";
        cont = myScanner.next();
        char x = cont.charAt(0);
        switch (x){ //test user input
            case 'Y': case 'y': //run program again
                nStars = 16;
                break;
            default: //leave program
                contin=false;
                break;
        }
    }//end of outer while loop
    
    
  }//end of main method
}//end of class