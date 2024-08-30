package using_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Update_Employee {
	public static void main(String[] args) {

		try {
			// load or register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// establish the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgelaz_employees","root","root");

			// establish the statement
			Statement sts = con.createStatement();

			//execute the statement
			int num = sts.executeUpdate("update employee set eName='SeetaRamaRajuKalle' where eId=101");

			System.out.println(num+" rows updated ");


			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
