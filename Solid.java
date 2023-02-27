import java.util.Scanner;

// Applied Clean Code Principles

abstract class Shape {
  public abstract void setDimensions(int width, int height);
  public abstract int getWidth();
  public abstract int getHeight();
  public abstract int getArea();
}

class Rectangle extends Shape {
  private int width;
  private int height;
 
  public void setDimensions(int width, int height){
    this.width = width;
    this.height = height;
  }
 
  public int getWidth() {
    return width;
  }
 
  public int getHeight() {
    return height; 
  }
 
  public int getArea() {
    return width * height;
  } 
}

class Square extends Shape {
  private int sideLength;
  
  public void setDimensions(int sideLength, int ignored){
    this.sideLength = sideLength;
  }
 
  public int getWidth() {
    return sideLength;
  }
 
  public int getHeight() {
    return sideLength; 
  }
 
  public int getArea() {
    return sideLength * sideLength;
  } 
}

public class Solid {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      // Create a new Rectangle
      Shape rectangle = new Rectangle();
      System.out.print("Enter width of rectangle: ");
      int rectangleWidth = sc.nextInt();
      System.out.print("Enter height of rectangle: ");
      int rectangleHeight = sc.nextInt();
      rectangle.setDimensions(rectangleWidth, rectangleHeight);
      System.out.println("Area of rectangle: " + rectangle.getArea());
      
      // Create a new Square
      Shape square = new Square();
      System.out.print("Enter length of square: ");
      int squareLength = sc.nextInt();
      square.setDimensions(squareLength, 0);
      System.out.println("Area of square: " + square.getArea());
    }
  }
}
