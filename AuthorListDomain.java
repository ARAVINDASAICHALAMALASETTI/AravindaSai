package com.author.domain;

import java.time.LocalDate;

public class AuthorListDomain {

	//private variable
	private int authorId;
	private String authorName;
	private int born;
	private String bornLocation;
	private String theme;
	private int numberOfBooksPublished;
	private LocalDate publishDate;
	private LocalDate updateDate;
	
	//constructor with arguments
	
	public AuthorListDomain(String authorName, int born, String bornLocation, String theme, int numberOfBooksPublished,
			LocalDate publishDate, int authorId) {
		
		this.authorId = authorId;
		this.authorName = authorName;
		this.born = born;
		this.bornLocation = bornLocation;
		this.theme = theme;
		this.numberOfBooksPublished = numberOfBooksPublished;
		this.publishDate = publishDate;
		
	}


	// use setter and getter methods
	public int getAuthorId() {
		return authorId;
	}


	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public int getBorn() {
		return born;
	}


	public void setBorn(int born) {
		this.born = born;
	}


	public String getBornLocation() {
		return bornLocation;
	}


	public void setBornLocation(String bornLocation) {
		this.bornLocation = bornLocation;
	}


	public String getTheme() {
		return theme;
	}


	public void setTheme(String theme) {
		this.theme = theme;
	}


	public int getNumberOfBooksPublished() {
		return numberOfBooksPublished;
	}


	public void setNumberOfBooksPublished(int numberOfBooksPublished) {
		this.numberOfBooksPublished = numberOfBooksPublished;
	}


	public LocalDate getPublishDate() {
		return publishDate;
	}


	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	
	public LocalDate getupdateDate() {
		return updateDate;
	}


	public void setupdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}
	
	
	@Override
	public String toString() {
		return "AuthorsList [authorId= " + authorId +",+authorName=" + authorName + ", born=" + born + ", bornLocation=" + bornLocation
				+ ", theme=" + theme + ", numberOfBooksPublished=" + numberOfBooksPublished + ", publishDate="
				+ publishDate + "]";
	}
		
}

