package BusReser;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

	public static void main(String[] args) throws SQLException {

		BusDAO busDAO=new BusDAO();
		busDAO.DisplayBusInfo();
		
		int userOpt=1;
		Scanner scanner=new Scanner(System.in);
		while(userOpt==1) {
			System.out.println("Enter 1 to book and 2 exit");
			userOpt=scanner.nextInt();
			if(userOpt==1) {
				Booking booking =new Booking();
				if(booking.isAvailable()) {
					BookingDAO bookingDAO=new BookingDAO();
				bookingDAO.addBooking(booking);
					System.out.println("Your booking is confirmed");
				}
				else {
					System.out.println("Sorry Bus is full try another bus or date");
				}
			}
			
		}
		scanner.close();

	}

}
