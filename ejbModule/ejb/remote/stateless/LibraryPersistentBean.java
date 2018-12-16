package ejb.remote.stateless;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import domain.Book;

@Stateless
public class LibraryPersistentBean implements LibraryPersistentBeanRemote {
	@PersistenceContext(unitName="EJBRemote")
	private EntityManager entityManager;         
	 
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		entityManager.persist(book);
	}

	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("From Book").getResultList();
	}

}
