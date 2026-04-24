package com.mycodes;

public class Test {
	
	public static void main(String[] args) {
		Fiction f = new Fiction();
		f.title="Stranger Things";
		f.author="Brothers";
		f.ISBN="BE221";
		f.genre="mystery";
		f.displayDetails();
		
		System.out.println("----------------------\n");
		
		NonFiction n = new NonFiction();
		n.subject="Java";
		n.author="Jemes Goshling";
		n.ISBN="BE222";
		n.displayDetails();	
		
	}

}
