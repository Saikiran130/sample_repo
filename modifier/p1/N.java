package phase1.modifier.p1;

public class N {
	
	protected long l1=4335435;
	public int x1=23;
	double d1=5.56d;
	
	public void methodpublic()
	{
		System.out.println("\nMethod public is called in Class N");
		methodprivate();
		
	}
	
	void methoddefault()
	{
		System.out.println("\nMethod Default is called in Class N");
	}
	
	private void methodprivate()
	{
		System.out.println("\nMethod private is called via method public in Class N");
	}
	
	protected void methodprotected()
	{
		System.out.println("\nMethod protected is called in Class N");
	}

}
