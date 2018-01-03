package adressManagement;

import java.sql.SQLException;

public class testingClass {

public static void main(String args[]) throws ClassNotFoundException, SQLException 
{
	AdressInfo info = new AdressInfo("1234", 1, 5, 3, "Home");
	 AdressCreator creator = new AdressCreator();
	creator.registerAdress(info);
	}
}
