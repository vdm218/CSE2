///////////////////////////////////////////////////////////////////////////////
//Veronica McKinny
//hw10
//Find Duplicates Java Program
//
//  This program should, based on an array of user input containing
//  10 ints, print out whether the array has duplicates and whether
//  the array has exactly one duplicate based on two methods,
//  hasDups and exactlyOneDup

//  import Scanner
import java.util.Scanner;

//  declare class
public class FindDuplicates{
    
//  declare main method
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- "); //prompt user
      for(int j=0;j<10;j++){ //store each of the next 10 ints in an array
        num[j]=scan.nextInt();
        //assumes user only enters ints
      }
      String out="The array "; //creating a string with all of the necessary info
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){ 
        out+="has "; //if there are dups, add such to the string
      }
      else{
        out+="does not have "; //if no dups, add such to the string
      }
      out+="duplicates."; //add unit to the string so it makes sense
      System.out.println(out);
      out="The array "; //restart string
      out+=listArray(num); //return a string in the form "{2, 3, -9}"
      if(exactlyOneDup(num)){ 
        out+="has "; //if there is exactly one pair of dups, add such to string
      }
      else{
        out+="does not have "; //if not exactly one pair of dups, add such to string
      }
      out+="exactly one duplicate."; //add unit to string so it makes sense
      System.out.println(out); //print out all of what was added to string
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y")); //only continue if user enters 'y' or 'Y'
  }//end of main method

//  declare method listArray
  public static String listArray(int num[]){
    String out="{"; //start string
    for(int j=0;j<num.length;j++){
      if(j>0){ //add commas for all after first digit
        out+=", ";
      }
      out+=num[j]; //add each number in the array to this string
    }
    out+="} "; //end with a bracket
    return out; //return the string with all of the numbers in the array listed in the proper form
  }//end of listArray

//  declare method hasDups
  public static boolean hasDups(int[] userArray){
      int countDups = 0; 
      for(int i = 0; i<10; i++){ //check for each number...
          for(int j = i+1; j<10; j++){ //...if each number further in the array than it is a duplicate
              if(userArray[i]==userArray[j]){
                  countDups++; 
              }
          }
      }
      if(countDups==0){ //when countDups==0, no duplicates were found
          return false; //say none were found
      }
      else{ //if countDups>0, duplicates were found
          return true; //say some were found
      }
  }//end of hasDups

//  declare method exactlyOneDup
  public static boolean exactlyOneDup(int[] userArray){
      int countDups = 0;
      for(int i = 0; i<10; i++){ //for each number in the array...
          for(int j = i+1; j<10; j++){ //...compare with each number further in the array
              if(userArray[i]==userArray[j]){
                  countDups++; 
              }
          }
      }
      if(countDups!=1){
          return false; //either no or more than one duplicate[s] were found
      }
      else{
          return true; //exactly one dup was found
      }
  }
  
}//end of class
