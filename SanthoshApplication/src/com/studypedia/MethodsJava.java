package com.studypedia;

public class MethodsJava {

	static int additionMethod(int x,int y) {
		return x+y;
	}
	static float additionMethod(float x,float y) {
		return x+y;
	}
	static void myName(String name) {
		System.out.println(name);
	}
	public static void main(String[] args) {
	
		int i=additionMethod(2,9);
		float j=additionMethod(4.5f,8.5f);
		System.out.println(i);
		System.out.println(j);
		myName("Santhoshkumar");
	}

}
