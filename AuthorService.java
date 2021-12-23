package com.author.services;

import java.util.List;

import com.author.domain.AuthorListDomain;

public interface AuthorService{
	
	public List< AuthorListDomain > add(AuthorListDomain person);
	public List< AuthorListDomain > getallAuthorDetails();
	public List< AuthorListDomain >  remove(AuthorListDomain person);
	public void updateAuthorBooksCountDateDetails(AuthorListDomain person,int bookCount);
	public List<AuthorListDomain> sortByAuthorName();
	public List<AuthorListDomain> createTable();
}