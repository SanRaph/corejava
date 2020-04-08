/*
*Author: Raphael
*Program: Deferential Calculus.
*/

//import the class Scanner
import java.util.Scanner;

//Write the class of DeferentialCalculusFormula

public class DeferentialCalculusFormula{
      
      
       //Write the formula method that accept user input x
       public int formula( int x ){
          /* 
          *translate calculus formula into code
          *Formula: Slope ~ f(x-change in x)-f(x)
          */

            //save the slope into slope variable
           int slope = 0;
               slope = x-(x-x) - x / x - x;

               //return the slope
              return slope;


       }


       //Write the method limit that takes user input x to determine function limit
       public int limit( int x ){

              //test to see if user input x is zero
             if( x == 0 ){
              
               //if truely 0, get the xpression into limitstr and output it
               String limitstr = "f(x + deltax) - f(x)/deltax lim -> 0";
               System.out.println("The Slope of" + limitstr + "." );



             }

             //return the method with argument of user input
             return limit(x);
       }


      /*Write the main method now*/

      public static void main(String[] args){
      
      //prompt user for input
      System.out.println("Input Number:");
      //store user input
      Scanner input = new Scanner(System.in);
      //get user input in store(input) and save it in the variable x of type int
      int x = input.nextInt();
      
       //test to see if user input is not 0
      if(x != 0){
      /*if not 0,create a new instance of the class to access and display formula           *method 
      */
      System.out.println("The Slope ~ " + new DeferentialCalculusFormula().formula(       x ) + ".");
       /*if 0,if not 0,show string and create a new instance of the class to access        *and display formula
       */ 
      } else {
       System.out.println("Displaying:"+ new DeferentialCalculusFormula().limit(x) );

      }
  }



}