package com.studypedia;

public class ClassMethods {
	static void myStaticFunc() {
		System.out.println("Static method can call without creating obj");
	}
	public void myPublicFunc() {
		System.out.println("Public method can call with  creating obj");
	}
	public void fullThrottleFunc() {
		System.out.println("The car is going as fast as it can!");
	}
    public void maxSpeedFunc(int maxSpeed) {
    	System.out.println("Max car speed: "+maxSpeed);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myStaticFunc();
		ClassMethods myobj=new ClassMethods();
		myobj.myPublicFunc();
		

	}

}
