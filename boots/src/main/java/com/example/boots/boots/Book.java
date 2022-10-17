package com.example.boots.boots;

public class Book {
  private int id;
  private String name;
  private String author;
  
  public Book(int newId , String newName, String newAuthor){
	  id= newId;
	  name= newName;
	  author =  newAuthor;
  }

public int getId() {
	return id;
}

public String getName() {
	return name;
}

public String getAuthor() {
	return author;
}

@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
}
  
  
}
