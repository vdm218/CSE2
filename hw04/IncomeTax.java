/////////////////////////////////////////////////////////////////////////////////////////
//Veronica McKinny
//hw04
//Income Tax Java Program
//
//	first, compile the program
//		javac IncomeTax.java
//	then, run the program
//		java IncomeTax
//
//	This program should, when a user inputs
//	an income in thousands of dollars,
//	print the amount of tax on the income
//	given a programmed progressive schedule.

//	import Scanner
import java.util.Scanner;

//	declare a class
public class IncomeTax{

//	declare a main method
  public static void main (String args[]){

  //declare instance of Scanner
  Scanner myScanner;
  //construct instance of Scanner
  myScanner = new Scanner(System.in);  

	//prompt user for an income (in thousands)
	System.out.print("Enter an int giving the "
	 + "income in number of thousands: ");
	
	//check to see if user entered an int
	if(myScanner.hasNextInt()){
	}
		else{
			System.out.println("You did not "
			  + "enter an int.");
			return;	//terminate, or leave, program
		}
	int income = myScanner.nextInt();
	if(income<=0){
		System.out.println("You did not enter "
		 + "a positive int.");
		return; //terminate, or leave, program
	}
	
	//declare tax rate and tax
	double taxRate =0.00;
	double tax;
	//determine the tax rate
	if (income<20){
	    taxRate=0.05;
	}//end of outer if
	else if(income>=20 && income<40){
	    taxRate=0.07;
	}//end of else if
	else if(income>=40 && income<78){
	    taxRate=0.12;
	}//end of else if
    else if(income>=78){
	    taxRate=0.14;  
	}//end of else if

    //calculate the tax
    double incomeF =income*1000;
    tax=taxRate*incomeF;
    taxRate *=100;
    //make sure results print out with the
    //proper number of decimal points
    int x = (int)taxRate*100;
    double taxRateFinal= x;
    taxRateFinal /=100;
    int y = (int)tax*100;
    double taxFinal = y;
    taxFinal /=100;
    
    //print out tax rate
    System.out.println("The tax rate on $"
     + income + ",000 is " + taxRateFinal + "%, and"
     + " the tax is $" + taxFinal);
  
  }//end of main method
 }//end of class