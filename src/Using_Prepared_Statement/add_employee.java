package Using_Prepared_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class add_employee {
	public static void main(String[] args) {


		try {
			// load or register driver
			Driver d = new Driver();
			DriverManager.registerDriver(d);
			// establish the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgelaz_employees","root","root");

			// establish the statement
			PreparedStatement pst = con.prepareStatement("insert into employee values(?,?,?)");

			pst.setInt(1,103);
			pst.setString(2,"purnachandra");
			pst.setDouble(3,35000.00);

			//execute the statement
			boolean execute = pst.execute();
			if(!execute)
			{
				System.out.println(" data entered successfully ");
			}
			else
			{
				System.out.println(" data not stored ");
			}

			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}





	}
}
