package BusReservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {

	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter PassengerName");
		passengerName=scanner.next();
		System.out.println("Enter Bus no:");
		busNo=scanner.nextInt();
		System.out.println("Enter Date dd-mm-yyyy");
		String dateString=scanner.next();
		SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateFormat.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses) {
		int capacity=0,booking=0;
		for(Bus bus:buses) {
			if(bus.getBusNo()==busNo) {
				capacity=bus.getCapacity();
			}
		}
		
		for(Booking b:bookings) 
		{
			if(b.busNo==busNo&&b.date.equals(date)) {
				booking++;
			}
		}
		
		return booking<capacity?true:false;
	}
}
