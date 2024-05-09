package task3;

public class Q1Library {
	
	Q1books[] books;
	int maxsize;
	int currentsize;
	
	public Q1Library(int maxsize) {
		this.maxsize = maxsize;
		this.books = new Q1books[maxsize];
		this.currentsize=0;
	}
	
	public void addbook(Q1books bookss) {
		if(currentsize<maxsize) {
			books[currentsize ++] = bookss;
			System.out.println("Book is sucessfully added");
		}
		else {
			System.out.println("Cannot add books");
		}
	}
	
	public void removeBook(int bookid) {
        for (int i = 0; i < currentsize; i++) {
        	
            if (books[i].getBookid() == bookid) {
                
                for (int j = i; j < currentsize - 1; j++) {
                    books[j] = books[j + 1];
                }
                currentsize--;
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book with ID " + bookid + " not found.");
    }
	
	public void searchBook(int bookid) {
        for (int i = 0; i < currentsize; i++) {
            if (books[i].getBookid() == bookid) {
                System.out.println("Book found:");
                books[i].displaydetails();
                return;
            }
        }
        System.out.println("Book with ID " + bookid + " not found.");
    }
	
	 public void displayBooks() {
	        if (currentsize == 0) {
	            System.out.println("Library is empty.");
	            return;
	        }
	        System.out.println("Books in the library:");
	        
	        for (int i = 0; i < currentsize; i++) {
	            System.out.println("Book " + (i + 1) + ":");
	            books[i].displaydetails();
	            System.out.println();
	        }
	    }

}
