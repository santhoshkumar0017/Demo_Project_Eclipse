package com.studypedia;

public class Stringjava {

	public static void main(String[] args) {
	 
		
		//Find Length in String
		String name="Santhoshkumar";
		System.out.println(name.length());
		
		//Convert Upper case and Lower case
        String helloString=("Hello World");
        System.out.println(helloString.toUpperCase());
        System.out.println(helloString.toLowerCase());
        
        //Find String Index
        String sentence=("Please Locate Where It's");
        System.out.println(sentence.indexOf("Locate"));
        
        //Concatenation method one
        String firstName="John";
        String lastName="Doe";
        System.out.println(firstName+" "+lastName);
        //Concatenation method two
        String fName="John ";
        String lName="Doe";
        System.out.println(fName.concat(lName));
        
        //String Special Characters
        String txt="We are the so called \"Vikings\" from north";//double quotes
        String txt1="We are the so called \'Vikings\' from north";//single quote
        String txt2="This is the Character \\ called backslash";//backslash
        System.out.println(txt);
        System.out.println(txt1);
        System.out.println(txt2);
	}

}
