import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Scanner;

public class Myfile 
	{
	public void appendRecord()
	{
		try
		{
			String studentName, studentClass;
			int rollNo;
			float marks;
			Scanner sc1= new Scanner(System.in);
			PrintWriter pr= new PrintWriter (new FileWriter("student.txt",true));
			System.out.println("roll number of student");
			rollNo= sc1.nextInt();
			System.out.println("Name of student: ");
			studentName = sc1.next();
			System.out.println("Class of student: ");
			studentClass = sc1.next();
			System.out.println("Marks of student: ");
			marks = sc1.nextFloat();
			pr.println(rollNo+ "  "+studentName+"  "+ studentClass+"  "+marks);
			System.out.println("Record added successfully");
			pr.close();
		}
		catch(Exception e)
		{
			System.out.println("Error in append"+e);
		}
	}
	public void printRecords()throws IOException
	{
		String record;
		FileReader fr = new FileReader("student.txt");
		BufferedReader br = new BufferedReader(fr);
		do {
			record = br.readLine();
			if(record != null)
			System.out.println(record);
		}while(record != null);
		br.close();
	}
	public void searchRecord(String name) throws IOException, FileNotFoundException
	{
		String record;
		String[]fields;
		boolean flag = false;
		BufferedReader br= new BufferedReader(new FileReader("student.txt"));
		do {
			record = br.readLine();
			if(record != null)
			{
				fields = record.split("  ");
				if(name.compareToIgnoreCase(fields[1])==0)
				{
					System.out.println("Record found");
					System.out.println(record);
					flag = true;
					break;
				}
			}
		}while(record != null);
		if(flag == false)
			System.out.println("Record not found");
		br.close();
	}
	public void clearAllRecords()throws FileNotFoundException
	{
		File f= new File("student.txt");
		PrintWriter pr = new PrintWriter(f);
		pr.close();
	}
	public void modifyRecord(String name) throws IOException, FileNotFoundException
	{
		String record;
		String[] fields;
		boolean flag = false;
		String studentName, studentClass;
		int rollNo;
		float marks;
		Scanner sc = new Scanner(System.in);
		File f = new File("student.txt");
		File f1 = new File("student.txt");
		PrintWriter pr = new PrintWriter(f);
		BufferedReader br = new BufferedReader(new FileReader(f1));
		do {
			record = br.readLine();
			if(record != null)
			{
				fields = record.split("  ");
				if(name.compareToIgnoreCase(fields[1])==0 && flag == false)
				{
					System.out.println("New roll number of student");
					rollNo = sc.nextInt();
					System.out.println("New name of student");
					studentName = sc.next();
					System.out.println("New class of student");
					studentClass = sc.next();
					System.out.println("New marks of student");
					marks = sc. nextFloat();
					pr.println(rollNo+ "  "+ studentName+ "  "+ studentClass+ "  "+marks);
					System.out.println("Records updated successfully");
					flag = true;
				}
				else
				{
					pr.println(record);
				}
			}
		}while(record != null);
		if (flag == false)
			System.out.println("Record not found");
		br.close();
		pr.close();
		f1.delete();
		f.renameTo(f1);
	}
	}


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Testfile {

	public static void main(String[] args) throws IOException, FileNotFoundException
	{
	Myfile f= new Myfile();
	int ch = 0;
	String name;
	Scanner sc = new Scanner (System.in);
	do
	{
		System.out.println("Enter ");
		System.out.println("1: for add record");
		System.out.println("2: for search records");
		System.out.println("3: for display records");
		System.out.println("4: for modify the record");
		System.out.println("5: for clear file");
		System.out.println("6: for terminate");
		System.out.println("ENTER YOUR CHOICE:  ");
		ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			f.appendRecord();
			break;
		case 2:
			System.out.println("Enter name of student to search: ");
			name = sc.next();
			f.searchRecord(name);
			break;
		case 3:
			f.printRecords();
			break;
		case 4:
			System.out.println("Enter name of student to modify: ");
			name = sc.next();
			f.modifyRecord(name);
			break;
		case 5:
			f.clearAllRecords();
			break;
		case 6:
			System.out.println("Terminating the program");
			break;
		default:
			System.out.println("Wrong choice... ");
		}
	}while(ch !=6);
	

	}

}
