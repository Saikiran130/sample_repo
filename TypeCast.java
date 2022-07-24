package phase1.programs;

public class TypeCast {
	public static void main(String h[])
	{
		float f=56.6f;
		long l=(long)f;
		
		long l2=5242748248l;
		byte b=(byte) l2;
		
		double d3=113234325.41483748;
		long l4=(long) d3;
		int x1=(int) l4;
		char ch=(char) x1;
		
		
		int x=4;
		double d=(double) x;
		long l3=(long) d;
		
		
		System.out.println("Actual float value"+" "+ f);
		System.out.println("After convert float value to long"+" "+ l);
		
		System.out.println("Actual long value"+" "+ l2);
		System.out.println("After convert long value to byte"+" "+ b);
		
		System.out.println("Actual double value"+" "+ d3);
		System.out.println("After convert double value to long"+" "+ l4);
		System.out.println("Actual long value to int"+" "+ x1);
		System.out.println("After convert int value to char"+" "+ ch);
		
		System.out.println("Actual int value"+" "+x);
		System.out.println("After int value to double"+" "+ d);
		System.out.println("After double value to long"+" "+ l3);
		
		
		
		
		
		
		
		
		
		
		
	}

}
