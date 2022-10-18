package com.rakuten.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rakuten.dto.Book;

public class BookModel {
public boolean addBook(Book book){
	boolean flag = false;
	
	Integer id = book.getId();
	String nameOfBook = book.getNameOfBook();
	String bookPdfUplode = book.getBookPdfUplode();
	String bookImage = book.getBookImage();
	double bookPrice = book.getBookPrice();
	String bookAuthor = book.getBookAuthor();
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineBookStore", "root", "root");
		PreparedStatement ps = con.prepareStatement("insert into book(nameOfBook, bookPdfUplode, bookImage, bookPrice, bookAuthor) values (?, ?, ?, ?, ?)");
		ps.setString(1, nameOfBook);
		ps.setString(2, bookPdfUplode);
		ps.setString(3, bookImage);
		ps.setDouble(4, bookPrice);
		ps.setString(5, bookAuthor);
		int row = ps.executeUpdate();
		if(row>0){
			flag = true;
		}
		con.close();
	}
	catch(ClassNotFoundException cnfe){
		cnfe.printStackTrace();
		
	}
	catch(SQLException se){
		se.printStackTrace();
	}
	
	return flag;
}
public Book findByName(String bookName){
	Book book = null;
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineBookStore", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from book where nameOfBook = ?");
		ps.setString(1, bookName);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			String bookPdfUplode = rs.getString("bookPdfUplode");
			String bookImage = rs.getString("bookImage");
			String bookPrice = rs.getString("bookPrice");
			String bookAuthor = rs.getString("bookAuthor");
			book = new Book();
			book.setBookPdfUplode(bookPdfUplode);
			book.setBookImage(bookImage);
			Double bp = Double.parseDouble(bookPrice);
			book.setBookPrice(bp);
			book.setBookAuthor(bookAuthor);
			book.setNameOfBook(bookName);
			
}
		con.close();
	}
	catch(ClassNotFoundException cnfe){
		cnfe.printStackTrace();
	}
	catch(SQLException se){
		se.printStackTrace();
	}
	
	return book;
}
public boolean deleteBook(String nameOfBook){
	boolean flag = false;
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineBookStore", "root", "root");
		PreparedStatement ps = con.prepareStatement("Delete from book where nameOfBook = ?");
		ps.setString(1, nameOfBook);
		int row = ps.executeUpdate();
		if(row>0){
			flag=true;
		}
		con.close();
	}
	catch(ClassNotFoundException cnfe){
		cnfe.printStackTrace();
	}
	catch(SQLException se){
		se.printStackTrace();
	}
	return flag;
	
}
public boolean UpdateBook(Book book2){
	boolean flag = false;
	
	String nameOfBook = book2.getNameOfBook();
	String bookPdfUplode = book2.getBookPdfUplode();
	String bookImage = book2.getBookImage();
	double bookPrice = book2.getBookPrice();
	String bookAuthor = book2.getBookAuthor();
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineBookStore", "root", "root");
		PreparedStatement ps = con.prepareStatement("Update book set bookPdfUplode = ?, bookImage = ?, bookPrice = ?, bookAuthor = ? where nameOfBook = ?");
		ps.setString(1, bookPdfUplode);
		ps.setString(2, bookImage);
		ps.setDouble(3, bookPrice);
		ps.setString(4, bookAuthor);
		ps.setString(5, nameOfBook);
		int row  = ps.executeUpdate();
		if(row>0){
			flag = true;
		}
		con.close();
	}
	catch(ClassNotFoundException cnfe){
		cnfe.printStackTrace();
	}
	catch(SQLException se){
		se.printStackTrace();
	}
	
	return flag;
}	
}
