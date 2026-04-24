package com.mycodes;

public class Pen {
	String color;
	Pen(){
		color="Blue";
	}
	
	public static void main(String[] args) {
		Pen p1= new Pen();
		System.out.println(p1.color);
		
		Pen p2= new Pen();
		System.out.println(p2.color);
	}

}
