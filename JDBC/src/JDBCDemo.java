import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) throws Exception {
		BatchcommitDemo();
	}
	public static void ReadRecord() throws Exception{

		 String urlString="jdbc:mysql://localhost:3306/JDBCDemo";
	        String nameString="root";
	        String passWordString="2003";
	        String queryString="select* from student";
			Connection  con=DriverManager.getConnection(urlString,nameString,passWordString);
			Statement st= con.createStatement();
			ResultSet resultSet= st.executeQuery(queryString);
			
			while(resultSet.next()) {
			System.out.println("Id is:"+resultSet.getInt(1));
			System.out.println("Name is:"+resultSet.getString(2));
			System.out.println("CGPA is:"+resultSet.getFloat(3));
			}
			con.close();
			
	}
	public static void InsertRecord() throws Exception{
		
		    String urlString="jdbc:mysql://localhost:3306/JDBCDemo";
	        String nameString="root";
	        String passWordString="2003";
	        String queryString="insert into student values(2,'Ashwin',8.0)";
			Connection  con=DriverManager.getConnection(urlString,nameString,passWordString);
			Statement st= con.createStatement();
			int updateNo= st.executeUpdate(queryString);
			System.out.println("No of rows affected:"+updateNo);
			con.close();
			
		
	}
	public static void InsertVarRecord() throws Exception{
		
		 String urlString="jdbc:mysql://localhost:3306/JDBCDemo";
	        String nameString="root";
	        String passWordString="2003";
	        
	        int id=3;
	        String name="Balaji";
	        float cgpa=8.3f;
	        
	        String queryString="insert into student values("+id+",'"+name+"',"+cgpa+");";
			Connection  con=DriverManager.getConnection(urlString,nameString,passWordString);
			Statement st= con.createStatement();
			int updateNo= st.executeUpdate(queryString);
			System.out.println("No of rows affected:"+updateNo);
			con.close();
			
		
	}

	public static void InsertPreRecord() throws Exception{
		
		 String urlString="jdbc:mysql://localhost:3306/JDBCDemo";
	        String nameString="root";
	        String passWordString="2003";
	      
	        int id=4;
	        String name="Krithika";
	        float cgpa=7.5f;
	        
	        String queryString="insert into student values(?,?,?)";
	        
			Connection  con=DriverManager.getConnection(urlString,nameString,passWordString);
			PreparedStatement pst=con.prepareStatement(queryString);
		    pst.setInt(1, id);
			pst.setString(2, name);
			pst.setFloat(3, cgpa);
			int row=pst.executeUpdate();
			System.out.println("No of rows affected:"+row);
			con.close();
			
		
	}
	public static void DeleteRecord() throws Exception{
		
		 String urlString="jdbc:mysql://localhost:3306/JDBCDemo";
	        String nameString="root";
	        String passWordString="2003";
	      
	        int id=4;
	        String queryString="delete from student where id=?";
	        
			Connection  con=DriverManager.getConnection(urlString,nameString,passWordString);
			PreparedStatement pst=con.prepareStatement(queryString);
		    pst.setInt(1, id);
			int row=pst.executeUpdate();
			System.out.println("No of rows affected:"+row);
			con.close();	
	}

	public static void CallSimpleProcedure() throws Exception{
		String urlString="jdbc:mysql://localhost:3306/JDBCDemo";
		String name="root";
		String passString="2003";
		
		Connection con=DriverManager.getConnection(urlString,name,passString);
	    CallableStatement cs = con.prepareCall("{call GetStudent()}");
	    ResultSet rsResultset=cs.executeQuery();
	    while(rsResultset.next()) {
	    	System.out.println("Id is:"+rsResultset.getInt(1));
	    	System.out.println("Name is:"+rsResultset.getString(2));
	    	System.out.println("CGPA is:"+rsResultset.getInt(3));
	    }
	    con.close();
	}
    
	public static void CallParentheseProcedure() throws Exception{
		String urlString="jdbc:mysql://localhost:3306/JDBCDemo";
		String name="root";
		String passString="2003";
		
		int id=2;
		Connection con=DriverManager.getConnection(urlString,name,passString);
	    CallableStatement cs = con.prepareCall("{call GetStudentID(?)}");
	    cs.setInt(1, id);
	    
	    ResultSet rsResultset=cs.executeQuery();
	    while(rsResultset.next()) {
	    	System.out.println("Id is:"+rsResultset.getInt(1));
	    	System.out.println("Name is:"+rsResultset.getString(2));
	    	System.out.println("CGPA is:"+rsResultset.getInt(3));
	    }
	    con.close();
	}


	public static void CallParentheseOutProcedure() throws Exception{
		String urlString="jdbc:mysql://localhost:3306/JDBCDemo";
		String name="root";
		String passString="2003";
		int id=1;
		
		Connection con=DriverManager.getConnection(urlString,name,passString);
	    CallableStatement cs = con.prepareCall("{call GetStdName(?,?)}");
	    cs.setInt(1, id);
	    cs.registerOutParameter(2, Types.VARCHAR);
	    
	    cs.executeUpdate();
	    
	    System.out.println(cs.getString(2));
	    con.close();
	}


	public static void CommitDemo() throws Exception{
		
	    String urlString="jdbc:mysql://localhost:3306/JDBCDemo";
        String nameString="root";
        String passWordString="2003";
        
        String queryString1="update employee set salary=500000 where emp_id=1";
        String queryString2="update employee set salary=500000 where emp_id=2";
        
		Connection  con=DriverManager.getConnection(urlString,nameString,passWordString);
		Statement st= con.createStatement();
		
		con.setAutoCommit(false);//auto commit false
		
		int row1= st.executeUpdate(queryString1);
		System.out.println("No of rows affected:"+row1);
		
		int row2= st.executeUpdate(queryString2);
		System.out.println("No of rows affected:"+row2);
		
		if(row1>0 && row2>0) {
			con.commit();// call the commit function
		}
		
		con.close();	
	
}
	

    public static void AutocommitDemo() throws Exception{
		
	    String urlString="jdbc:mysql://localhost:3306/JDBCDemo";
        String nameString="root";
        String passWordString="2003";
        
        String queryString1="update employee set salary=650000 where emp_id=1";
        String queryString2="update employee set salary=650000 where emp_id=2";
        
		Connection  con=DriverManager.getConnection(urlString,nameString,passWordString);
		Statement st= con.createStatement();
		
		int row1= st.executeUpdate(queryString1);
		System.out.println("No of rows affected:"+row1);
		
		int row2= st.executeUpdate(queryString2);
		System.out.println("No of rows affected:"+row2);
		
		con.close();	
}


    public static void BatchcommitDemo() throws Exception{
		
	    String urlString="jdbc:mysql://localhost:3306/JDBCDemo";
        String nameString="root";
        String passWordString="2003";
        
        String queryString1="update employee set salary=300000 where emp_id=1";
        String queryString2="update employee set salary=300000 where emp_id=2";
        String queryString3="update employee set salary=300000 where emp_id=3";
        String queryString4="update employee set salary=300000 where emp_id=4";
        
       
		Connection  con=DriverManager.getConnection(urlString,nameString,passWordString);
		Statement st= con.createStatement();
		con.setAutoCommit(false);
		
	   st.addBatch(queryString1);
	   st.addBatch(queryString2);
	   st.addBatch(queryString3);
	   st.addBatch(queryString4);
	   
	   int[]rows=st.executeBatch();
	   
	   for(int i:rows) {
		   if(i>0) {
			   
			   continue;
		   }
		   else {
			   con.rollback();
		   }
	   }
	   con.commit();
		con.close();	
}
    
    
}
  
