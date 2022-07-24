package phase1.programs;

public class methodoverloading {
	
	static int add(int a,int b)
	{
		return (a+b);
	}
	
	static int sub(float a, float b)
	{
		return (int) (a-b);
	}
	
	static int mul(double a, double b)
	{
		return (int) (a*b);
	}

	public static void main(String[] args) {
		methodoverloading m=new methodoverloading();
		System.out.println("\nAddition of Two Numbers"+" "+m.add(20,40));
		System.out.println("\nSubraction of Two Numbers"+" "+m.sub(4.3f, 2.3f));
		System.out.println("\nMultiplication of Two Numbers"+" "+m.mul(6.7d, 7.8d));

	}

}
