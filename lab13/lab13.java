/////////////////////////////////////////////////////////////////////////
//Veronica McKinny
//lab13
//Lab 13 Java Program
//
//  This program should create a multidimensional array;
//  specifically, a two dimensional ragged array.
//  Each array length is equal to i*3 + 5. Each array is
//  filled with random numbers 0-39, inclusive, and is
//  in ascending order.

//  import Random
import java.util.Random;

//  declare class
public class lab13{

//declare main method
  public static void main(String args[]){
    int[][] array = new int[5][];
    int[][] lowest = new int[5][];
    int i = 0, j = 0, k = 0;
    for(i = 0; i<5; i++){ //make array ragged
        array[i] = new int[5 + (3*i)];
        lowest[i] = new int[5 + (3*i)];
        for(j = 0; j<(5+(3*i)); j++){ //make each member random
            array[i][j] = (int)(Math.random()*40);
            lowest[i][j] = 0;
        }
    }
    int low = 0, spot=0;
    for(i = 0; i<5; i++){
        for(j=0; j<5+(3*i); j++){
            low = array[i][j]; //set a variable equal to variable you're testing
            for(k=0; k<5+(3*i); k++){
                if(array[i][k]<low){ //test variable testing against all other variables in array
                    spot++;
                }
            }
            for(int l = spot; l<5+(3*i); l++){
                if(lowest[i][spot]!=0){
                    spot++; //this is to make sure all duplicates are placed
                }
                else{
                    lowest[i][spot] = array[i][j]; //set first array to ordered array
                    break;
                }
            }
            spot=0;
        }
    }
    for(i = 0; i<5; i++){
        for(j=0; j<5+(3*i); j++){
            array[i][j]=lowest[i][j];
            System.out.print(array[i][j] + " ");
        }
        System.out.println();
    }
    
  }//end of main method
}//end of class