package phase1.modifier.p1;

public class M {
	
	private int x=10;
	long l=1213334;
	protected float f=3.45f;
	
	public void methodpublic()
	{
		System.out.println("\nMethod public is called in Class M");
		methodprivate();
		
	}
	
	void methoddefault()
	{
		System.out.println("\nMethod Default is called in Class M");
	}
	
	private void methodprivate()
	{
		System.out.println("\nMethod private is called via method public in Class M");
	}
	
	protected void methodprotected()
	{
		System.out.println("\nMethod protected is called in Class M");
	}
	
}
