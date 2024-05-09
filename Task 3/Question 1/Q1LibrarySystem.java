package task3;

import java.util.Scanner;

public class Q1LibrarySystem {

	public static void main(String[] args) {
		
		Q1Library l = new Q1Library(3);
		Scanner s = new Scanner(System.in);
		
		 while (true) {
			 System.out.print("Enter your choice: \n");
	            System.out.println("1. Add Book");
	            System.out.println("2. Remove Book");
	            System.out.println("3. Search Book");
	            System.out.println("4. Display All Books");
	            System.out.println("5. Exit");
	            
	            System.out.println();
	            int choice = s.nextInt();
	            s.nextLine(); 

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Book ID: ");
	                    int bookID = s.nextInt();
	                    s.nextLine(); 
	                    System.out.print("Enter Title: ");
	                    String title = s.nextLine();
	                    System.out.print("Enter Author: ");
	                    String author = s.nextLine();
	                    Q1books newBook = new Q1books(bookID, title, author, true);
	                    l.addbook(newBook);
	                    break;
	                case 2:
	                    System.out.print("Enter Book ID to remove: ");
	                    int removeID = s.nextInt();
	                    l.removeBook(removeID);
	                    break;
	                case 3:
	                    System.out.print("Enter Book ID to search: ");
	                    int searchID = s.nextInt();
	                    l.searchBook(searchID);
	                    break;
	                case 4:
	                    l.displayBooks();
	                    break;
	                case 5:
	                    System.out.println("Exiting program");
	                    s.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
		
		
	}

}
