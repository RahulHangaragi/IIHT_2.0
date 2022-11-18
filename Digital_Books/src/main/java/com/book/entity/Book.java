package com.book.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer BookId;
	private String bookTitle;
	private String logo;
	private String category;
	private int price;
	private String publisher;
	private Date publishedDate;
	private int chapters;
	private boolean active;

	public Integer getBookId() {
		return BookId;
	}

	public void setBookId(Integer bookId) {
		BookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	public int getChapters() {
		return chapters;
	}

	public void setChapters(int chapters) {
		this.chapters = chapters;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Book(Integer bookId, String bookTitle, String logo, String category, int price, String publisher,
			Date publishedDate, int chapters, boolean active) {
		super();
		BookId = bookId;
		this.bookTitle = bookTitle;
		this.logo = logo;
		this.category = category;
		this.price = price;
		this.publisher = publisher;
		this.publishedDate = publishedDate;
		this.chapters = chapters;
		this.active = active;
	}

	public Book(String bookTitle, String logo, String category, int price, String publisher, Date publishedDate,
			int chapters, boolean active) {
		super();
		this.bookTitle = bookTitle;
		this.logo = logo;
		this.category = category;
		this.price = price;
		this.publisher = publisher;
		this.publishedDate = publishedDate;
		this.chapters = chapters;
		this.active = active;
	}

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", bookTitle=" + bookTitle + ", logo=" + logo + ", category=" + category
				+ ", price=" + price + ", publisher=" + publisher + ", publishedDate=" + publishedDate + ", chapters="
				+ chapters + ", active=" + active + "]";
	}

}