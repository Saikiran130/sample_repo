package phase1.modifier.p1;

public class P {
	
	public void methodpublic()
	{
		System.out.println("\nMethod public is called in Class P");
		methodprivate();
		
	}
	
	void methoddefault()
	{
		System.out.println("\nMethod Default is called in Class P");
	}
	
	private void methodprivate()
	{
		System.out.println("\nMethod private is called via method public in Class P");
	}
	
	protected void methodprotected()
	{
		System.out.println("\nMethod protected is called in Class P");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M m1=new M();
		N n1=new N();
		
		System.out.println("\n Variables in Class M");
		System.out.println("\nvalue of long variable"+" "+m1.l);
		System.out.println("\nvalue of protected variable"+" "+m1.f);
		
		System.out.println("\n Variables in Class N");
		System.out.println("\nValue of the protected variable"+" "+n1.l1);
		System.out.println("\nValue of the public variable"+" "+n1.x1);
		System.out.println("\nValue of the default variable"+" "+n1.d1);
		
		

	}

}
