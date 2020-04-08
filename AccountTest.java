/*
*Author: Raphael
*Program: Test the class Account
*/
import java.util.Scanner;
public class AccountTest{
        public static void main(String[] args){
        System.out.println("Enter Name:");

        Scanner input = new Scanner(System.in);
        String userFirstName = input.next();

        
        Account obj = new Account();
        obj.setFirstName(userFirstName);
        obj.setLastName("Yusuf");
        

        }



}