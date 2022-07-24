package phase1.modifier.p2;

import phase1.modifier.p1.*;

public class Z extends M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X z1=new X();
		
		System.out.println("\nCalling all the variables in Class X");
		System.out.println(z1.ch);
		System.out.println(z1.g);
		System.out.println(z1.l3);
		
		
		N b1=new N();
		M b2=new M();
		P b3=new P();
		
		b1.methodpublic();
		b2.methodpublic();
		new Z().methodprotected();
		
		b3.methodpublic();
		
		

	}

}
