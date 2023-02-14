package com.api.book.controllers;  // It is a REST controller that handles HTTP requests related to books.

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.Entities.Book;
import com.api.book.services.BookService;
@RestController  
// which indicates that it returns data directly in response to HTTP requests,
//rather than relying on view templates.

public class BookController {
	
	@Autowired   //@Autowired annotation to inject an instance of the BookService class.
	private BookService bookService;
	
	
	
	
	@GetMapping("/books")  
	// The getBooks() method handles HTTP GET requests to the /books URI and returns
	//a list of all books by calling the getAllBook() method from the BookService class.
	public List<Book> getBooks() {
		return this.bookService.getAllBook();
	}
	
	@GetMapping("/books/{id}")
	//The getBook() method handles HTTP GET requests to the /books/{id} URI and returns the book
	//with the specified ID by calling the getBookById() method from the BookService class.
	public Book getBook(@PathVariable("id")int id)
	{
	return bookService.getBookById(id);
  }
	
	
	@PostMapping("/books")
	//The addBook() method handles HTTP POST requests to the /books URI and adds a new book by calling
	//the addBook() method from the BookService class.
	//It takes a Book object as the request body and returns the added Book object.
	
	public Book addBook(@RequestBody Book book) {
	 this.bookService.addBook(book);
	 System.out.println(book);
	 return book;
	}
	
	// delete book handler 
	@DeleteMapping("/books/{bookId}")
	public void deleteBook(@PathVariable("bookId") int bookId) {
		this.bookService.deleteBook(bookId);
	}
	
	// update book handler
	@PutMapping("/books/{bookId}")
	public Book updateBook(@RequestBody Book book,@PathVariable("bookId") int bookId) {
		this.bookService.updateBook(book,bookId);
	return book;
	}
}