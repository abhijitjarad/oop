
public interface Vehicle 
	{
	public void gearChange(int a);
	public void speedUp();
	public void brakeApply();
	public void display();
	public void breakApply();
	}


public class Bicycle implements Vehicle
	{
	int gear, speed;
	public Bicycle()
	{
		System.out.println("Bicycle is started !!");
		gear =1;
		speed =5;
		
	}

	@Override
	public void gearChange(int a) 
	{
		if (a<7 && a>0)
		{
			gear=a;
		System.out.println("Gear is changed !!");
		}
		else
			System.out.println("INVALID GEAR OPTION !!");
	}
	

	@Override
	public void speedUp() 
	{
		if ((speed+5)<40)
		{
			speed+=5;
		System.out.println("Bicycle speed is INCREASED !!");
		
		}
	else
	
		System.out.println("Bicycle has speed limit of 40. ");
	}

	@Override
	public void brakeApply() 
	{
		if ((speed-5)>0);
		{
		speed-=5;
		System.out.println("Bicycle BRAKE is applied !!");
		System.out.println("New speed= "+speed);
		}
		
			
	}

	@Override
	public void display() 
	{
		System.out.println("Bycle SPEED is=" +speed +"and GEAR is="+gear);
		
	}

	@Override
	public void breakApply() {
		// TODO Auto-generated method stub
		
	}

	
	}



public class Bike  implements Vehicle
	{
	int gear, speed;
	public Bike()
	{
		System.out.println("Bike is started !!");
		gear= 1;
		speed= 10;
	}

	@Override
	public void gearChange(int a) 
	{
		if (a<5 && a>0)
		{
			gear=a;
			System.out.println("Bike Gear is changed !!");
			
		}
		else
			System.out.println("Invalid gear number...");
		
	}

	@Override
	public void speedUp() 
	{
		if((speed+5)<80)
		{
			speed+=5;
			System.out.println("Bike speed is increased !!");
			
		}
		else
			System.out.println("Bike has speed limit of 80");
	}

	@Override
	public void brakeApply() 
	{
		if((speed-5)>0)
		{
			speed-=5;
			System.out.println("Bike speed is decreased !!");
		}
		else
			speed=0;
		gear=0;
		System.out.println("Bike is STOPPED !!");
		
	}

	@Override
	public void display() 
	{
		System.out.println("Bike SPEED is ="+speed +"and GEAR is ="+gear);	
	}

	@Override
	public void breakApply() {
		// TODO Auto-generated method stub
		
	}

	
	}


public class Car  implements Vehicle
	{
	int gear, speed;
	public Car()
	{
		System.out.println("Car is started !!");
		gear=1;
		speed=20;
		
	}

	@Override
	public void gearChange(int a)
	{
		if(a<6 && a>0)
		{
			gear=a;
			System.out.println("Gear is changed !!");
			
		}
		else
			System.out.println("Invalid gear option !!");
		
	}

	@Override
	public void speedUp() 
	{
		if((speed+5)<120)
		{
			speed+=5;
		System.out.println("Car speed is increased !!");
		}
		else
			System.out.println("Car has SPEED LIMIT of 120");
		
	}

	@Override
	public void brakeApply() 
	{
		if ((speed-5)>0)
		{
			speed-=5;
			System.out.println("BRAKE is applied !!");
			
		}
		else
			speed=0;
		gear=0;
		System.out.println("Car is STOPPED !!");
	}

	@Override
	public void display() 
	{
		System.out.println("Car SPEED is ="+speed +"and GEAR is ="+gear);
		
	}

	@Override
	public void breakApply() {
		// TODO Auto-generated method stub
		
	}

	}


import java.util.Scanner;

public class TestVehicle {
    
    public static void operations(Vehicle v) {
        Scanner sc = new Scanner(System.in);
        int y, a;
        
        do {
            System.out.println("Select operation: ");
            System.out.println("1.\t for gear change ");
            System.out.println("2.\t for speed up ");
            System.out.println("3.\t for apply brake ");
            System.out.println("4.\t for display");
            System.out.println("5.\t for change vehicle");
            System.out.println("ENTER YOUR CHOICE: ");
            y = sc.nextInt();
            switch (y) {
                case 1:
                    System.out.println("Enter gear number: ");
                    a = sc.nextInt();
                    v.gearChange(a);
                    break;
                case 2:
                    v.speedUp();
                    break;
                case 3:
                    v.brakeApply();
                    break;
                case 4:
                    v.display();
                    break;
                case 5:
                    System.out.println("Vehicle change");
                    return;
                default:
                    System.out.println("INVALID CHOICE");
            }
        } while (y != 5);
    }
    
    public static void main(String[] args) {
        Vehicle v = null;
        Scanner sc = new Scanner(System.in);
        int x;
        
        do {
            System.out.println("Select vehicle ");
            System.out.println("1.\t for bicycle ");
            System.out.println("2.\t for bike ");
            System.out.println("3.\t for car ");
            System.out.println("4.\t for exit ");
            System.out.println("ENTER YOUR CHOICE: ");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    v = new Bicycle();
                    operations(v);
                    break;
                case 2:
                    v = new Bike();
                    operations(v);
                    break;
                case 3:
                    v = new Car();
                    operations(v);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("INVALID CHOICE");
            }
        } while (x != 4);
    }
}
