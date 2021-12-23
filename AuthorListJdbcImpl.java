package com.authorImpl.services;

import java.util.List;

import com.author.domain.AuthorListDomain;
import com.author.services.AuthorService;

public class AuthorListJdbcImpl implements AuthorService {

	AuthorServiceJdbcUtil author = new AuthorServiceJdbcUtil();
	
	@Override
	public List<AuthorListDomain> add(AuthorListDomain person) {
		// TODO Auto-generated method stub
		try {
		
			author.insertValues(person);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

	@Override
	public List<AuthorListDomain> getallAuthorDetails() {
		// TODO Auto-generated method stub
		try {
			author.authorDetailsList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public void updateAuthorBooksCountDateDetails(AuthorListDomain person, int bookCount) {
		// TODO Auto-generated method stub
		try {
			author.updateValues();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public List<AuthorListDomain> remove(AuthorListDomain person) {
		// TODO Auto-generated method stub
		try {
			author.deleteValues();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<AuthorListDomain> sortByAuthorName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AuthorListDomain> createTable() {
		// TODO Auto-generated method stub
		try {
			author.createTable();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


}
