package Using_Prepared_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Get_Employee {
	public static void main(String[] args) {

		try {
			// load or register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// establish the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgelaz_employees","root","root");

			// establish the statement
			PreparedStatement pst = con.prepareStatement("select * from employee");

			//execute the statement
			ResultSet resultSet = pst.executeQuery();

			while(resultSet.next())
			{
				System.out.println(" eId "+resultSet.getInt(1));
				System.out.println(" eName "+resultSet.getString(2));
				System.out.println(" eSalary "+resultSet.getDouble(3));

				System.out.println("******************************");
			}


			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
}
