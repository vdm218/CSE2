//////////////////////////////////////////////////////////////////////////////
//Veronica McKinny
//hw11
//Matrix Sorter Java Program
//
//  first, compile the program
//    javac MatrixSorter.java
//  then, run the program
//    java MatrixSorter
//
//  This program should randomly generate entries in a series
//  of 3 slabs, with each slab having s(slab number) * j many
//  rows. Then, the program should sort each row in ascending
//  order, but only in the third slab. 

//  import random
import java.util.Random;

//  declare class
public class MatrixSorter{
  
//  declare main method
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }//end of main method
   
//  declare method buildMat3d
  public static int[][][] buildMat3d(){
    int threeDimensions[][][] = new int[3][][]; //initialize 3 slabs
    for(int slab = 0; slab<3; slab++){ 
        threeDimensions[slab] = new int[3 + 2*slab][]; //define how many rows are in each slab
        for(int row = 0; row<3 + 2*slab; row++){
            threeDimensions[slab][row] = new int[slab + row + 1]; //define how many columns are in each row
            for(int entry = 0; entry<(slab + row + 1); entry++){
                threeDimensions[slab][row][entry] = (int)((Math.random()*99) + 1); //set each entry to a random number in inclusive range [1,99]
            }
        }
    }
    return threeDimensions;
  } //end of buildMat3d

//  declare method show
  public static void show(int[][][] mat3d){
    for(int slab = 0; slab<3; slab++){
        System.out.println("-----------------------------Slab " + (slab+1)); //set a printed message which defines each row
        for(int row = 0; row<mat3d[slab].length; row++){
            for(int entry = 0; entry<mat3d[slab][row].length; entry++){
                System.out.print(mat3d[slab][row][entry] + " "); //print each entry with a space in between
            }
            System.out.println(); //separate each row in each slab by a line
        }
    }
  }//end of method show
  
//  declare method findMin
  public static int findMin(int[][][] mat3d){
    int min = 100; //initially set min outside of the range so that it sets first value equal to min
    for(int slab = 0; slab<3; slab++){
        for(int row = 0; row<mat3d[slab].length; row++){
            for(int entry = 0; entry<mat3d[slab][row].length; entry++){
                if(mat3d[slab][row][entry]<min){ 
                    min =mat3d[slab][row][entry]; //if an entry is lower than min, set min equal to that entry 
                }
            }
        }
    }
    return min; //return the minimum value of all 3 slabs
  }//end of method findMin

//  declare method sort
  public static void sort(int[][] mat3d){
    int row = 0, entry = 0, temp = 0, i = 0; //set values to represent each row and entry in the slap, then values to use for loops and swapping
    for(row = 0; row<mat3d.length; row++){
        for(entry = 1; entry<mat3d[row].length; entry++){
            temp = mat3d[row][entry]; //set a temp value to the entry being tested so that you can swap the array items
            for(i = entry - 1; i>=0 && mat3d[row][i]>temp; i--){
                mat3d[row][i + 1] = mat3d[row][i];
                mat3d[row][i] = temp; //use an insertion sort to swap each item in each row if it's a smaller value than the value to its left.
            }
        }
    }
    for(row = 1; row<mat3d.length; row++){
        for(i = row - 1; i>=0 && mat3d[i][0]>mat3d[i + 1][0]; i--){
            int[] tempArray = mat3d[i + 1]; //set a temp array to the array entry being tested so that can swap the array rows
            mat3d[i + 1] = mat3d[i];
            mat3d[i] = tempArray; //use an insertion sort to swap rows 
        }
    }
  }
   
}//end of class