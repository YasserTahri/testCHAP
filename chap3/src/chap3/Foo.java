package chap3;

public class Foo {
	private String name;
	
	void bar(){
		Foo f = new Foo();
		doStuff(f);	
	}
	void doStuff(Foo g){
		g.setName("hhhh");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
