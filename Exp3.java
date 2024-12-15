import java.util.Scanner;

public class Employee
		{
		Scanner sc= new Scanner(System.in);
		String empName; 
		String address; 
		String emailId; 
		long mobileNo; 
		int empId; 
		double basicPay; 
		static int id=1000; 
		double netSalary,grosSalary; 
		double hra,da,pf,staffClubFund;
		public Employee()
				{
				id++;
				empId = id;
				}
		public void readData()
			{
			System.out.print("Enter the name of Employee: ");
			empName = sc.nextLine();
			System.out.print("Enter Address: ");
			address = sc.nextLine();
			System.out.print("Enter email id: ");
			emailId = sc.nextLine();
			System.out.print("Enter Mobile No.: ");
			mobileNo=sc.nextLong();
			}
		public void displayEmployee()
				{

				System.out.println("ID\tEMP NAME\tEmail Id \tADDRESS\t\tMOBILE");
				System.out.println(empId+"\t"+empName+"\t"+emailId+"\t"+address+"\t"+mobileNo );

				}
		public void calculateSalary()
				{
				da = basicPay*.97; 
				hra = basicPay*.10; 
				pf = basicPay*.12; 
				staffClubFund = basicPay*0.001; 
				grosSalary = basicPay + da + hra;
				netSalary = grosSalary- pf - staffClubFund;
				}

		public void printSalarySlip()
			{

			System.out.println(" BASIC PAY :"+basicPay);
			System.out.println(" DA :"+da);
			System.out.println(" HRA :"+hra);
			System.out.println(" PF :"+pf);
			System.out.println(" GROSS SALARY :"+grosSalary);
			System.out.println(" NET SALARY :"+ netSalary);
			}
		}

public class Programmer extends Employee
		{ 
		public Programmer()
				{
			
				}
		public void readProgrammer()
				{
				readData(); 
				System.out.print("BASIC PAY of programmer: ");
				basicPay=sc.nextDouble();
				}
		}

public class AsstProjectManager extends Employee
		{ 
		public AsstProjectManager()
		{
			
		}
		public void readAsstProjectManager()
		{
			readData(); //input data from user for Programmer
			System.out.print("BASIC PAY of AsstProjectManager: ");
			basicPay=sc.nextDouble();
		}
	}

public class TeamLead extends Employee
		{ 
		public TeamLead()
		{
			
		}
		public void readTeamLead()
		{
			readData(); //input data from user for Programmer
			System.out.print("BASIC PAY of TeamLead: ");
			basicPay=sc.nextDouble();
		}
	}

public class ProjectManager extends Employee
		{ 	
		public ProjectManager()
		{
			
		}
		public void readProjectManager()
		{
			readData(); //input data from user for Programmer
			System.out.print("BASIC PAY of ProjectManager: ");
			basicPay=sc.nextDouble();
		}
	}

public class TestEmployee
		{
		public static void main(String[] args)
		{
			Programmer p = new Programmer();
			AsstProjectManager ap = new AsstProjectManager();
			TeamLead tl = new TeamLead();	
			ProjectManager pm = new ProjectManager();
			System.out.println(" Programmer ");
			p.readProgrammer();
			System.out.println(" ProjectManager ");
			pm.readProjectManager();	
			System.out.println(" TeamLead ");
			tl.readTeamLead();
			System.out.println(" AsstProjectManager ");
			ap.readAsstProjectManager();
			p.calculateSalary();
			pm.calculateSalary();
			tl.calculateSalary();
			ap.calculateSalary();
			System.out.println(" Programmer Salary Slip");	
			p.printSalarySlip();
			System.out.println(" Project Manager Salary Slip");
			pm.printSalarySlip();
			System.out.println(" Team Lead Salary Slip");
			tl.printSalarySlip();
			System.out.println("Asst Project Manager Salary Slip");
			ap.printSalarySlip();
		}
	}	
