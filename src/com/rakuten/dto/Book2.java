package com.rakuten.dto;

import com.rakuten.execptions.DataInvalidExecption;

public class Book2 extends BaseBean {
private String nameOfBook;	
private String bookPdfUplode;
private String bookImage;
private double bookPrice;
private String bookAuthor;
public String getNameOfBook() {
	return nameOfBook;
}
public void setNameOfBook(String nameOfBook) {
	if(nameOfBook.length()<3){
		throw new DataInvalidExecption("name should be grater than 3 later");
	}
	this.nameOfBook = nameOfBook;
}
public String getBookPdfUplode() {
	return bookPdfUplode;
}
public void setBookPdfUplode(String bookPdfUplode) {
	this.bookPdfUplode = bookPdfUplode;
}
public String getBookImage() {
	return bookImage;
}
public void setBookImage(String bookImage) {
	this.bookImage = bookImage;
}
public double getBookPrice() {
	return bookPrice;
}
public void setBookPrice(double bookPrice) {
	this.bookPrice = bookPrice;
}
public String getBookAuthor() {
	if(bookAuthor.length()<3){
		throw new DataInvalidExecption("name should be grater than 3 latter");
	}
	return bookAuthor;
}
public void setBookAuthor(String bookAuthor) {
	this.bookAuthor = bookAuthor;
}

}
