package com.studypedia;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DemoDataTime {
public static void main(String[] args) {
	//Date
	LocalDate myDate= LocalDate.now();
	System.out.println("Date: "+myDate);
	
	//Time
	LocalTime myTime=LocalTime.now();
	System.out.println("Time: "+myTime);
	
	//Date and Time
	LocalDateTime myDateTime=LocalDateTime.now();
	System.out.println("Date and Time: "+myDateTime);
	
	//Date and Time Formatter
	DateTimeFormatter formater=DateTimeFormatter.ofPattern("dd-MM-yyyy hh-mm-ss");
	String formatString=myDateTime.format(formater);
	System.out.println("After  formatting: "+formatString);
	
}

}
