package com.mycodes;

class Fiction extends Book {
	     String genre;
         
	     void genre(String genre) {
	        this.genre = genre;
	    }

	    @Override
	    void displayDetails() {
	        System.out.println("Genre: " + genre);
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("ISBN: " + ISBN);
	      
	    }
	}

