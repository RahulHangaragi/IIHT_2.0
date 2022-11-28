package com.digitalbooks.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookAuthor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer authorId;
	private String authorName;
	private Integer BookId;
	private String bookTitle;
	private String logo;
	private String category;
	private double price;
	private String publisher;
	private LocalDate publishedDate;
	private int chapters;
	private boolean active;

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public LocalDate getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(LocalDate publishedDate) {
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

	public BookAuthor(Integer authorId, String authorName, Integer bookId, String bookTitle, String logo,
			String category, double price, String publisher, LocalDate publishedDate, int chapters, boolean active) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
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

	public BookAuthor(String authorName, Integer bookId, String bookTitle, String logo, String category, double price,
			String publisher, LocalDate publishedDate, int chapters, boolean active) {
		super();
		this.authorName = authorName;
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

	public BookAuthor() {
		super();
	}

	@Override
	public String toString() {
		return "BookAuthor [authorId=" + authorId + ", authorName=" + authorName + ", BookId=" + BookId + ", bookTitle="
				+ bookTitle + ", logo=" + logo + ", category=" + category + ", price=" + price + ", publisher="
				+ publisher + ", publishedDate=" + publishedDate + ", chapters=" + chapters + ", active=" + active
				+ "]";
	}

}