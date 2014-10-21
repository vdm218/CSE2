/////////////////////////////////////////////////////////
//Veronica McKinny
//hw07
//Number Stack Java Program
//
//  first, compile the program
//      javac NumberStack.java
//  then, run the program
//      java NumberStack
//
//  This program should, based on user input,
//  print out a series of squares whose size
//  and number changes depending on the user
//  input using for, while, and do-while loops.

//  import Scanner
import java.util.Scanner;

//  declare a class
public class NumberStack{
    
//  declare a main method
  public static void main (String args[]){

    //declare and construct instance of Scanner
    Scanner myScanner = new Scanner(System.in);
    
    //get user input
    
    int user = 0;
    while(user<1||user>9){
        System.out.print("Enter a number "
        + "between 1 and 9: "); //prompt user
        if(myScanner.hasNextInt()){ //check for int
            user=myScanner.nextInt();
            if(user<1||user>9){ //check for proper range
                System.out.println("You " +
                "did not enter an int in the"
                + " range [1,9].");
            }
        }
        else{ //get rid of input if not an int
            System.out.println("You did not "
            + "enter an integer.");
            String getRidOf = myScanner.next();
        }
    }
    
    //perform the boxes using for loops
    System.out.println("Using for loops: ");
    String space="", num="", dash="";
    for (int i = 1; i<=user; i++){
    //go through and print each number from 1 to user
        //determine the number of spaces for value i
        for(int iSpace=0; iSpace<user-i; iSpace++){
            space+=" ";
        }
        //determine how many of i and - to print
        for(int iAdd = 0; iAdd<i*2-1; iAdd++){
            num+=i;
            dash+="-";
        }
        //print i lines of i w/ proper spaces
        for(int iPrint = 0; iPrint<i; iPrint++){
            System.out.println(space+num);
        }
        //print the dashes
        System.out.println(space+dash);
        //reset the loop for the next run
        space="";
        num="";
        dash="";
    }
    
    //perform the boxes using only while loops
    System.out.println("Using while loops: ");
    space=""; 
    num="";
    dash="";
    //run the loop so that each block for each
    //number between 1 and user is formed
    int j=1, jSpace=0, jAdd=0, jPrint=0;
    while(j<=user){
    //go through and print each number from 1 to user
        //determine the number of spaces for value j
        while(jSpace<user-j){
            space+=" ";
            jSpace++;
        }
        //determine how many of j and - to print
        while(jAdd<j*2-1){
            num+=j;
            dash+="-";
            jAdd++;
        }
        //print j lines of j w/ proper spaces
        while(jPrint<j){
            System.out.println(space+num);
            jPrint++;
        }
        //print the dashes
        System.out.println(space+dash);
        //reset the loop for the next run
        space="";
        num="";
        dash="";
        jSpace=0;
        jAdd=0;
        jPrint=0;
        j++;
    }
    
    //perform the boxes using do-while loops
    System.out.println("Using do-while loops: ");
    space=""; 
    num="";
    dash="";
    //run the loop so that each block for each
    //number between 1 and user is formed
    int k=1, kSpace=0, kAdd=0, kPrint=0;
    do{
    //go through and print each value from 1 to user
        //determine number of spaces for value k
        if(user!=k){
            //run if to ensure that bottom block isn't 
            //always pushed 1 space over 
            do{
                space+=" ";
                kSpace++;
            }while(kSpace<user-k);
        }
        //determine how many of k and - to print
        do{
            num+=k;
            dash+="-";
            kAdd++;
        }while(kAdd<k*2-1);
        //print k lines of k w/ proper spaces
        do{
            System.out.println(space+num);
            kPrint++;
        }while(kPrint<k);
        //print out the dashes
        System.out.println(space+dash);
        //reset the loop for the next run
        space="";
        num="";
        dash="";
        kSpace=0;
        kAdd=0;
        kPrint=0;
        k++;
    }while(k<=user);
    
    
    
      
  }//end of main method
  
}//end of class