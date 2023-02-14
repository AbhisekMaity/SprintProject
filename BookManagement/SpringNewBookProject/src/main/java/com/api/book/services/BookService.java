package com.api.book.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.Entities.Book;
import com.api.book.dao.BookRepository;
@Component
//The @Component annotation is used to mark the class as a Spring component so that 
//it can be auto-detected and instantiated by the Spring container.
public class BookService {
	
	@Autowired  
	// The @Autowired annotation is used to inject an instance of BookRepository into the BookService class. 
	private BookRepository bookRepository;  
	
  public List<Book> getAllBook(){
	  List<Book> list =(List<Book>)this.bookRepository.findAll();
	  return list;
  }


  public Book getBookById(int id) {
	  Book book=null;
	  book=this.bookRepository.findById(id);
	  return book;
  }
  
  
  public Book addBook(Book b) {
Book result=bookRepository.save(b);
	  return result;
  }
   
  
public void deleteBook(int bid) {
  bookRepository.deleteById(bid);
}



public void updateBook(Book book, int bookId) {
	// TODO Auto-generated method stub
	book.setId(bookId);
	bookRepository.save(book);
}



}
