package com.mycodes;

public class SD {
	
	String sname;
	String sbranch;
	
	SD(String sname, String sb){
		
		this.sname=sname;
		this.sbranch=sb;
	}
	
	public static void main(String[] args) {
		
		SD s1=new SD("Chetan" , "CS");
		System.out.println(s1.sname+"  "+ s1.sbranch);
		
	}

}
