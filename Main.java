//Create a Shape class and derived classes like Circle, Rectangle, and Triangle. Each shape should have methods to calculate area and perimeter. Implement a method in the Shape class that takes an array of shapes and calculates the total area and perimeter of all shapes using polymorphism. Test your program with different combinations of shapes.
package com.array;
abstract class Shape{
	public abstract double area(); 
	public abstract double perimeter();
	public static void calculateTotal(Shape[] shapes) {
		double totalArea=0;
		double totalPerimeter=0;
		for(Shape s:shapes) {
			totalArea=totalArea+s.area();
			totalPerimeter=totalPerimeter+s.perimeter();
		}
		System.out.println("total Area:"+totalArea);
		System.out.println("total Perimeter:"+totalPerimeter);
	}
}
 class Circle extends Shape{
	double radius;
	public Circle(double r) {
		this.radius=r;
	}
	public double area() {
		return 3.14*radius*radius;
	}
	public double perimeter() {
		return 2*3.14*radius;
	}
}
 class Rectangle extends Shape {
	 int length;
	 int breadth;
	 public Rectangle(int l,int b) {
		 this.breadth=b;
		 this.length=l;
	 }
	 public double area() {
		 return length*breadth;
	 }
	 public double perimeter() {
		 return length+breadth;
	 }
	 
 }
 class Triangle extends Shape{
	 int side;
	 public Triangle(int s) {
		 this.side=s;
	 }
	 public double area() {
		 return side*side;
	 }
	 public double perimeter() {
		 return side+side+side;
	 }
	 
 }
public class Main {
	

	public static void main(String[] args) {
	  Shape s1=new Circle(5);
	  Shape s2=new Rectangle(10,5);
	  Shape s3=new Triangle(5);
     Shape[] s= {s1,s2,s3};
     Shape.calculateTotal(s);
	}

}
