import java.util.*;
public class Publication
	{ 
	private String title;
	private int price;
	private int copies;
	private int total;
	public void setTitle(String title)
			{
			this.title=title;
			}
	public String getTitle()
			{
			return title;
			}
	public int getPrice()
			{
			return price;
			}
	public void setPrice(int price)
			{
			this.price = price;
			}
	public void setCopies(int copies)
			{
			this.copies=copies;
			}
	public int getCopies()
			{
			return copies;
			}
	public void setTotal(int total)
			{
			this.total = total;
			}
	public int getTotal()
			{
			return total;
			}
	public void sellCopy(int number)
			{
			if (number <= copies)
			{
				copies = copies - number;
				total = total + number * price;
			}
			else
				System.out.println("Insufficient copies available");
			}
	}	

import java.util.Scanner;

public class Book extends Publication
		{
		private String author;
		Scanner sc=new Scanner(System.in);
		public void orderCopies(int number)
				{
				int x=getCopies() + number;
				setCopies( x );
				}
		public void readBook()
				{
				System.out.print("enter title : ");
				setTitle(sc.next() );
				System.out.print("enter price: ");
				setPrice(sc.nextInt());
				System.out.print("enter number of copies: ");
				setCopies(sc.nextInt());
				System.out.print("enter author of book: ");
				author=sc.next();
				}
		public void displayBook()
				{
				System.out.println("title \t price \t copy \t author");
				System.out.print(getTitle()+"\t"+getPrice()+"\t"+getCopies()+"\t"+author);
				System.out.println("Total= "+getTotal());
				}
		}

import java.util.Scanner;

class Magazine extends Publication
		{
		int orderQuantity;
		private String issueDate;
		Scanner sc=new Scanner(System.in);
		public void receiveIssue(int number, String issueDate)
				{
				int x=getCopies() + number;
				setCopies( x );
				this.issueDate = issueDate;
				}
		public void readMagazine ()
				{
				System.out.print("enter title : ");
				setTitle(sc.next() );
				System.out.print("enter price: ");
				setPrice(sc.nextInt());
				System.out.print("enter number of order quantities: ");
				setCopies(sc.nextInt());
				orderQuantity = getCopies();
				System.out.print("enter issue date of Magazine: ");
				issueDate =sc.next();
				}
		public void displayMagazine ()
				{
				System.out.println("title \t price \t copy \t issueDate ");
				System.out.print(getTitle()+"\t"+getPrice()+"\t"+getCopies()+"\t"+ issueDate);
				System.out.println("Total= "+getTotal());
				}

		}

import java.util.Scanner;

public class TestPublication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        Magazine m = new Magazine();
        b.setTotal(0);
        m.setTotal(0);
        
        // Reading book and magazine details
        b.readBook();
        m.readMagazine();
        
        do {
            System.out.println("Enter CHOOSE ");
            System.out.println("1:\t for sell book ");
            System.out.println("2:\t for sell magazine ");
            System.out.println("3:\t for total sell ");
            System.out.println("4:\t for terminate");
            int k = sc.nextInt();
            switch (k) {
                case 1:
                    System.out.print("Number of book copies you want: ");
                    int n1 = sc.nextInt();
                    b.sellCopy(n1);
                    System.out.println("Books " + n1 + " sold");
                    break;
                case 2:
                    System.out.print("Number of magazine copies you want: ");
                    int n2 = sc.nextInt();
                    m.sellCopy(n2);
                    System.out.println("Magazines " + n2 + " sold");
                    break;
                case 3:
                    System.out.println("Total book sell value = " + b.getTotal());
                    System.out.println("Total magazine sell value = " + m.getTotal());
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        } while (true);
    }
}
