/*
*Author: Raphael
*Program: Circle class Test
*/

import java.util.Scanner;

public class CircleTest{
       
       public static void main(String[] args){

       System.out.println("Enter Radius:");

       Scanner input = new Scanner(System.in);
       int radius = input.nextInt();


       Circle circleObj = new Circle();
       circleObj.setRadius(radius);

       System.out.println(circleObj.calculateCircum());
       

       



      }
       

}