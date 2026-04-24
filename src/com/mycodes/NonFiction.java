package com.mycodes;

class NonFiction extends Book {
	    String subject;

	    void setSubject(String subject) {
	        this.subject = subject;
	    }

	    @Override
	    void displayDetails() {
	        System.out.println("Subject: " + subject);
	        System.out.println("Author: " + author);
	        System.out.println("ISBN: " + ISBN);     
	    }
	}

