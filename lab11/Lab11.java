////////////////////////////////////////////////////////////////
//Veronica McKinny
//lab11
//Lab11 Java Program
//
//  This program should force the user to enter 10 ints
//  into an array, then find the lowest entry, the highest
//  entry, and the sum of the integers in the array, then
//  order the ints from highest to lowest and lowest to highest

//  import Scanner
import java.util.Scanner;

//  declare class
public class Lab11{
    
//  declare a main method
  public static void main(String args[]){
    //declare and construct instance of Scanner
    Scanner myScanner = new Scanner(System.in);
    int[] userInt = new int[10];
    System.out.print("Enter 10 ints: ");
    for(int i = 0; i<10; i++){
        while(!myScanner.hasNextInt()){
            System.out.println();
            System.out.print("You did not enter an int; try again: ");
            String getRidOf = myScanner.next();
        }
        userInt[i] = myScanner.nextInt();
    }
    int arrayLowest = userInt[0];
    for(int j = 0; j<10; j++){
        if(userInt[j]<arrayLowest){
            arrayLowest = userInt[j];
        }
    }
    System.out.println("The lowest entry is " + arrayLowest);
    int arrayHighest = userInt[0];
    for(int k = 0; k<10; k++){
        if(userInt[k]>arrayHighest){
            arrayHighest = userInt[k];
        }
    }
    System.out.println("The highest entry is " + arrayHighest);
    int sum = 0;
    for(int l = 0; l<10; l++){
        sum += userInt[l];
    }
    System.out.println("The sum is " + sum);
    /*int[] arraySortLowest = new int[10];
    int[] arraySortHighest = new int[10];
    for(int m = 0; m<10; m++){
        int counterLowest = 0, counterHighest = 0;
        for(int n=0; n<10; n++){
            if(userInt[m]<userInt[n]){
                counterLowest++;
            }
            if(userInt[m]>userInt[n]){
                counterHighest++;
            }
        }
        arraySortLowest[m]= userInt[counterLowest];
        arraySortHighest[m] = userInt[counterHighest];
    }
    for(int o = 0; o<10; o++){
        System.out.println(" " + arraySortLowest[o]
        + "  " + arraySortHighest[o]);
    }
    
    So I may or may not have accidentally done the wrong thing
    but I'm really proud of my code so I'm keeping it in
    comments #yolo #IShouldActuallyReadTheInstructions*/
    for(int m = 0; m<10; m++){
        System.out.printf(" " + "%-7s%-7s\n", userInt[m], userInt[9-m]);
    }
    
    
  }//end of main method
}//end of class






















