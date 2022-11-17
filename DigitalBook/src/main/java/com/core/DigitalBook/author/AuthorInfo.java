package com.core.DigitalBook.author;

public class AuthorInfo {

	private String authorName;
	private int authorId;

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public AuthorInfo(String authorName, int authorId) {
		super();
		this.authorName = authorName;
		this.authorId = authorId;
	}

	public AuthorInfo() {
		super();
	}

	@Override
	public String toString() {
		return "AuthorInfo [authorName=" + authorName + ", authorId=" + authorId + "]";
	}

}
