package kitamurahikaru;

import java.util.ArrayList;

public class BookManager {
	
	public static void main(String[] args) {
		
		ArrayList<Book> books = new ArrayList<>();
				
		Book b1 = new Book();
		b1.setTitle("–{‚»‚Ì1");
		books.add(b1);
		
		Book b2 = new Book();
		b2.setTitle("–{‚»‚Ì2");
		books.add(b2);
		
		Book b3 = new Book();
		b3.setTitle("–{‚»‚Ì3");
		books.add(b3);
		
		for (Book book : books) {
			System.out.println(book.getTitle());
		}
	}

}
