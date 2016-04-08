package chap3;

public class Cop {

	public static void main(String[] args) {
		Cop c = new Cop();
		c.go1();
		
	}
	 void go(){
			int x=1;
			go1();
			
			
		}
	 void go1(){
		 for(int z = 0; z < 3; z++) {  
			 boolean test = false;    
			 if(z == 8) {     
				  test = true;  
				 break;
			 }
			 System.out.print(test);
		 }
		 //System.out.print(test); test cann't be resolved to a variable
		  
		}

}
