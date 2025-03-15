package com.studypedia;

public class JavaContructors {

	int modelYear;
	String modelName;
	public JavaContructors(int year,String name) {//create constructor
		modelYear=year;
		modelName=name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaContructors callConstructor=new JavaContructors(1969, "Mustang");//call the constructor
		System.out.println(callConstructor.modelYear+" "+callConstructor.modelName);
	}

}
