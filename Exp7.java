public class Number <T>
{
	public <T> Boolean isEven (T a)
	{
		if (Integer.parseInt(a.toString()) % 2 ==0)
			return true;
		else
			return false;
	}
	public <T> float addition (T a, T b)
	{
		float sum= 0;
		sum = Float.parseFloat(a.toString())+Float.parseFloat(a.toString());
		return sum;
	}
	public <T> boolean isPalindrome (T s)
	{
		String s1 = s.toString();
		StringBuffer sb = new StringBuffer (s1);
		String ss = new String (sb.reverse());
		if (s1.equals(ss))
			return true;
		else
			return false;
	}
}


import java.util.Scanner;

public class TestNumber {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int num, x;
	float num1, num2;
	String s;
	Number n1 = new Number();
	do
	{
		System.out.println("menu \n1: addition of two float numbers"
	                          + "\n2: Even odd number \n3: palindrome string"
				              +"\n4:exit\n choice::");
		x = sc.nextInt();
		switch(x)
		{
		case 1:
			System.out.print("Enter first float number: ");
			num1 =sc.nextFloat();
			System.out.println("Enter second float number: ");
			num2 = sc.nextFloat();
			System.out.println("sum ="+ n1.addition(num1,num2));
			break;
		case 2:
			System.out.println("Enter integer number: ");
			num = sc.nextInt();
			if (n1.isEven(num))
			{
				System.out.println("Number is even");
			}
			else
			{
				System.out.println("Number is odd");
			}
			break;
		case 3:
			System.out.println("Enter string: ");
			s = sc.next();
			if (n1.isPalindrome(s))
			{
				System.out.println("String is palindrome");
				
			}
			else
			{
				System.out.println("Strin is not palindrome");
				
			}
			break;
		case 4:
			System.out.println("program closed");
			System.exit(0);
			default:
				System.out.println("Invalid choice...");
		}
		
	}while(x!= 4);
	sc.close();
	}

}
