import java.util.Scanner;
public class Account 
	{
	static int accno=1000;
	protected double balance;
	protected int accountNo;
	Customer cs = new Customer();

	public Account()
	{
	accountNo = accno++;
	}
	void setBalance(double balance)
	{
	this.balance = balance;
	}
	public double getBalance()
	{
	return balance;
	}
	public int getAccountNo()
	{
	return accountNo;
	}
	public void readAccountInfo()
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter name of customer:");
	cs.setCustomerName(sc.next());
	System.out.println("Enter address of customer:");
	cs.setAddress(sc.next());
	System.out.println("Enter mobile of customer:");
	cs.setMobileNo(sc.next());
	System.out.println("Enter intial balance (>500):");
	setBalance(sc.nextDouble());
	System.out.println("Your account number is: "+ accountNo);
	}
	}


public class Customer 
	{
	private String customerName,address;
	private String mobileNo;
	public void setCustomerName(String customerName)
	{
	this.customerName = customerName;
	}
	public void setAddress(String address)
	{
	this.address = address;
	}
	public void setMobileNo(String mobileNo)
	{
	this.mobileNo = mobileNo;
	}
	public String getCustomerName()
	{
	return customerName;
	}
	public String getAddress()
	{
	return address;
	}
	public String getMobileNo()
	{
	return mobileNo;
	}
	}

import java.util.Scanner;
public class MyBank
		{
		public static int searchAccount(SavingAccount sa[],int accNo)
		{
			int k;
			for(k=0; k< sa.length;k++ )
			{
				if(sa[k].accountNo == accNo)
					return k;
				k++;
			}
			return -1;
		}
		public static void main(String[] args)	
		{
			SavingAccount sa[] = new SavingAccount[10];
			Scanner sc = new Scanner(System.in);
			int accNo=0,k, saCount=0;
			int choice;
			double amount;
			do
			{
				System.out.println("1: Create Account");
				System.out.println("2: Deposit Amount");
				System.out.println("3: Withdraw Amount");
				System.out.println("4: Display Account");
				System.out.println("5: Exit");
				System.out.print("Enter your choice: "); //printing on console
				choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					sa[saCount] = new SavingAccount();
					sa[saCount].readAccountInfo();
					saCount++;
					break;
				case 2:
					System.out.println("Enter account number:");
					accNo = sc.nextInt();	
					k= searchAccount(sa, accNo);
					if(k!= -1)	
					{
						System.out.println("Enter amount to deposit:");
						amount = sc.nextDouble();
						sa[k].depositMoney(amount);
						System.out.println("Amount deposited");
					}

					else
					{
						System.out.println("Account does not exists");
					}
					break;
				case 3:
					System.out.println("Enter account number:");
					accNo = sc.nextInt();
					k= searchAccount(sa, accNo);
					if(k!= -1)
					{
						System.out.println("Enter amount to withdraw:");
						amount = sc.nextDouble();
						sa[k].withdrawMoney(amount);
						System.out.println("Amount withdraw successfull");
					}
					else
					{	
						System.out.println("Account does not exists");
					}
					break;
				case 4:
					System.out.println("Enter account number:");
					accNo = sc.nextInt();
					k= searchAccount(sa, accNo);
					if(k!= -1)
					{
						sa[k].displayAccount();
					}
					else	
					{	
						System.out.println("Account does not exists");
					}
					break;
				case 5:
					System.out.println("Terminating the program");
					break;
				default:
					System.out.println("Wrong choice");
				}
			}while(choice != 5);
		}
	}


public class SavingAccount extends Account
	{
	private final double minimumBalance = 500;
	public void depositMoney(double amount)
	{
	this.balance = this.balance + amount;
	}
	public void withdrawMoney(double amount)
	{
	if (balance - amount >= minimumBalance )
	this.balance = balance - amount;
	else
	System.out.println("Can not withdraw this much amount");
	}
	public void displayAccount()
	{
	System.out.println("Account info");
	System.out.println("Account no="+ this.getAccountNo());
	System.out.println("Account Name="+ this.cs.getCustomerName());
	System.out.println("Account Address="+ this.cs.getAddress());
	System.out.println("Account Mobile="+ this.cs.getMobileNo());

	System.out.println("Account Balance="+ this.getBalance());
	}
	}	
