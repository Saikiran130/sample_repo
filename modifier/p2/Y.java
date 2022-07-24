package phase1.modifier.p2;

import phase1.modifier.p1.N;
import phase1.modifier.p1.M;
public class Y extends N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X obj=new X();
		M ob=new M();
		N ob1=new N();
		
		System.out.println("\ncalling all the variables in Class X");
		System.out.println(obj.ch);
		System.out.println(obj.g);
		System.out.println(obj.l3);
		
		
		ob.methodpublic();
		
		ob1.methodpublic();
		new Y().methodprotected();
		
		
		
		
		

	}

}
