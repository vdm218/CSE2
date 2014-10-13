////////////////////////////////////////////////////////////////////////
//Veronica McKinny
//lab06
//Enigma 2 Java Program

import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
          break;
      case 13: out+="13";
          break;
      case 40: out+="40/0";
          break;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 *   The exception that appears in the error message is that you
 *   cannot divide by zero, and that this is an arithmetic exception.
 *   Because of this, if you either put the expression in quotes or
 *   get rid of the division by zero, the code should then run properly.
 * 
 */
