package task3;

public class Q1books {
	
	 int  bookid;
	String title;
	String author;
	boolean isavailable;
	
	public Q1books( int i,String string,String string2,boolean b) {
		this.bookid=i;
		this.title=string;
		this.author=string2;
		this.isavailable = b;
	}
	
	public void displaydetails() {
		System.out.println("Book id : "+ bookid);
		System.out.println("Book Title : "+ title);
		System.out.println("Book Author : "+ author);
		System.out.println("Book is available : "+ isavailable);
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public boolean isIsavailable() {
		return isavailable;
	}

	public void setIsavailable(boolean available) {
		this.isavailable = available;
	}
	

}
