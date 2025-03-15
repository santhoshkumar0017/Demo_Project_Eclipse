package com.studypedia;

public class ClassAttribute {

	int x;
	int y=10;
	final int z=50;
	String fName="Santhoshkumar";
	String lName="M";
	int age=21;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassAttribute myObj1=new ClassAttribute();
	     myObj1.x=5;//Modify
	     myObj1.y=20;//override
	     System.out.println("X: "+myObj1.x);
	     System.out.println("Y: "+myObj1.y);
	   //  myObj1.z=100; cannot to be override because final keyword
	     ClassAttribute myObj2=new ClassAttribute();
	     myObj2.y=40;// multiple object
	     System.out.println("Y: "+myObj2.y);
	     System.out.println("Name: "+myObj2.fName+" "+myObj2.lName);
	     System.out.println("Age: "+myObj2.age);

	}

}
