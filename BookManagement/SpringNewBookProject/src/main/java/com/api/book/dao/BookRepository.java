 package com.api.book.dao;  
 //It extends the CrudRepository interface, which provides basic CRUD (Create, Read, Update, Delete) 
 //operations for a specific entity type, in this case, Book.

import org.springframework.data.repository.CrudRepository;

import com.api.book.Entities.Book;

//The BookRepository interface provides an abstraction over the database
//layer and is used by the BookService class to perform CRUD operations on the Book entity.

public interface BookRepository extends CrudRepository<Book,Integer> {
    public Book findById(int id);
    
    //This method is used to find a book by its id. The method is not implemented in this interface 
    //since Spring Data will generate the implementation at runtime.
}
