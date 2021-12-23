package com.authorImpl.services;

import java.sql.*;
import java.time.LocalDate;

import com.author.domain.AuthorListDomain;

//import java.time.LocalDate;

public class AuthorServiceJdbcUtil  {

	String url = "Jdbc:mysql://localhost:3306/author_details";
	String userName = "root";
	String password = "12345";
	Statement statement;
	Connection connection;
	
	public void getConnection() throws SQLException {
		
		connection = DriverManager.getConnection(url,userName,password);
		System.out.println("connected");
		statement = connection.createStatement();
		System.out.println("create statement platform");
	}
	
	public void createTable() throws Exception{
			getConnection();
			statement.executeUpdate("create table authortable(id int, Author_name  varchar(255), Birth_year  int, Birth_place  varchar(255), Theme  varchar(20), Books_published_count  int)");
				
			System.out.println("author information table created");
		
	}
	
	
	public void insertValues(AuthorListDomain person) throws Exception{
		getConnection();
		int authorId = (int) person.getAuthorId();
		String authorName = person.getAuthorName();
		int born = (int)person.getBorn();
		String bornLocation = person.getBornLocation();
		String theme = person.getTheme();
		int numberOfBooksPublished = (int) person.getNumberOfBooksPublished();
		//LocalDate publishDate =(LocalDate) person.getPublishDate();
		String query = "insert into authortable Values(' " + authorId +" ',' " +  authorName + " ',' " + born + " ',' " + bornLocation + " ',' " + theme + " ', " + numberOfBooksPublished + ")";
		statement.executeUpdate(query);	
		
		System.out.println("values inserted in author table"); 
	
   }
   
	public void updateValues() throws Exception{
		getConnection();
		
		statement.executeUpdate("update authortable set Books_published_count = 20 where id =1");	
		
		System.out.println("update Birth_year in authortable"); 
	
   }
	
	public ResultSet authorDetailsList() throws Exception{
		getConnection();
		
		ResultSet rs = null;
		try {
			rs = statement.executeQuery("select * from authortable");
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
		
   }
	
	public void deleteValues() throws Exception{
		getConnection();
		statement.executeUpdate("delete from authortable where id=3");
		
		System.out.println("delete Books_published_count in authortable");
	
   }
	
	
}
