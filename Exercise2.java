/*
*Program: Write a code that collects UserName and greet the user.
*/
import java.util.Scanner;
public class Exercise2{
       public static void main(String[] args){
       String welcome = "Welcome";

       System.out.println("Please Enter Your Name:");
       Scanner input = new Scanner(System.in);
       
       String userName = input.next();

       System.out.printf("%s %s %n", welcome, userName);

       }

}