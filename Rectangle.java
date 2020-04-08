/*
*Create a Rectangle with attributes length and width. Write Methods to
*set and get the value of the attributes. Also write a method that
*will calculate the Area of the rectangle, and perimeter of the *rectangle. All inputs should be collected from console:
*Area = L * W 
*Perimeter = 2L + 2W
*/


public class Rectangle{
        private int length;
        private int width;

        public int rectangleArea(){

        int area = length * width;
          return area;

        }

        public int rectanglePerimeter(){

         int perimeter = (2*length) + (2*width);

         return perimeter;
        }


        public void setLength(int length){
          this.length = length;


        }

        public int getLength(){
         return length;
        }


        public void setWidth(int width){
          this.width = width;
        }

        public int getWidth(){
        
        return width;

        }



}