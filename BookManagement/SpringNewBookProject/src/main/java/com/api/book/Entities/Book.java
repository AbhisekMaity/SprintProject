package com.api.book.Entities;
// It represents the Book entity, which is mapped to a database table named "books". 
//The class is annotated with @Entity

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity  // it  indicates that it is a JPA entity.
@Table(name = "books")
//This annotation is used to configure the mapping between the Book entity and the "books" table in the database. 
public class Book {
	@Id  //@Id to indicate that it is the primary key of the entity.
	@GeneratedValue(strategy = GenerationType.AUTO)  // which lets the database generate the primary key value.
	@Column(name="bood_id")
	private int id;
	
	private String title;
//	private String Author;
	
	@OneToOne(cascade=CascadeType.ALL)  //@OneToOne to indicate that it has a one-to-one relationship with the Author entity. 
	//The cascade attribute is set to CascadeType.ALL which means that any changes
	//made to the Book entity will be cascaded to the Author entity as well.
	private Author author;
	public Book(int id, String title, Author author) {
		super();
		this.id = id;
		this.title = title;
		this.author=author;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
}
