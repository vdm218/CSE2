///////////////////////////////////////////////////////
//Veronica McKinny
//lab12
//Array Math Java Program
//
//  This program should use methods to determine if two arrays
//  have the same content/use the same amount of memory and be
//  able to add the respective values of different arrays together.

//  declare class
public class ArrayMath{

//  declare main method
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
        y[]={2.3, 3, 4, -2.1, 82, 23},
        z[]={2.3, 13, 14},
        w[]={2.3, 13, 14, 12}, 
        v[],
        u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }//end of main method

//  declare method display  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
        if(j>0){
            out+=", ";
        }
        out+=x[j];
    }
    return out+"}";
  }//end of display
  
//  declare method equals
  public static boolean equals(double[] arrayOne, double[] arrayTwo){
    int testTruth = 0; //if this doesn't equal zero at end, it's false
    if(arrayOne.length == arrayTwo.length){
        for(int i = 0; i<arrayOne.length; i++){
            if(arrayOne[i]!=arrayTwo[i]){
                testTruth++;
            }
        }
    }
    else{
        testTruth++;
    }
    if(testTruth==0){
        return true;
    }
    else{
        return false;
    }
  }//end of equals
  
//  declare method addArrays
  public static double[] addArrays(double[] arrayFirst, double[] arraySecond){
    double[] finalArray;
    int i = 0; //int for running loops
    if(arrayFirst.length>arraySecond.length){
        finalArray = new double[arrayFirst.length];
        for(i = 0; i<arraySecond.length; i++){
            finalArray[i] = arrayFirst[i] + arraySecond[i];
        }
        for(i = arraySecond.length; i<arrayFirst.length; i++){
            finalArray[i] = arrayFirst[i];
        }
    }
    else if(arrayFirst.length<arraySecond.length){
        finalArray = new double[arraySecond.length];
        for(i=0; i<arrayFirst.length; i++){
            finalArray[i] = arrayFirst[i] + arraySecond[i];
        }
        for(i = arrayFirst.length; i<arraySecond.length; i++){
            finalArray[i] = arraySecond[i];
        }
    }
    else{
        finalArray = new double[arrayFirst.length];
        for(i=0; i<arrayFirst.length; i++){
            finalArray[i] = arrayFirst[i] + arraySecond[i];
        }
    }
    return finalArray;
  }//end of addArrays

}//end of class
