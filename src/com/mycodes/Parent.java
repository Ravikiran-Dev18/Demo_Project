package com.mycodes;

public class Parent {
	 
	Parent()
	{
		this(50);
		System.out.println("Zero-Parameter");
	}
	Parent (int a)
	{
		System.out.println("Int-Parameter");
	}
	
	public static void main(String[] args)
	{
		Parent p1=new Parent();
	}
	
}
	
	
