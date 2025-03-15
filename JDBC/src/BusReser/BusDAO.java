package BusReser;

import java.sql.*;

public class BusDAO {

	public static void  DisplayBusInfo() throws SQLException {
		String queryString="select*from bus";
		
		Connection connection= DBConnection.GetConnection();
	    Statement statement=connection.createStatement();
	    ResultSet resultSet=statement.executeQuery(queryString);
	    
	    while(resultSet.next()) {
	    	System.out.println("Bus no:"+resultSet.getInt(1));
	    	if(resultSet.getInt(2)==1) {
	    		System.out.println("AC");
	    	}
	    	else {
	    		System.out.println("NON-AC");
	    	}
	    	System.out.println("Capacity:"+resultSet.getInt(3));
	    }
	    
	    System.out.println("--------------------------------------------------");
	}
	
	public static int getCapacity(int busNO) throws SQLException {
        String queryString="select Capacity from bus where busNo="+busNO;
		
		Connection connection= DBConnection.GetConnection();
	    Statement statement=connection.createStatement();
	    ResultSet resultSet=statement.executeQuery(queryString);
	    resultSet.next();
	    
	   return resultSet.getInt(1);
	}
}
