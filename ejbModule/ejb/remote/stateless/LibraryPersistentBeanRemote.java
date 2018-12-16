package ejb.remote.stateless;

import java.util.List;

import javax.ejb.Remote;

import domain.Book;

@Remote
public interface LibraryPersistentBeanRemote {
	void addBook(Book bookName);
	List<Book> getBooks();
}
