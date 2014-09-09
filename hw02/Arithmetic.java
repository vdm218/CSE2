//////////////////////////////////////////////////////////
//Veronica McKinny
//hw02
//Arithmetic Java Program
//
//  first, compile the program
//      javac Arithmetic.java
//  then, run the program
//      java Arithmetic

//  define a class
public class Arithmetic{

//  define a main method
  public static void main(String args[]) {

    //Number of pairs of socks
    int nSocks=3;
    //Cost per pair of socks
    //('$' is part of the variable name)
    double sockCost$=2.58;
    
    //Number of drinking glasses
    int nGlasses=6;
    //Cost per glass
    double glassCost$=2.29;
    
    //Number of boxes of envelopes
    int nEnvelopes=1;
    //cost per box of envelopes
    double envelopeCost$=3.25;
    double taxPercent=0.06;
    
    //define output date
     double totalSockCost$, totalGlassCost$, totalEnvelopeCost$; 
     //the total cost for each of the three items
     double taxSock$, taxGlass$, taxEnvelope$;
     //the total tax for each of the three items.
     double totalCost$, totalTax$, totalCostAndTax$;
     //the total cost of purchase with and without tax, respectively
    
    //run the calculations; store the values. Document calculations here
    totalSockCost$=nSocks*sockCost$;
     //Above gives the number of socks multiplied by the cost of each sock
     //in order to find the total cost of all the socks
    taxSock$=totalSockCost$*taxPercent;
     //Above multiplies the total cost of socks as found earlier by the
     //percentage of tax named earlier
    totalGlassCost$=nGlasses*glassCost$;
    taxGlass$=totalGlassCost$*taxPercent;
     //Above two give data for glasses
    totalEnvelopeCost$=nEnvelopes*envelopeCost$;
    taxEnvelope$=totalEnvelopeCost$*taxPercent;
     //Above two give data for envelopes
    totalCost$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
     //Above gives the total cost of all 3 items' prices before tax
    totalTax$=taxSock$+taxGlass$+taxEnvelope$;
     //Above gives the total tax of all 3 items

    //round out numbers to give a value with only two decimal points
    taxSock$=taxSock$*100; //this allows an integer to retain all necessary values
      int a$ = (int)taxSock$; //this converts value to an integer
      double taxSockFinal$=a$;
      taxSockFinal$=taxSockFinal$/100; //this converts value to two decimal points
    taxGlass$=taxGlass$*100; 
      int b$ = (int)taxGlass$; 
      double taxGlassFinal$=b$;
      taxGlassFinal$=taxGlassFinal$/100; 
    taxEnvelope$=taxEnvelope$*100;
      int c$ = (int)taxEnvelope$;
      double taxEnvelopeFinal$=c$;
      taxEnvelopeFinal$=taxEnvelopeFinal$/100;
    totalTax$ = totalTax$*100;
      int d$ = (int)totalTax$;
      double totalTaxFinal$ = d$;
      totalTaxFinal$=totalTaxFinal$/100;
      
    //Calculate the final cost of the total purchase
    //now that everything has been rounded properly.
    totalCostAndTax$=totalCost$+totalTaxFinal$;
    //Above adds the totalTax to the totalCost in order to give full 
    //price of purchase
    
    
    //print out the necessary data
    System.out.println("Socks:");
     System.out.println("There are " + nSocks + " socks being purchased.");
     System.out.println("Each sock costs $" + sockCost$ + ".");
     System.out.println("The total cost of socks for this purchase is $"
     + totalSockCost$ + ".");
     System.out.println("The cost of socks comes with a sales tax of $" 
     + taxSockFinal$ + ".");
    System.out.println("Glasses:");
     System.out.println("There are " + nGlasses +
     " glasses being purchased.");
     System.out.println("Each glass costs $" + glassCost$ + ".");
     System.out.println("The total cost of glasses for this purchase is $"
     + totalGlassCost$ + ".");
     System.out.println("The cost of glasses comes with a sales tax of $"
     + taxGlassFinal$ + ".");
    System.out.println("Envelopes:");
     System.out.println("There is " + nEnvelopes + 
     " envelope being purchased.");
     System.out.println("Each envelope costs $" + envelopeCost$ + ".");
     System.out.println("The total cost of envelopes for this purchase is $"
     + totalEnvelopeCost$ + ".");
     System.out.println("The cost of envelopes comes with a sales tax of $"
     + taxEnvelopeFinal$ + ".");
    System.out.println("The total cost of the purchase, sans tax, is $"
    + totalCost$ + ".");
    System.out.println("The total sales tax is $" + totalTaxFinal$ + ".");
    System.out.println("The total cost of the purchase, with tax, is $"
    + totalCostAndTax$ + ".");
    

      
  } //end of main method
  
} //end of class