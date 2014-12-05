//////////////////////////////////////////////////////////////////////////////
//Veronica McKinny
//lab10
//Method Calls Java Program
//
//  first, compile the program
//      javac MethodCalls.java
//  then, run the progarm
//      java MethodCalls
//
//  This program should print out a series of combinations of 
//  digits that add together the digits either as integers
//  or strings.

//  delcare class
public class MethodCalls{
    
//declare method addDigit
    public static int addDigit(int number, int digit){
        int countNegative = 0; //test for negativity
        if(number<0){ //if number is negative
            number = Math.abs(number);
            countNegative++;
        }
        String numberString = ""+number; //make number the string
        if(digit>0 && digit<9){ //test that 2nd number is a digit
            numberString = digit + numberString; //if digit, add it to front of number
        }
        if (countNegative>0){ //if number was negative, make string negative
            numberString = "-" + numberString;
        }
        number = Integer.parseInt(numberString); //converty the string to an int
        return number; //return the result
    }//end of method addDigit

//declare method join
    public static int join(int first, int second){
        int countNegativeJoin =0; //test both numbers for negativity
        String digitString;
        int numberJoin;
        if(second>0&&second<9){ //can only run addDigit if second number is a digit
            numberJoin = addDigit(first,second);
        }
        else{ //if second number is not a digit, paste the two numbers together
            if(first<0){ //test first number for negativity
                first = Math.abs(first);
                countNegativeJoin++;
            }
            if(second<0){ //test second number for negativity
                second = Math.abs(second);
                countNegativeJoin++;
            }
            digitString = "" + first + second;
            if((countNegativeJoin%2)!=0){ //test for numeric addition of negatives
                digitString = "-" + digitString;
            }
            numberJoin = Integer.parseInt(digitString);
        }
        return numberJoin;
    }
    
//  declare a main method
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }//end of main method
    
}//end of class