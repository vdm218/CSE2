//////////////////////////////////////////////////////////////////////////////////
//Veronica McKinny
//lab06
//Enigma 1 Java Program

/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

//  import Scanner
import java.util.Scanner;

//  declare class
public class Enigma1{
    
//  declare main method
  public static void main(String []arg){
      
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
   System.out.println("You entered "+x+"%");
   //print out the proportion remaining for select percentages
   //if(1-x/100==0.93)  //when the user enters 7
   //   System.out.println("The proportion remaining is "+0.93);
   // else if(1-x/100==0.59)//when the user enters 41
   //   System.out.println("The proportion remaining is "+0.59);
    //else if(1-x/100==0.86)//when the user enters 14
    //  System.out.println("The proportion remaining is "+0.86);
    //else if(1-x/100==0.67)//when the user enters 33
    //  System.out.println("The proportion remaining is "+0.67);
    //else if(1-x/100==0.4)//when the user enters 60
    //  System.out.println("The proportion remaining is "+0.40);
    
    double proportion = (x/100),
        proportionFinal = 1 - proportion,
        proportionF;
    proportionFinal = Math.round(proportionFinal * 100);
    int a = (int) proportionFinal;
    proportionF = (double) a / 100;
    
    if (x < 0 || x > 99){
        System.out.println("You entered a value outside of the "
        + "acceptable range.");
        return;
    }
    else{
        System.out.println("The proportion remaining is "
        + proportionF);
    }
    
   }//end of main method
}//end of class

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * 
 *    The program as it was only tested for a few specific numbers,
 *    yet prompts the user to enter one of 100 numbers. The program
 *    also did not test for numbers that were outside of the acceptable
 *    range. Therefore, I rewrote the program to, use math, check for 
 *    the acceptibility of user input and to do math to output the proper
 *    result, not just have a bunch of statements ready for a limited set of
 *    circumstances. I also set the code to round to the proper amount of
 *    digits that gave a reasonable result.
 */
