package service;

import java.util.List;

import dao.Bookdao;
import dao.BookdaoImpl;
import entities.Book;

public class BookServiceImpl implements BookService
{
	private Bookdao dao;
	public BookServiceImpl()
	{
		dao=new BookdaoImpl();
	}



	@Override
	public Book getBookById(int id) {
		return dao.getBookById(id);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		return dao.getBookByTitle(title);
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		// TODO Auto-generated method stub
		return dao.getAuthorBooks(author);
	}

	@Override
	public List<Book> getBookInPriceRange(double low, double high) {
		// TODO Auto-generated method stub
		return dao.getBookInPriceRange(low, high);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

	@Override
	public Long getBookCount() {
		// TODO Auto-generated method stub
		return dao.getBookCount();
	}

}