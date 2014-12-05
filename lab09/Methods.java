////////////////////////////////////////////////
//Veronica McKinny
//lab09
//Methods Java Program
//
//  first, compile the program
//      javac Methods.java
//  then, run the program
//      java Methods
//
//  This program should, based on user input,
//  run a series of methods to analyze the 
//  user input. Then, it should print out
//  a series of statements, based on which 
//  numbers the user inputted are higher and 
//  whether or not the numbers were inputted in
//  ascending order.

//  import Scanner
import java.util.Scanner;

//  declare class
public class Methods{
    
//  declare method getInt
  public static int getInt(Scanner x){
    int i=0; //set int for output
    System.out.print("Enter an int: "); //prompt user
    if(x.hasNextInt()){ //confirm user inputs int
        i = x.nextInt(); //accept user input for int
    }
    else{ //keep asking user for input until they give an int
        while(!x.hasNextInt()){
            System.out.println("You did not enter "
            + "an int; try again.");
            String getRidOf=x.next();
            System.out.print("Enter an int: ");
            if(x.hasNextInt()){
                i = x.nextInt();
                break;
            }
        }
    }
    return i; //return output
  }//end of method getInt

//  declare method larger
  public static int larger(int intA, int intB){
    int largerInteger = 0;
    if(intA>intB){
        largerInteger=intA;
    }
    else{
        largerInteger=intB;
    }
    return largerInteger;
  }//end of method larger
  
//  declare method ascending
  public static boolean ascending(int numA, int numB, int numC){
    boolean result = true;
    if(numA<numB && numB<numC){
        result = true;
    }
    else{
        result = false;
    }
    return result;
  }//end of method ascending

//  declare main method
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three ints");
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
  }//end of main method
  
}//end of class