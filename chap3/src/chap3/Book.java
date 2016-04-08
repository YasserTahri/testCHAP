package chap3;

public class Book {
	private String title="gggg";
	
	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}
	
	public static void main(String[] args) {
		   Book b = new Book(); 
		   String c=b.getTitle();
		   String l=c.toLowerCase();
		   System.out.println(l);
	}
}