/*
*Program: Collects number and tell user if number is Even or Odd.
*/
import java.util.Scanner;
public class EvenOdd{
       public static void main(String[] args){
       System.out.println("Please Enter Any Number:");

       Scanner input = new Scanner(System.in);
       int userInput = input.nextInt();

       int result = userInput % 2;

       if(result == 0){
            System.out.println("Number is EVEN");
       }
       else{
            System.out.println("Number is ODD");
       }




       }



}