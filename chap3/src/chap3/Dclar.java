package chap3;

public class Dclar {
	
	int prjava7=1000000;
	int java7=1_000_000;
	//int java7Illigal=_1_000_000; Illigal
    int g=0;
	public void increment(){
		int g=2;
		g++;
		System.out.println(++g);
		
	}
	
	public static void main(String [] args) {
		
		new Dclar().increment();
		
		Long lg= new Long(11);
		lg.byteValue();
		int numbr=010;
		int x=0xabcd;
		int y=0Xa47f;
		byte a=2;
		 //a+=1;
		 a=(byte)(a+10);
		 int i1=12345;
		 byte b1=(byte)i1;
		 short s = (short)i1;
		 int i2=(int)123.123;
		 long l = (long)i1;
		 
		
		byte b=(byte)100;
		byte v=(byte)(a+b);
		//long l=l;
	//	byte w=(byte)l;
		
		//application OCA
		float f=234.6f;
	//	short s=(short)f;
		int aa=3;
		float yy= aa;
		int i2df=10_00;
		int cv=0x2_a;
		
		
		
	
		
		char c = '\t';
		 //System.out.println(cv);
		 
		 boolean xx=true;
		 if(xx){
			 
		 }
	}

}
