package com.mycodes;

public class Emp {
	
	Emp()
	{
		System.out.println("Zero-Param cons");
	}
	Emp(String s) 
	{
		System.out.println("string-Param cons");
	}
	Emp(int a)
	{
		System.out.println("int-Param cons");
	}

		public static void main(String[] args)
		{
		  Emp e1=new Emp("4231");
		  Emp e2=new Emp("132");
		  
		}

	}


