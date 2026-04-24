package com.mycodes;

public class Emp2 {
	
	int empno;
	String ename;
	Emp2(int empno, String ename){
		this.empno=empno;
		this.ename=ename;
	}
	
	public static void main(String[] args) {
		
		Emp2 e1=new Emp2(1120,"Harsha");
		System.out.println(e1.ename+"  "+e1.empno);
		
		Emp2 e2=new Emp2(2150,"Chetan");
		System.out.println(e2.ename+"  "+e2.empno);
	}

}
