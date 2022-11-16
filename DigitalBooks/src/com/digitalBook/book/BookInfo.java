package com.digitalBook.book;

import java.util.Date;

import com.digitalBook.author.AuthorInfo;

public class BookInfo {

	private String bookTitle;
	private String logo;
	private AuthorInfo authinfo;
	private String category;
	private int price;
	private String publisher;
	private Date publishedDate;
	private boolean active;

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

	public AuthorInfo getAuthinfo() {
		return authinfo;
	}

	public void setAuthinfo(AuthorInfo authinfo) {
		this.authinfo = authinfo;
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

	public Date getDate() {
		return publishedDate;
	}

	public void setDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public BookInfo(String bookTitle, String logo, AuthorInfo authinfo, String category, int price, String publisher, Date publishedDate, boolean active) {
		super();
		this.bookTitle = bookTitle;
		this.logo = logo;
		this.authinfo = authinfo;
		this.category = category;
		this.price = price;
		this.publisher = publisher;
		this.publishedDate = publishedDate;
		this.active = active;
	}

	public BookInfo() {
		super();
	}

	@Override
	public String toString() {
		return "BookInfo [bookTitle=" + bookTitle + ", logo=" + logo + ", authinfo=" + authinfo + ", category="
				+ category + ", price=" + price + ", publisher=" + publisher + ", publishedDate=" + publishedDate
				+ ", active=" + active + "]";
	}

}
