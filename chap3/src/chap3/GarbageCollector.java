package chap3;

import java.util.Date;

public class GarbageCollector {
	public static void main(String args[]){
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total JVM memory:"+ rt.totalMemory()); 
		System.out.println("Before Memory = "+rt.freeMemory());
		 Date d = null; 
		 for(int i = 0;i<10000;i++) { 
			 d = new Date();
			 d = null;   
			 rt.gc(); 
			
			 } 
		 System.out.println("After Memory = "+ rt.freeMemory());
		 System.out.println("After gc = "+ rt.freeMemory());
		 
	}

}
