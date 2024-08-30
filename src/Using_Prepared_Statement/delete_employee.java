package Using_Prepared_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class delete_employee {
	public static void main(String[] args) {

		try {
			// load or register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// establish the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgelaz_employees","root","root");

			// establish the statement
			PreparedStatement pst = con.prepareStatement("delete from employee where eId=103");

			//execute the statement
			int num = pst.executeUpdate();

			System.out.println(num+" rows updated ");


			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
