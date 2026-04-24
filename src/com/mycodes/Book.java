package com.mycodes;

class Book {
	    String title;
	    String author;
	    String ISBN;

    
    void setTitle(String title) {
        this.title = title;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

     void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
}
