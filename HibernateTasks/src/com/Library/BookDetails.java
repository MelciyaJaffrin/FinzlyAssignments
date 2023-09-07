package com.Library;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookDetails {
	
	
	private String title;
	private String author;
	private int publication_year;
	private int isbn;
	
	@Id
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPublication_year() {
		return publication_year;
	}
	public void setPublication_year(int publication_year) {
		this.publication_year = publication_year;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "BookDetails [title=" + title + ", author=" + author + ", publication_year=" + publication_year
				+ ", isbn=" + isbn + "]";
	}
	
	
	

}
