package using_statement;

import java.sql.Connection;
import java.sql.DriverManager;
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
			Statement sts = con.createStatement();

			//execute the statement
			boolean execute = sts.execute("insert into employee values(101,'seetaramaraju',28000.00)");
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
