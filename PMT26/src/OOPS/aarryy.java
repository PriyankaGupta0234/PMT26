package OOPS;
//Shape.java
abstract class Shape {
 protected int width;
 protected int height;

 public Shape(int width, int height) {
     this.width = width;
     this.height = height;
 }

 abstract void draw();
}

//Rectangle.java
class Rectangle extends Shape {
 public Rectangle(int width, int height) {
     super(width, height);
 }

 @Override
 void draw() {
     for (int i = 0; i < height; i++) {
         for (int j = 0; j < width; j++) {
             System.out.print("* ");
         }
         System.out.println();
     }
 }
}

//Triangle.java
class Triangle extends Shape {
 public Triangle(int height) {
     super(height, height);
 }

 @Override
 void draw() {
     for (int i = 0; i < height; i++) {
         for (int j = 0; j <= i; j++) {
             System.out.print("* ");
         }
         System.out.println();
     }
 }
}

//Main.java
public class aarryy {
 public static void main(String[] args) {
     Shape rectangle = new Rectangle(5, 3);
     System.out.println("Rectangle:");
     rectangle.draw();
     
     System.out.println();
     
     Shape triangle = new Triangle(5);
     System.out.println("Triangle:");
     triangle.draw();
 }
}
