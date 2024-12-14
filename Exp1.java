public class Complex {
	int real, img;
	public Complex() {
		real= img=0;
		
	}
	public Complex(int real, int img) {
	this.real=real;
	this.img=img;
	
	}
	public void printComplex() {
		System.out.println(real + "+" +img+ "i");
		
	}
	public Complex addComplex(Complex o2) {
		Complex temp=new Complex();
		temp.real=this.real+o2.real;
		temp.img=this.img+o2.img;
		return temp;
		
	}
	public Complex subComplex(Complex o2) {
		Complex temp =new Complex();
		temp.real=this.real-o2.real;
		temp.img=this.img-o2.img;
		return temp;
		
	}
	public Complex mulComplex(Complex o2) {
		Complex temp = new Complex();
		temp.real=this.real*o2.real;
		temp.img=this.img*o2.img;
		return temp;
	}
	}

  
public class TestComplex {

	public static void main(String[] args) {
	Complex o1,o2,o3;
	o1=new Complex(5,8);
	o2=new Complex(3,6);
	o3=new Complex();
	
	System.out.println("o1 is: ");
	o1.printComplex();
	System.out.println("o2 is: ");
	o2.printComplex();
	
	o3=o1.addComplex(o2);
	System.out.println("o3= o1+o2 is: ");
	o3.printComplex();
	
	o3=o1.subComplex(o2);
	System.out.println("o3= o1-o2 is: ");
	o3.printComplex();
	
	o3=o1.mulComplex(o2);
	System.out.println("o3= o1*o2 is: ");
	o3.printComplex();

	}

}
