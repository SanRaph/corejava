/*
*Program: Collects name, two numbers, then add and display result
*as Johnson the result of n and x is y.
*/
import java.util.Scanner;

public class Addition{
       public static void main(String[] args){
       System.out.println("Please Enter Name:");
       Scanner input = new Scanner(System.in);

       String userName = input.next();

       System.out.println("Please Enter First Number:");
       int firstNumber = input.nextInt();

       System.out.println("Please Enter Second Number:");
       int secondNumber = input.nextInt();

       int sum = firstNumber + secondNumber;

       System.out.printf("%s, the result of  %d and %d is %d. %n",            userName, firstNumber, secondNumber, sum);




       }

}