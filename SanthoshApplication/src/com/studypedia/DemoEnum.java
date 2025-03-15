package com.studypedia;

enum Levels{
		LOW ,
		Medium,
		HIGH
}


public class DemoEnum {
 public static void main(String[] args) {
	Levels myVar=Levels.Medium;
	
	switch (myVar) {
	case 	LOW: {		
	System.out.println("Low level");
	break;
	}
	case 	Medium: {		
		System.out.println("Medium level");
		break;
		}
	case 	HIGH: {		
		System.out.println("High level");
		break;
		}
	default:
		throw new IllegalArgumentException("Unexpected value: "  );
	}
	for(Levels lvl:Levels.values()) {
		System.out.println(lvl);
	}
}
}
