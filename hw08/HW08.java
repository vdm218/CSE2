///////////////////////////////////////////////
//Veronica McKinny
//hw08
//HW08 Java Program
//
//  first, compile the program
//      javac HW08.java
//  then, run the program
//      java HW08
//
//  This program should present a series of choices
//  to the user, forcing the user to pick one of 
//  them. If the user doesn't pick one of the given
//  choices, they should be forced to pick again.
//  Otherwise, the program should print out what the
//  user chose. 


//  declare Scanner
import java.util.Scanner;

//  declare class
public class HW08{
  
//  declare useful method getChar
  //this method forces the user to enter exactly one char
  //and returns which char the user enters
  public static char getChar(Scanner nyanCat){
    String userFirst = nyanCat.next(); //accept user input
    int userFirstLength = userFirst.length(); //determine length of user input
    char userFirstChar = 'y';
    while(userFirstLength != 1){ //force user to re-enter value if input longer than one char
        System.out.print("You should enter exactly one character- ");
        userFirst = nyanCat.next();
        userFirstLength = userFirst.length();
    }
    userFirstChar = userFirst.charAt(0);
    return userFirstChar; //return the user input
  }//end of getChar

//  declare useful method checkChar
  //this method determines whether or not what the user entered matches 
  //up with one of the entries in the string
  public static boolean checkChar(char test, String acceptableInput){
    int count = 0; 
    for(int j=0; j<acceptableInput.length(); j++){
        if(test==acceptableInput.charAt(j)){//compare user input with each char in string
            count++; //if the char matches, add one to an integer
        }
    }
    if (count>0){ 
        //if count>0, then the user input matched with 
        //at least one char in the acceptable string.
        return true;
    }
    else{
        return false;
    }
  }//end of method checkChar
    
//  declare first method getInput 
  public static char getInput(Scanner xMen, String conTinue){
    char firstUser = getChar(xMen); //accept the user input
    boolean checkTruth = checkChar(firstUser, conTinue); //if the user input is incorrect, keep this true
    while(!checkTruth){ //keep running until user enters C or c
        System.out.print("You did not enter a character from "
        + "the list " + conTinue + "; try again- ");
        firstUser=getChar(xMen);
        checkTruth = checkChar(firstUser, conTinue);
    }
    return firstUser;
  }//end of first method getInput
  
//  declare second method getInput
  public static char getInput(Scanner xRay, String YyNn, int runs){
    char secondUser = getChar(xRay);//accept the user input
    char resultSecondMethod = ' ';
    for(int i=0; i<runs; i++){ //run test "runs" times
        if(!checkChar(secondUser, YyNn)){ 
          //prompt user again if input isn't accpetable
            System.out.print("You did not enter a character from "
            + "the list " + YyNn + "; try again- ");
            secondUser=getChar(xRay);
        }
        else{
          //since input was correct, set value to be returned
          //equal to the user input
            resultSecondMethod = secondUser; 
        }
    }//end of five trials in for loop
    if(resultSecondMethod == ' '){ //tell user they failed
        System.out.println("You failed after " + runs + " tries.");
    }
    return resultSecondMethod;
  }//end of second method getInput

//declare third method getInput
  public static char getInput(Scanner xWing, String instructions, String digits){
      System.out.println(instructions); //print out the instructions
      char numbersYay; 
      String giveDigits = "Enter one of: ";
      //set up string to print out the acceptable characters
      for(int j=0; j<digits.length()-1; j++){ //add each char in quotes to the string
          numbersYay = digits.charAt(j);
          giveDigits += "\'" +numbersYay+"\',";
      }
      numbersYay= digits.charAt(digits.length()-1); //add a dash to the string
      giveDigits += "\'" + numbersYay+ "\'- ";
      System.out.print(giveDigits); //print out acceptable characters
      //now test for user input
      char thirdUser = getChar(xWing);
      while(!checkChar(thirdUser, digits)){
        //if user input isn't acceptable, re-ask user for input and test again
          System.out.println("You did not enter an accpetable character.");
          System.out.println(instructions);
          System.out.print(giveDigits);
          thirdUser =getChar(xWing);
      }
      return thirdUser;
  }
    
//  declare main method
  public static void main(String []arg){
	char input; //create char that changes based on user input
	Scanner scan=new Scanner(System.in); //construct and declare instance of Scanner
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); //ask user to continue
	input=getInput(scan,"Cc"); //set input equal to what the user gives as input
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); //ask user for yes or no
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){ //only run message if user gave proper response
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  } //end of main method
  
} //end of class
