package BusReser;

import java.sql.*;
import java.util.Date;

public class BookingDAO {

	public static int getBookingCount(int busNo,Date date) throws SQLException {
		String query = "select count(passenger_name) from booking where bus_no=? and travel_date=?";
		Connection con = DBConnection.GetConnection();
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		pst.setInt(1, busNo);
		pst.setDate(2, sqldate);
		ResultSet rs = pst.executeQuery();
		rs.next();
		return rs.getInt(1);
	}
	
	public static void addBooking(Booking booking) throws SQLException {
		String queryString="insert into booking values(?,?,?)";
		Connection connection=DBConnection.GetConnection();
	    PreparedStatement pst=connection.prepareStatement(queryString);
	    pst.setString(1, booking.passengerName);
	    pst.setInt(2, booking.busNo);
	    java.sql.Date sqlDate=new java.sql.Date(booking.date.getTime());
	    pst.setDate(3, sqlDate);
	    
	    pst.executeUpdate();
	}
}
