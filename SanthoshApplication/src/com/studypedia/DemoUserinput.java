package com.studypedia;

import java.util.Scanner;

public class DemoUserinput {
public static void main(String[] args) {
	
	Scanner myScanner=new Scanner(System.in);
	System.out.println("Enter name , age ,salary");
	String name=myScanner.nextLine();
	int age=myScanner.nextInt();
	Double salary=myScanner.nextDouble();
	System.out.println("Name: "+name);
	System.out.println("age :"+age);
	System.out.println("salary: "+salary);
}
}
