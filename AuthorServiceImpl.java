package com.author.services;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.author.domain.AuthorListDomain;


public class AuthorServiceImpl implements AuthorService {

		// TODO Auto-generated method stub
		List< AuthorListDomain > author = new ArrayList<AuthorListDomain>();

		@Override
		public List<AuthorListDomain> getallAuthorDetails() {
			// TODO Auto-generated method stub
			return author;
		}
		
		@Override
		public List< AuthorListDomain >  add(AuthorListDomain person) {
			// TODO Auto-generated method stub
			author.add(person);
			return author;
		}
		
		@Override
		public List< AuthorListDomain >  remove(AuthorListDomain person) {
			// TODO Auto-generated method stub
			author.remove(person);
			return author;
		}

		public void updateAuthorBooksCountDateDetails(AuthorListDomain person,int bookCount) {
			person.setNumberOfBooksPublished(bookCount);
			person.setupdateDate(LocalDate.now());
		}
		
		@Override
		public List<AuthorListDomain> sortByAuthorName() {
			// TODO Auto-generated method stub
			Collections.sort(author, new Comparator<AuthorListDomain>() { //implementing a comparator interface

				@Override
				public int compare(AuthorListDomain person1, AuthorListDomain person2) {
					// TODO Auto-generated method stub
					
					String name1 = (String)person1.getAuthorName();
					String name2 = (String)person2.getAuthorName();
					return name1.compareTo(name2);
				}
								
					});
			
			return author;
		}

		@Override
		public List<AuthorListDomain> createTable() {
			// TODO Auto-generated method stub
			return author;
		}
		

		
}
