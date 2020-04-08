/*
*Author: Raphael
*Program: Takes two numbers to determine the highest number
*Date: march 02, 2020
*/

import java.util.Scanner;
public class GreaterThan{
       public static void main(String[] args){
       //prompt user for input
       System.out.println("Enter First Number:");
       
       //get user input
       Scanner input = new Scanner(System.in);
       //store user input
       int userInputOne = input.nextInt();
       

       //prompt user for input
       System.out.println("Enter Second Number:");
       
  
       //store user input
       int userInputTwo = input.nextInt();

       //test to see if first input is greater than second
       if(userInputOne > userInputTwo){
            //display result
           System.out.printf("The greater number is %d %n", userInputOne);
           //test to see if second input is greater than first
         }else if(userInputTwo > userInputOne){
           //display result
          System.out.printf("The greater number is %d %n", userInputTwo);
          //output invalid inputs
         }else{
          System.out.println("Numbers are Equal");
         }
       




      }

}