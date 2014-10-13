///////////////////////////////////////////////////////////////
//Veronica McKinny
//lab06
//Enigma 0 Java Program
//

/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

//  import Scanner
import java.util.Scanner;

//  declare class
public class Enigma0{
    
//  declare main method
  public static void main(String arg []){
      
    //deal with user input
    System.out.print("Enter an int- "); //prompt user for an int
    //declare and construt instance of Scanner
    Scanner scan = new Scanner(System.in);
    
    int n = 0;
    if(scan.hasNextInt()){
      n = scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24:
      case 25: 
            System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report:
 *   In this program, there was an error in the
 *   scope of integer n. The int n was defined 
 *   first in the if statement, but was also
 *   referenced in the else statement and 
 *   the switch statement. To fix this, I defined
 *   and initialized n before the if statement
 *   so it had a global scope, able to be referenced
 *   in all of the places that need to access it.
 *   Then, I set it to what it needed to be in
 *   the if/else. I also got rid of the declaration
 *   of n before the switch statement as it had
 *   already been declared and initialized.
 *   
 *   I also arbitrarily added comments at random
 *   points so I could know what was happening at
 *   any given point in the code.
 */
