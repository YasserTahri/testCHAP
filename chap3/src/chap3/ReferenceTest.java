package chap3;

import java.awt.Dimension;

public class ReferenceTest {

	public static void main(String[] args) {
		 Dimension d = new Dimension(5,10);
		 ReferenceTest rt = new ReferenceTest();
		 System.out.println("Before modify() d.height = "+ d.height);
		 rt.modify(d);
		 System.out.println("aftrr modify() d.height = "+ d.height);

	}
	
	 void modify(Dimension dim) { 
		 dim.height = dim.height + 1;
		 System.out.println("dim = " + dim.height);
	 }
}
