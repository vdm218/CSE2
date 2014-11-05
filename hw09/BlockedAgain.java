///////////////////////////////////////////////////////////////////////////////
//Veronica McKinny
//Hw09
//Blocked Again Java Program
//
//  This program should use several methods to construct a 
//  series of blocks based on user input.

//  import Scanner
import java.util.Scanner;

//  declare class
public class BlockedAgain{

//  declare method getInt()
  public static int getInt(){
    //declare instance of Scanner
    Scanner myScanner = new Scanner(System.in);
    //prompt user for an int
    System.out.print("Enter and int between 1 and 9, inclusive: ");
    int userInt = checkRange(myScanner);
    return userInt;
  }//end of method getInt()

//  declare method checkInt()
  public static boolean checkInt(Scanner check){
    if (check.hasNextInt()){ //the Scanner detects an int
        return true;
    }
    else{ //the user didn't input an int
        return false;
    }
  }//end of method checkInt()

//  declare method checkRange()
  public static int checkRange(Scanner check2){
    int theInt = 0; //declare value to be returned
    while(13==13){ //set condition to keep loop running
        if(checkInt(check2)){ //check that user inputted an int
            theInt=check2.nextInt();
            if(theInt<0 || theInt>9){ //check for proper range
                System.out.print("You did not enter an int in [1,9]; "
                + "try again: "); //if outside proper range, prompt again
            }
            else{
                break; //end loop
            }
        }
        else{
            System.out.print("You did not enter an int; try again: ");
            String getRidOf = check2.next(); //get rid of user junk
        }
    }
    return theInt;
  }//end of method checkRange()
  
//  declare method allBlocks
  public static void allBlocks(int x){
    for(int i = 1; i<=x; i++){
        block(i, x);
        //create a block for each value based on user input
    }
  }//end of method allBlocks

//  declare method block()
  public static void block(int number, int runs){
    for(int j = 0; j<number; j++){ //print out the proper number of lines
        System.out.println(line(number,runs));
    }
    String dashString = "";
    for(int k = 0; k< runs-number; k++){
        dashString += " "; //add the proper number of spaces to the dash line
    }
    for(int l=0; l<number*2-1; l++){
        dashString += "-";
    }
    //print out the dashes
    System.out.println(dashString);
  }//end of method block

//declare method line()
  public static String line(int digit, int runsForSpaces){
    String digitString = "";
    for(int m = 0; m < runsForSpaces-digit; m++){ 
        //add the correct number of spaces before the block to make the blocks stacked
        digitString += " ";
    }
    for(int n = 0; n< digit*2 - 1; n++){
        //add the digits to the correct number of spaces
        digitString += digit;
    }
    //return the string for the line with the correct number of spaces
    return digitString;
  }//end of method line
    
//  declare main method
  public static void main(String []s){
    int m;
    //force user to enter int in range 1-9, inclusinve
    m = getInt();
    allBlocks(m);
  }//end of main method

} //end of class