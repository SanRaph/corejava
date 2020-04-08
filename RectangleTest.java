/*
*Author: Raphael
*Program: Testing Rectangle class
*/
import java.util.Scanner;
public class RectangleTest{
        public static void main(String[] args){
        
        System.out.println("Enter Length:");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        System.out.println("Enter Width:");
        int width = input.nextInt();
        

        Rectangle rectangleObj = new Rectangle();
        rectangleObj.setLength(length);
        rectangleObj.setLength(width);

        System.out.printf("The Area is %d and the Perimeter is %d", rectangleObj.rectangleArea(), rectangleObj.rectanglePerimeter());

        }

}