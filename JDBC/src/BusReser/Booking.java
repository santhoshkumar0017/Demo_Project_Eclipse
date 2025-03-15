package BusReser;

import java.sql.SQLException;
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
	public boolean isAvailable() throws SQLException {
		BusDAO busDAO=new BusDAO();
		BookingDAO bookingDAO =new BookingDAO();
		int capacity=busDAO.getCapacity(busNo);
		int booking=bookingDAO.getBookingCount(busNo,date);
		
		return booking<capacity;
	}
}
