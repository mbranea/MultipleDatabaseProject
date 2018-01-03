package adressManagement;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;



public class AdressCreator {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/client-side";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "1234";
	   
	   
	  
	   
	   public boolean registerAdress(AdressInfo info) throws ClassNotFoundException, SQLException 
	   {
		   
	   Connection conn = null;
	   PreparedStatement stmt = null;
	
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);

	      //STEP 4: Execute a query
	      System.out.println("Creating statement...");
	    
	      String sql1;
	      sql1 = "INSERT INTO adrese_inregistrate (id_cartier, id_client, nume_adresa, nr_strada, tip_adresa)\r\n" + 
	      		"VALUES (?,?,?,?,?)";
	      stmt = conn.prepareStatement(sql1);
	      stmt.setInt(1, info.getArea_id());
	      stmt.setInt(2, info.getClient_id());
	      stmt.setString(3, info.getName());
	      stmt.setInt(4, info.getStreet_nr());
	      stmt.setString(5, info.getAdress_type());
	      stmt.executeUpdate();
	      
	      
	     
	      stmt.close();
	      conn.close();
	   
	   System.out.println("Goodbye!");
	   return true;

}
	
}


