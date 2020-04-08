public class ShapeTest{
  public static void main(String[] args){
  Shape rectangle = new Shape(5,9);
  Shape circle = new Shape(7.0);
  Shape square = new Shape(4);

  System.out.println("Area of square %d", square.getAreaSquare(square.getLength()));
   System.out.println("Area of rectangle %d", rectangle.getAreaRectagle(square.getWidth()));


   
 }

}