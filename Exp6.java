import java.util.Scanner;
public class MyException
		{
		public static void main(String[] args)
		{
			int num1, num2;
			int index;
			int x[]= {33,5,66};
			Scanner sc=new Scanner(System.in);
			int n;
			do {
				System.out.println("\nMenu \n Enter the Choice to check type of error "

									+"\n1 Arithmaticexception"
									+ "\n2 ArrayOutOfBound"
									+ "\n3 Exit");
				n=sc.nextInt();
				switch(n)
						{
						case 1:
							try
							{
								System.out.println("Enter Number 1 ::");	
								num1=sc.nextInt();
								System.out.println("Enter Number 2 ::");	
								num2=sc.nextInt();	
								double c=num1/num2;
								System.out.println("num1 / num2 = "+c);	
							}
							catch(ArithmeticException e)

							{
								System.out.println(" Divide by zero error");
							}
							catch (Exception e)
							{
								System.out.println(e);
							}
							break;

						case 2:
							try

							{
								System.out.println("Enter array index::");
								index = sc.nextInt();
								System.out.println("x["+index+"]= "+x[index]);
							}
							catch(ArrayIndexOutOfBoundsException e)
							{
								System.out.println(" array index out of bounds exception");

							}
							catch (Exception e)
							{
								System.out.println("Unknown error");
								System.out.println(e);
							}

							break;
						case 3:
							System.out.println(" Exiting the program");
							System.exit(0);
						default:

							System.out.println("INVALID INPUT !!!");
						}
			}while(true);
		}
	}
