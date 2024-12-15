public abstract class Shape {
	private double b,h;
	public Shape() {
		b=h=0;
	}
	public Shape(double b)
	{
		this.b=b;
		b=h;
		
	}
	public Shape(double b, double h) 
	{
		this.b=b;
		this.h=h;
		
	}
	public abstract double area();
	public double getH()
	{
	return h;
	}
	public double getB()
	{
		return b;
		
	}
	}



public class Rectangle extends Shape
	{
	double a;
	public Rectangle()
	{
		
	}
	public Rectangle(double length, double breadth)
	{
		super(length,breadth);
	}
	public double area()
	{
		a=(getB()*getH());
		return a;
		
	}
	
	}


public class Triangle extends Shape
	{
	double a;
	public Triangle()
	{
		
	}
	public Triangle(double base, double height)
	{
		super(base,height);
		
	}
	public double area()
	{
		a=((getB()*getH()))/2;
		return a;
		
	}
	}


import java.util.Scanner;

public class TestShape {

	public static void main(String[] args) 
	{
		double a,b;
		Scanner sc = new Scanner (System.in);
		int x;
		Shape s;
		do
		{
			System.out.println("\t1.TRIANGLE\n \t2.RECTANGLE \n \t3.EXIT \n\n\tENTER CHOICE: ");
			x = sc.nextInt();
			switch(x)
			{
			case 1:
				System.out.print("Enter base of triangle: ");
				a= sc.nextDouble();
				System.out.println("Enter height of triangle: ");
				b= sc.nextDouble();
				s=new Triangle(a,b);
				System.out.println("Area of Triangle: "+s.area());
				break;
				
			case 2:
				System.out.println("Enter length of Rectangle: ");
				a=sc.nextDouble();
				System.out.println("Enter of triangle: ");
				b= sc.nextDouble();
				s= new Rectangle(a,b);
				System.out.println("Area of rectangle: "+s.area());
				break;
				
			case 3:
				System.out.println("Program closed...");
				System.exit(0);
			
			default:
				System.out.println("Invalid choice...");
				
		}
		
	}while (x!=3);
	sc.close();
	}
	}
		    
