package programs;

public class stringequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t="Delhi";
		String o="Mumbai";
		String k="delhi";
		String y=new String("Mumbai");
		String l=new String("delhi");
		String p=new String("Hello");
		
		if(o.equals(l))
		{
			System.out.println("\nString"+" "+o+" "+"String"+" "+l+"are equal");
		}
		else{
			System.out.println("\nNot equal");
		}
		if(o==l)
		{
			System.out.println("\ntwo string address are equal");
		}
		else{
			System.out.println("\nMemory address not same");
		}
		if(y.equals(p))
		{
			System.out.println("\nString"+" "+y+" "+"String"+" "+p+"are equal");
		}
		else{
			System.out.println("\nNot equal");
		}
		if(y==p)
		{
			System.out.println("\ntwo string address are equal");
		}
		else{
			System.out.println("\nMemory address not same");
		}
		if(t.equals(o))
		{
			System.out.println("\nString"+" "+t+" "+"String"+" "+o+"are equal");
        }
		else{
			System.out.println("\nNot equal");
		}
		if(t==o)
		{
			System.out.println("\ntwo string address are equal");
		}
		else{
			System.out.println("\nMemory address not same");
		}
		if(k.equals(y))
		{
			System.out.println("\nString"+" "+k+" "+"String"+" "+y+"are equal");
		}
		else{
			System.out.println("\nNot equal");
		}
		if(k==y)
		{
			System.out.println("\ntwo string address are equal");
		}
		else{
			System.out.println("\nMemory address not same");
		}
		if(p.equals(y))
		{
			System.out.println("\nString"+" "+p+" "+"String"+" "+y+"are equal");
		}
		else{
			System.out.println("\nNot equal");
		}
		if(p==y)
		{
			System.out.println("\ntwo string address are equal");
		}
		else{
			System.out.println("\nMemory address not same");
		}
		

	}

}
