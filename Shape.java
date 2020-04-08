public class Shape{
       private double radius;
       private int length;
       private int width;


       public Shape(double radius){
              this.radius = radius;

       }
       public Shape(int width, int length){
              this.width = width;
              this.length = length;
      
       }
       public Shape(){
         this.length = length;
       }

       public void setRadius(double radius){
        this.radius = radius;

       }
       public double getRadius(){
        return radius;
 
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
       public int getAreaRectangle(){
         int result = width * length;
         return result;
       }

       public double getAreaCircle(double radius){
          return 3.142 * radius * radius;
 
       }

       public getAreaSquare(int length){
         return length * length;
       }





}