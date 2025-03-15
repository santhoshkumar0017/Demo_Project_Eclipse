package BusReser;

import java.sql.*;

public class DBConnection {

	private static final String urlString="jdbc:mysql://localhost:3306/Busres";
	private static final String nameString="root";
	private static final String passWordString="2003";
	
	public static Connection GetConnection () throws SQLException{
		return DriverManager.getConnection(urlString,nameString,passWordString);
	}
}
