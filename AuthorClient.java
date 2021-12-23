package com.author.client;

import java.time.LocalDate;

import com.author.domain.AuthorListDomain;
import com.author.services.AuthorService;
import com.author.services.AuthorServiceImpl;
import com.authorImpl.services.AuthorListJdbcImpl;

public class AuthorClient {

	public static void main(String[] args) {

		// create person one object
		AuthorListDomain person1 = new AuthorListDomain(" StepenKing", 1968, " Portland,UnitedStates", " Mystery", 10, LocalDate.of(2018, 8, 12), 1);

		AuthorListDomain person2 = new AuthorListDomain(" JohnRubino", 1965, " Kanto,Japan", " Losinghope", 15, LocalDate.of(2018, 10, 19), 2);
 
		AuthorListDomain person3 = new AuthorListDomain(" JamesTrunk", 1972, " Moscow,Russia", " Thriller", 12, LocalDate.of(2019, 6, 10), 3);
		
		AuthorListDomain person4 = new AuthorListDomain(" JamesTrunk", 1972, " Moscow,Russia", " Thriller", 18, LocalDate.of(2019, 6, 10), 4);

		AuthorService authorService = new AuthorListJdbcImpl();

		//authorService.add(person1);

		//authorService.add(person2);

		//authorService.add(person3);

		// calling the get details method
		//System.out.println("before sorting");
		//System.out.println(authorService.getallAuthorDetails());

		// update books count and date
		// authorService.updateAuthorBooksCountDateDetails(person3,13);
		// System.out.println(person3);

		/*/System.out.println();
		System.out.println("after sorting");
		System.out.println(authorService.sortByAuthorName());*/

		//System.out.println(authorService.createTable());
		System.out.println(authorService.add(person1));
		//System.out.println(authorService.getallAuthorDetails());
		//System.out.println(authorService.remove(person1));
	}

}
