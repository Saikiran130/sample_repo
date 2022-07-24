package phase1.programs;

public class Shape {
	
	int x,y;
	float f;
	int a;
	int d1,d2;
	int b;
	float h;
	
	Shape()
	{
		d1=2;
		d2=3;
		b=5;
		h=4.7f;
	}
	
	Shape(int a,int b)
	{
		x=a;
		y=b;
	}
	
	Shape(float z)
	{
		f=z;
	}
	
	Shape(int x)
	{
		a=x;
	}
	
	public void square()
	{
		System.out.println("\nArea of the square is"+" "+(a*a));
	}
	
	void rectangle()
	{
		System.out.println("\nArea Of Rectangle is"+" "+(x*y));
	}
	
	void circle()
	{
		System.out.println("\nArea of Circle is"+" "+(3.14*f*f));
	}
	
	void display()
	{
		System.out.println("\nArea of Rhombus is"+" "+(0.5*d1*d2));
		System.out.println("\nArea of Triangle is"+" "+(0.5*b*h));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Shape();
		Shape s1=new Shape(5,6);
		Shape s2=new Shape(3.2f);
		Shape s3=new Shape(10);
		
		
		s1.rectangle();
		s2.circle();
		s3.square();
		s.display();
		
	}

}
